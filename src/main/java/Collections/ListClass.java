package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListClass {
	
	LinkedList<Integer> AL = new LinkedList<Integer>();
	LinkedList<Integer> AL1 = new LinkedList<Integer>();
	
	public void AddMark()
	{

		
		AL.add(90);
		AL.add(70);
		AL.add(80);
		AL.add(50);
		AL.add(90);
		AL1 =(LinkedList<Integer>) AL.clone();
		System.out.println(AL.size());
		AL.remove(3); // delete
		AL.set(1, 75); // update
		AL.add(3, 77);
		System.out.println(AL.size());
		System.out.println(AL);
		System.out.println(AL.contains(77));
		System.out.println("AL1 :" + AL1);
		System.out.println(AL.get(4));
		
		Iterator it = AL.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(int eachValue : AL)
		{
			System.out.println(eachValue);
		}
		
		for(int i=0;i<AL.size() ;i++)
		{
			System.out.println(AL.get(i));
		}
		
		AL.clear();
		System.out.println(AL);
		System.out.println(AL.isEmpty());
		AL.indexOf(0);
		System.out.println(AL1.lastIndexOf(90));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListClass  L = new ListClass();
		L.AddMark();
		
	}

}
