import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(6);
		ts.add(15);
		ts.add(4);
		System.out.println(ts);			
		System.out.println(ts.size());		
	}
}
------------------------------------
OUTPUT:
[4, 6, 10, 15]
4
===================================================
===================================================
import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("Rajii");
		ts.add("Abi");
		ts.add("Gowsy");
		ts.add("Mehra");
		System.out.println(ts);			
		System.out.println(ts.size());		
	}
}
------------------------------------
OUTPUT:
[Abi, Gowsy, Mehra, Rajii]
4
====================================================
====================================================
