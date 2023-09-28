package service.employee;

/** Interface for Data Access Objects. */
public interface EmployeeRepository {

    /**
     * Create a new employeeRepository instance using one of the two implementations
     * {@link EmployeeRepositoryImpl} or {@link EmployeeRepositoryImplDB} depending
     * on the specified driver type.
     * @param driverType Represents the driver type. It can be Array or Oracle.
     * @param config Contains the application configuration specified in the
     * <code>application.yaml</code> file.
     * @return The employee repository implementation.
     */
    static EmployeeRepository create(String driverType, Config config) {
        switch (driverType) {
            case "Array":
                return new EmployeeRepositoryImpl();
            case "Oracle":
                return new EmployeeRepositoryImplDB(config);
            default:
                // Array is default
                return new EmployeeRepositoryImpl();
        }

    }

    /**
     * Returns the list of the employees.
     * @return The collection of all the employee objects
     */
    List<Employee> getAll();

    /**
     * Returns the list of the employees that match with the specified lastName.
     * @param lastName Represents the last name value for the search.
     * @return The collection of the employee objects that match with the specified
     *         lastName
     */
    List<Employee> getByLastName(String lastName);

    /**
     * Returns the list of the employees that match with the specified title.
     * @param title Represents the title value for the search
     * @return The collection of the employee objects that match with the specified
     *         title
     */
    List<Employee> getByTitle(String title);

    /**
     * Returns the list of the employees that match with the specified department.
     * @param department Represents the department value for the search.
     * @return The collection of the employee objects that match with the specified
     *         department
     */
    List<Employee> getByDepartment(String department);

    /**
     * Add a new employee.
     * @param employee returns the employee object including the ID generated.
     * @return the employee object including the ID generated
     */
    Employee save(Employee employee); // Add new employee

    /**
     * Update an existing employee.
     * @param updatedEmployee The employee object with the values to update
     * @param id The employee ID
     * @return The employee updated.
     */
    Employee update(Employee updatedEmployee, String id);

    /**
     * Delete an employee by ID.
     * @param id The employee ID
     */
    void deleteById(String id);

    /**
     * Get an employee by ID.
     * @param id The employee ID
     * @return The employee object if the employee is found
     */
    Employee getById(String id);

    /**
     * Search an employee by ID.
     * @param id The employee ID
     * @return true if the employee is found or false if no match is found.
     */
    boolean isIdFound(String id);
}

