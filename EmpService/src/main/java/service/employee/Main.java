package service.employee;


public final class Main {

    /**
     * Cannot be instantiated.
     */
    private Main() {
    }

    /**
     * Application main entry point.
     * @param args command line arguments.
     * @throws IOException if there are problems reading logging properties
     */
    public static void main(final String[] args) throws IOException {
        startServer();
    }

    /**
     * Start the server.
     * @return the created {@link WebServer} instance
     * @throws IOException if there are problems reading logging properties
     */
    static WebServer startServer() throws IOException {

        // load logging configuration
        try (InputStream logFile = Main.class.getResourceAsStream("/logging.properties")) {
            LogManager.getLogManager().readConfiguration(logFile);
        }

        // By default this will pick up application.yaml from the classpath
        Config config = Config.create();

        // Get webserver config from the "server" section of application.yaml
        ServerConfiguration serverConfig = ServerConfiguration.create(config.get("server"));

        WebServer server = WebServer.create(serverConfig, createRouting(config));

        // Try to start the server. If successful, print some info and arrange to
        // print a message at shutdown. If unsuccessful, print the exception.
        server.start().thenAccept(ws -> {
            System.out.println("WEB server is up!");
            System.out.println("Web client at: http://localhost:" + ws.port()
                    + "/resources/public/index.html");
            ws.whenShutdown().thenRun(() -> System.out.println("WEB server is DOWN. Good bye!"));
        }).exceptionally(t -> {
            System.err.println("Startup failed: " + t.getMessage());
            t.printStackTrace(System.err);
            return null;
        });

        // Server threads are not daemon. No need to block. Just react.

        return server;
    }

    /**
     * Creates new {@link Routing}.
     * @return routing configured with JSON support, a health check, and a service
     * @param config configuration of this server
     */
    private static Routing createRouting(Config config) {

        MetricsSupport metrics = MetricsSupport.create();
        EmployeeService employeeService = new EmployeeService(config);
        HealthSupport health = HealthSupport.builder().add(HealthChecks.healthChecks())
                .build(); // Adds a convenient set of checks

        return Routing.builder().register(JsonBindingSupport.create())
                .register(health) // Health at "/health"
                .register(metrics) // Metrics at "/metrics"
                .register("/employees", employeeService)
                .register("/resources/public", StaticContentSupport.builder("resources/public").welcomeFileName("index.html")).build();
    }
