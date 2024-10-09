import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
    // Singleton instance
    private static EmployeeManager instance;
    private Map<Integer, Employee> employees;

    private EmployeeManager() {
        employees = new HashMap<>();
    }

    // Singleton instance getter
    public static EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    // Methods to add, remove, and retrieve employees
    public void addEmployee(Employee employee) {
        employees.put(employee.id, employee);
    }

    public void removeEmployee(int id) {
        employees.remove(id);
    }

    public Employee getEmployee(int id) {
        return employees.get(id);
    }
}
