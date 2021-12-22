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
			System.out.println(name);
		}
		
		TreeSet ts1 = new TreeSet();
		ts1.add(100);
		ts1.add(1000);
		ts1.add(500);	
		System.out.println(ts1);
		
		for(Object number:ts1)
		{
			System.out.println(number);
		}
	}
}
---------------------------------------------------
OUTPUT:
[Abi, Gowsy, Rajii]
Abi
Gowsy
Rajii
[100, 500, 1000]
100
500
1000
=========================================================
=========================================================
