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
		 /*
		  * The "compile-time type" of a variable is the type it is declared as. 
		 	The "runtime type" is the type of the actual object the variable points to.
		 	
		 	compile-time type is what type you are declaring/definning the object;
		 	run-time type is when program is running, it would assign that variable a new instance of type X (run-time type)
				
	 		Here, c's compile-time type is C1, c's run-time type is C0
	 		We can only call methods based on its compile-time type.
	 		So here we can't call any methonds that are not in C1.	 
	 		But by saying C1 implements I3, which has meth3() in it, we garantee that C1 or its children (at least one
	 		of them) would someday implement meth3(), so it's safe to call meth3() on c whose compile-time type	is C1.	
		 */
		 C1 c = new C0();
		 c.meth(0);
		 c.meth1();
		 c.meth2();
		 c.meth3();
		 c.foo();
	 }
}