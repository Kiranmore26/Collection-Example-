package Collection;

import java.io.*;
import java.util.*;

public class Propertyyyyy 
{
	public static void main(String[] args)  throws Exception
	{
		Properties p = new Properties();
		FileInputStream f = new FileInputStream("abc.properties");
		p.load(f);
		String s = p.getProperty("Kiran");
		System.out.println(s);
		p.setProperty("AAAA", "qqqqqqqq");
		FileOutputStream fo = new FileOutputStream("abc.properties");
		p.store(fo, "jkdsj");
		
	}
}
