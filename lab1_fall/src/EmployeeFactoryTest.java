import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeFactoryTest {

    @Test
    public void testCreateFullTimeEmployee() {
        Employee emp = EmployeeFactory.createEmployee("FullTime", 1, "John Doe", "IT", "Developer", 40, 70000);

        assertTrue(emp instanceof FullTimeEmployee);
        assertEquals("John Doe", emp.name);
    }

    @Test
    public void testCreatePartTimeEmployee() {
        Employee emp = EmployeeFactory.createEmployee("PartTime", 2, "Jane Smith", "HR", "Recruiter", 20, 35000);

        assertTrue(emp instanceof PartTimeEmployee);
        assertEquals("Jane Smith", emp.name);
    }
}
