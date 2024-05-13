package Collection;

import java.util.*;

public class Mapppp
{
	public static void main(String[] args) 
	{
		SortedMap h = new TreeMap ();
		h.put(105, "abc");
		h.put(102, "xyz");
		h.put(107, "pqr");
		h.put(101, "sss");
		h.put(103, "fff");
		h.put(106, "ppp");
		h.put(104, "piiii");

		System.out.println(h);
		/*System.out.println(h.keySet());
		System.out.println(h.putIfAbsent(104, "xyz"));
		System.out.println(h.containsValue("sss"));
		*/
	}
}
