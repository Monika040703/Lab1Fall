import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeDirectorTest {

    @Test
    public void testConstructEmployee() {
        EmployeeBuilder builder = new FullTimeEmployeeBuilder();
        EmployeeDirector director = new EmployeeDirector(builder);
        Employee emp = director.constructEmployee();

        assertNotNull(emp);
        assertEquals("John Doe", emp.name);
        assertEquals("IT", emp.department);
    }
}
