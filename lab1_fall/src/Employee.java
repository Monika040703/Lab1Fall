public abstract class Employee {
    protected int id;
    protected String name;
    protected String department;
    protected String role;
    protected int workingHoursPerWeek;
    protected double salary;

    public Employee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
    }

    // Abstract methods
    public abstract void clockIn();
    public abstract void clockOut();
    public abstract void trackWorkHours();
}
