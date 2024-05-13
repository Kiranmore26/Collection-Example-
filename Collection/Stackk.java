package Collection;

import java.util.Stack;

public class Stackk 
{
	public static void main(String[] args) 
	{
		Stack s = new Stack<>();
		s.push(50);
		s.push(40);
		s.push(80);
		s.add(0, 90);
		System.out.println(s);
	}
}
