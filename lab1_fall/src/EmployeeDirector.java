public class EmployeeDirector {
    private EmployeeBuilder builder;
     // Builder Pattern
    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;
    }

    public Employee constructEmployee() {
        return builder.setId(1)
                      .setName("John Doe")
                      .setDepartment("IT")
                      .setRole("Developer")
                      .setWorkingHoursPerWeek(40)
                      .setSalary(70000)
                      .build();
    }
}
