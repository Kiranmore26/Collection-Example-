package Collection;

import java.util.*;

public class Prac1 
{
	
		public static void main(String[] args) 
		{
			ArrayList<Student> al = new ArrayList<Student>();	
			Student s = new Student("kiran", 50,"Thane");
			Student s1= new Student("xyz", 50,"Thane");
			Student s2 = new Student("PQR", 50,"kjdfc");
			al.add(s);
			al.add(s1);
			al.add(s2);
			//System.out.println(al);
			
			for(Student x:  al) 
			{
				System.out.println(x.name +"\t"+x.roll+" "+x.Add);
			}
			
	}
}
