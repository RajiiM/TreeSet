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
import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("rajii");
		ts.add("abi");
		ts.add("gowsy");
		ts.add("mehra");
		System.out.println(ts);			
		System.out.println(ts.size());	
		System.out.println(ts.contains("abi"));
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.subSet("abi", "rajii"));
	}
}
----------------------
Output:
[abi, gowsy, mehra, rajii]
4
true
abi
rajii
abi
rajii
[gowsy, mehra]
===========================================
===========================================
