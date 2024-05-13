package Collection;
import java.util.*;
public class Navigation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		NavigableSet n = new TreeSet <>();
		n.add(50);
		n.add(10);
		n.add(70);
		n.add(60);
		n.add(40);
		n.add(30);
		n.add(80);
		n.add(30);
		n.add(8);
		n.add(60);
		System.out.println(n);
		System.out.println(n.descendingSet());
		System.out.println(n.floor(10));
		System.out.println(n.ceiling(12));
		System.out.println(n.first());
		System.out.println(n.last());
		System.out.println(n.lower(12));
		System.out.println(n.higher(12));
		System.out.println(n.tailSet(12));
		System.out.println(n.headSet(12));
		System.out.println(n.pollFirst());
		System.out.println(n.pollLast());
		System.out.println(n.remove(12));











		
		
		
	}
}
