package nestedClasses;
import enumeration.Day;

class Outer
{
	class Inner
	{
		public void print()
		{
			System.out.println("in inner");
		}
	}
}

public class OuterClass 
{
	public class InnerClass
	{
		public InnerClass()
		{
			num_ = 10;
		}
		private int num_;
		public final int getNum()
		{
			return num_;
		}
		public void print()
		{
			System.out.println("in non-static inner class.");
		}
	}
	
	public static class StaticInnerClass
	{
		public void print()
		{
			System.out.println("in static inner class.");
		}
	}
	
	public static void main(String[] args) 
	{
		OuterClass out = new OuterClass();
		OuterClass.InnerClass in = out.new InnerClass();
		//or: OuterClass.InnerClass in2 = new OuterClass().new InnerClass();
		in.print();
		
		OuterClass.StaticInnerClass in3 = new OuterClass.StaticInnerClass();
		in3.print();
		
		Outer.Inner ic = new Outer().new Inner();
		ic.print();
		/*Outer oc = new Outer();
		Outer.Inner icc = oc.new Inner();
		icc.print();*/
	}

}
