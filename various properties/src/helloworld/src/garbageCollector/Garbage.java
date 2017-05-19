package garbageCollector;

import java.util.ArrayList;

public class Garbage
{
	private ArrayList num;
	private static String val;
	public Garbage(ArrayList num)
	{
		this.num = num;
		this.val = "hello";
	}
	static void meth()
	{
		Garbage g = new Garbage(new ArrayList());
		g.num = new ArrayList();
		Garbage.val = "hi";
	}
	
	public static void main(String[] args) 
	{
		Integer number = new Integer(3);
		for (int i=0; i < number; i++)
		{
			System.out.println(i);
		}
		Garbage.meth();
		System.out.println(number);
		System.gc();
	}

}
