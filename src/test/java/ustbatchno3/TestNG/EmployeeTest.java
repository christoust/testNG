package ustbatchno3.TestNG;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class EmployeeTest {
	
	@Test
	public void testemp()
	{
	
	Employee e = new Employee("Christo",22,"CSE");
	assertEquals(e.getName(), "Christo");
	}
   
}
