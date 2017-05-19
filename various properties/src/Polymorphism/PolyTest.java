package Polymorphism;

import java.util.Scanner;

class C1
{
	public int num = 23;
	public void meth1()
	{
		System.out.println("in C1");
	}
}

class C2 extends C1
{
	public void meth1()
	{
		System.out.println("in C2");
	}
	public void meth2()
	{
		System.out.println("in C2, meth2");
	}
}

class C3
{
	public static void meth(C1 c)
	{
		c.meth1();
	}
}

public class PolyTest 
{

	public static void main(String[] args) 
	{
		/*boolean bool = 1 < 2 ? true:false;
		System.out.println(bool);*/
		C1 c;
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int type = Integer.parseInt(str);
		while(type != 0)
		{
			if(type == 1)
			{
				c = new C1();
			}
			else
			{
				c = new C2();
			}
			c.meth1();
			System.out.println(c.num);
			C3.meth(c);
			type = Integer.parseInt(s.next());
		}
		s.close();
	}

}
