public class EMS {
    public static void main(String[] args) {
        // Employee Manager (Singleton)
        EmployeeManager manager = EmployeeManager.getInstance();

        // Using Factory to create employees
        Employee fullTimeEmployee = EmployeeFactory.createEmployee("FullTime", 1, "John Doe", "IT", "Developer", 40, 70000);
        Employee partTimeEmployee = EmployeeFactory.createEmployee("PartTime", 2, "Jane Smith", "HR", "Recruiter", 20, 35000);

        manager.addEmployee(fullTimeEmployee);
        manager.addEmployee(partTimeEmployee);

        // Using Builder to create employees
        EmployeeBuilder builder = new FullTimeEmployeeBuilder();
        EmployeeDirector director = new EmployeeDirector(builder);
        Employee builtEmployee = director.constructEmployee();
        manager.addEmployee(builtEmployee);

        // Simulate employee actions
        fullTimeEmployee.clockIn();
        partTimeEmployee.clockIn();
        builtEmployee.clockIn();
    }
}
