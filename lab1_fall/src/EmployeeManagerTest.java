import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeManagerTest {

    @Test
    public void testSingletonBehavior() {
        EmployeeManager manager1 = EmployeeManager.getInstance();
        EmployeeManager manager2 = EmployeeManager.getInstance();

        assertSame(manager1, manager2);
    }

    @Test
    public void testAddAndRetrieveEmployee() {
        EmployeeManager manager = EmployeeManager.getInstance();
        Employee emp = new FullTimeEmployee(1, "John Doe", "IT", "Developer", 40, 70000);
        manager.addEmployee(emp);

        assertEquals(emp, manager.getEmployee(1));
    }
}
