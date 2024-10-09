public class EmployeeFactory {
    public static Employee createEmployee(String type, int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        if (type.equalsIgnoreCase("FullTime")) {
            return new FullTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
        } else if (type.equalsIgnoreCase("PartTime")) {
            return new PartTimeEmployee(id, name, department, role, workingHoursPerWeek, salary);
        }
        return null;
    }
}
