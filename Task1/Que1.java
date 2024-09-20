package Task1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Que1 {
	public static void main(String[] args) {
		Map<String, String> a = new HashMap<String, String>();
       a.put("abc", "HR");
       a.put("pqr", "Manager");
       a.put("xyz", "Developer");
       
       System.out.println(a);
       
       Set<String> set = a.keySet();
	   Iterator<String> itr = set.iterator();
		
	   while(itr.hasNext()) {
		   String c = itr.next();
		   System.out.println("Employee name : " + c + " Department : " + a.get(c));
	   }
	}

}
