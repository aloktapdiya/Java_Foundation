package JavaThread;

class RunnableThreading implements Runnable {
    public void run()
    {
        try {
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

// Main Class
class RunnableThread {
    public static void main(String[] args)
    {
        int n = 10;
        for (int i = 0; i < n; i++) {
            Thread object
                    = new Thread(new RunnableThreading());
            object.start();
        }
    }
}
