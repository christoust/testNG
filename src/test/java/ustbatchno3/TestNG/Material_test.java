package ustbatchno3.TestNG;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

public class Material_test {
	@Test
	public void test()
	{
		List<Material_customer> m = new ArrayList<Material_customer>();
		m.add(new Material_customer("Chris", 100, 10, "Cochin"));
		
		int [] a = {18000,1200};
		assertEquals(a, Test1.price_cal(m));
	}

}
