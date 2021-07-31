package CollectionPackge;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String args[])
	{
		Student S1 = new Student(1, "Pratik", " Morden");
		Student S2 = new Student(2, "Abhi" , "MIT");
		Student S3 = new Student(2, "Abhi", "MIT");
		
		  
		Map<Student, String> map =new HashMap<>();
		map.put(S1, "1");
		map.put(S2, "2");
		map.put(S3, "3");
		
		
		for(Map.Entry<Student,String> e : map.entrySet())
		{
			System.out.println(e.getKey()+"  "+ e.getValue());
		}
	}

}
