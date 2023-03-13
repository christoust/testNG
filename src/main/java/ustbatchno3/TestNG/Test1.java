package ustbatchno3.TestNG;
import java.util.*;

public class Test1 {
	
	public static int[]  price_cal(List<Material_customer> b)
	{
		HashMap<String,List<Integer>> map = new HashMap<String,List<Integer>>();
		List<Integer> l2 =Arrays.asList(1800,1200);
		map.put("Cochin", l2);

		int z[] = new int[5];
//		int total_price=0;
		for(Material_customer s:b)
		{	
		 z[0]=map.get(s.getCity()).get(0)*s.getSq_feet();
		z[1]=map.get(s.getCity()).get(1)*s.getSq_feet();
		}
		return z;
		
	}
	public static void main(String[] args) {
		
		
		
////		Material ob1 = new Material("Chennai", 1800,1000);
////		List<Material> l1 =Arrays.asList(ob1);
//		Material_customer mc1 = new Material_customer("Christo", 100, 10,"Chennai");
//		List<Material_customer> c1 =Arrays.asList(mc1);
//		map.put("Chennai", l1);
		
//		price_cal(map,m);
		
		
				
	}

}
