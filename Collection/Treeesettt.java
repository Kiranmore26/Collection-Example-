package Collection;

import java.util.Collections;
import java.util.TreeSet;

public class Treeesettt 
{
	public static void main(String[] args) 
	{
		TreeSet t = new TreeSet(Collections.reverseOrder());
		t.add("Xyz");
		t.add("Pqr");
		t.add("Abc");
		System.out.println(t);
		
		

	}
}
