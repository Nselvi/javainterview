package interview;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Set;

public class Map {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap< String,String> hm =  new HashMap< String,String>(); 
		 
		 
		 hm.put("a", "1");
			hm.put("b", "2");
			hm.put("c", "3");
			
			
			Set sn = hm.entrySet();
			Iterator it = sn.iterator();

			while (it.hasNext()) {
				
			Object id=it.next();
				System.out.println(hm.get(id));
	}

}
}
