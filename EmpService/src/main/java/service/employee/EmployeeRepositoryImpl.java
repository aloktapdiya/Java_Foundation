package service.employee;
/**
 * Implementation of the {@link EmployeeRepository}. This implementation uses a
 * mock database written with in-memory ArrayList classes.
 * The strings id, name, and other search strings are validated before being
 * passed to the methods in this class.
 *
 */
public final class EmployeeRepositoryImpl implements EmployeeRepository {

    private final CopyOnWriteArrayList<Employee> eList = new CopyOnWriteArrayList<Employee>();

    /**
     * To load the initial data, parses the content of <code>employee.json</code>
     * file located in the <code>resources</code> directory to a list of Employee
     * objects.
     */
    public EmployeeRepositoryImpl() {
        JsonbConfig config = new JsonbConfig().withFormatting(Boolean.TRUE);

        Jsonb jsonb = JsonbBuilder.create(config);
        try (InputStream jsonFile = EmployeeRepositoryImpl.class.getResourceAsStream("/employees.json")) {
            Employee[] employees = jsonb.fromJson(jsonFile, Employee[].class);
            eList.addAll(Arrays.asList(employees));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> getByLastName(String name) {
        List<Employee> matchList = eList.stream().filter((e) -> (e.getLastName().contains(name)))
                .collect(Collectors.toList());

        return matchList;
    }

    @Override
    public List<Employee> getByTitle(String title) {
        List<Employee> matchList = eList.stream().filter((e) -> (e.getTitle().contains(title)))
                .collect(Collectors.toList());

        return matchList;
    }

    @Override
    public List<Employee> getByDepartment(String department) {
        List<Employee> matchList = eList.stream().filter((e) -> (e.getDepartment().contains(department)))
                .collect(Collectors.toList());

        return matchList;
    }

    @Override
    public List<Employee> getAll() {
        return eList;
    }

    @Override
    public Employee getById(String id) {
        Employee match;
        match = eList.stream().filter(e -> e.getId().equals(id)).findFirst().get();
        return match;
    }

    @Override
    public Employee save(Employee employee) {
        Employee nextEmployee = Employee.of(null, employee.getFirstName(), employee.getLastName(), employee.getEmail(),
                employee.getPhone(), employee.getBirthDate(), employee.getTitle(), employee.getDepartment());
        eList.add(nextEmployee);
        return nextEmployee;
    }

    @Override
    public Employee update(Employee updatedEmployee, String id) {
        deleteById(id);
        Employee e = Employee.of(id, updatedEmployee.getFirstName(), updatedEmployee.getLastName(),
                updatedEmployee.getEmail(), updatedEmployee.getPhone(), updatedEmployee.getBirthDate(),
                updatedEmployee.getTitle(), updatedEmployee.getDepartment());
        eList.add(e);
        return e;
    }

    @Override
    public void deleteById(String id) {
        int matchIndex;
        matchIndex = eList.stream().filter(e -> e.getId().equals(id)).findFirst().map(e -> eList.indexOf(e)).get();
        eList.remove(matchIndex);
    }

    @Override
    public boolean isIdFound(String id) {
        Employee match = null;
        match = eList.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(match);
        return (match != null);
    }

}