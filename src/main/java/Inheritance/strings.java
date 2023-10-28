package Inheritance;

public class strings {
	
	String name =" sathish kumar ";
	String name1 ="sathish kumaR";
	int age =35;
	
	public void stringimplemrentation()
	{
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(6));
		System.out.println(name.indexOf('h'));
		System.out.println(name.lastIndexOf('h'));
		System.out.println(name.isEmpty());
		System.out.println(name.compareTo(name1));
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		char[] c = name.toCharArray();
		for(char eachvalue : c)
		{
			System.out.println(eachvalue);
		}
		
		System.out.println(name.startsWith("sathi"));
		System.out.println(name.endsWith("r "));
		System.out.println(name.trim());
		System.out.println(name.replace(" ",""));
		System.out.println(name.substring(0,6));
		System.out.println(name.substring(5));
		System.out.println(String.valueOf(age));
		System.out.println(name.contains("ku"));
		name.getBytes();
		String[] aftersplit = name.split("a");
		for(String eachvalue : aftersplit)
		{
			System.out.println(eachvalue);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strings s = new strings();
		s.stringimplemrentation();
	}

}
