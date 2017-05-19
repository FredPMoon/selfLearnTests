package dataClasses;

class C1
{
	protected int data;
	public C1(int x)
	{
		data = x;
	}
}

public class IntegerTest
{

	public static void main(String[] args)
	{
		Integer x = new Integer(5);
		Integer y = new Integer(10);
		Integer z = new Integer(5);
		System.out.println(x.intValue());
		System.out.println("x = y: " + x.equals(y));
		String str = "hello";
		str = y.toString();
		System.out.println(str);
		Integer a = Integer.parseInt(str);
		System.out.println(a);
		System.out.println(x.compareTo(y));
		//System.out.println("你好, syso");
		
		DataType<Integer> Obj = new DataType<Integer>(x);
		System.out.println(Obj.getData());
		
		C1 obj = new C1(20);
		System.out.println(obj.data);
	}
}
