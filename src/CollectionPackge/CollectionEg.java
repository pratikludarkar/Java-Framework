package CollectionPackge;

import java.util.HashMap;
import java.util.Map;

public class CollectionEg {
	public static void main (String args[]){
		Map<Integer, String> map =new HashMap<>();
		
		map.put(1,"Pratik");
		map.put(2,"Pratiksha");
		map.put(3,"Hrishi");
	    map.put(4,"All Are Here");
		
		
		for(Map.Entry<Integer,String> e : map.entrySet()) {
			System.out.println(e.getKey()+"  "+ e.getValue());
		}
		
	}
}
