package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapClass {
	
	//HashMap<Integer,String> Hs = new HashMap<>();
	//LinkedHashMap<Integer,String> Hs = new LinkedHashMap<>();
	TreeMap<Integer,String> Hs = new TreeMap<>();
	
	public void GetStudent()
	{
		Hs.put(1, "sathish");
		Hs.put(5, "kumar");
		Hs.put(7, "r");
		Hs.put(2, "b.tech");
		Hs.put(3, "sathish");
		Hs.put(1, "Raja");
		System.out.println(Hs);
		System.out.println(Hs.get(3));
		System.out.println(Hs.size());
		System.out.println(Hs.keySet());
		System.out.println(Hs.values());
		Hs.remove(3,"Raja");
		System.out.println(Hs.keySet());
		System.out.println(Hs.isEmpty());
		Hs.replace(1, "B.Tech");
		System.out.println(Hs.values());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapClass MP = new MapClass();
		MP.GetStudent();
	}

}
