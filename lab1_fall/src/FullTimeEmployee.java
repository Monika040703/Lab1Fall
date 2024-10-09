public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);
    }

    @Override
    public void clockIn() {
        System.out.println(name + " clocked in (Full-Time).");
    }

    @Override
    public void clockOut() {
        System.out.println(name + " clocked out (Full-Time).");
    }

    @Override
    public void trackWorkHours() {
        System.out.println(name + " has tracked " + workingHoursPerWeek + " hours.");
    }
}


