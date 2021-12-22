import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("Rajii");
		ts.add("Abi");
		ts.add("Gowsy");	
		System.out.println(ts);
		
		for(Object name:ts)
		{
			String s = (String)name;//Type Casting			
			if(s.length()==3)
			{
			System.out.println(name);
			}
		}
		
		String frnds[] = {"Rajii", "Abi", "Arjun"};
		for(String name:frnds)
		{
			if(name.length()==5)
			{
			System.out.println(name);
			}
		}
	}
}
------------------------------------------
OUTPUT:
[Abi, Gowsy, Rajii]
Abi
Rajii
Arjun
====================================
====================================
import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Rajii");
		ts.add("Abi");
		ts.add("Gowsy");	
		System.out.println(ts);
		
		for(String s:ts)
		{		
			if(s.length()==3)
			{
			System.out.println(s);
			}
		}
		
		String frnds[] = {"Rajii", "Abi", "Arjun"};
		for(String name:frnds)
		{
			if(name.length()==5)
			{
			System.out.println(name);
			}
		}
	}
}
-----------------------------------
OUTPUT:
[Abi, Gowsy, Rajii]
Abi
Rajii
Arjun
=============================================
==============================================
