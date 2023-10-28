package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClass {
	
	HashSet<String> Hs = new HashSet<>();
	
	public void Getname()
	{
		Hs.add("Sathish");
		Hs.add("kumar");
		Hs.add("r");
		Hs.add("B.tech");
		Hs.add("Sathish");
		System.out.println(Hs);
		System.out.println(Hs.contains("Sathish"));
		Hs.remove("kumar");
		System.out.println(Hs);
		Iterator it = Hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(String eachValue : Hs)
		{
			System.out.println(eachValue);
		}
	}

	
	public void GetLinkedHashsetname()
	{
		LinkedHashSet<String> Hs = new LinkedHashSet<>();
		Hs.add("Sathish");
		Hs.add("kumar");
		Hs.add("r");
		Hs.add("B.tech");
		Hs.add("Sathish");
		System.out.println(Hs);
		System.out.println(Hs.contains("Sathish"));
		Hs.remove("kumar");
		System.out.println(Hs);
		Iterator it = Hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(String eachValue : Hs)
		{
			System.out.println(eachValue);
		}
	}
	
	public void GetTreesetname()
	{
		TreeSet<String> Hs = new TreeSet<>();
		Hs.add("Sathish");
		Hs.add("kumar");
		Hs.add("r");
		Hs.add("B.tech");
		Hs.add("Sathish");
		System.out.println(Hs);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetClass s = new SetClass();
		s.GetTreesetname();
	}

}
