package Extends_Implements;

class C0 extends C1
{
	public int meth3() 
	{
		System.out.println("3");
		return 3;
	}
}

abstract class C1 extends C2 implements I1, I2, I3
{
	public void meth(int num) 
	{
		System.out.println(num);
	}
	public int meth1() 
	{
		System.out.println("1");
		return 1;
	}
	public int meth2() 
	{
		System.out.println("2");
		return 2;
	}
}

abstract class C2 extends C3
{
	public void foo() 
	{
		System.out.println("foo");
	}
}


abstract class C3 
{
	public abstract void meth(int i);
}

interface I1 
{
	public int meth1();
}
 
interface I2 //or: extends I3 and write I3 down there
{
	public int meth2();
	//or: public int meth3() and don't need to write I3 any more
}

interface I3
{
	public int meth3();
}

public class Test 
{
	 public static void main(String [] args)
	 {
		 C1 c = new C0();
		 c.meth(0);
		 c.meth1();
		 c.meth2();
		 c.meth3();
		 c.foo();
	 }
}