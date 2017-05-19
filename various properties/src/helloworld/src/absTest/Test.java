package absTest;

interface GrandParent
{
	public abstract int getAge();
}

interface Parent extends GrandParent
{
	public abstract int getNum();
	public int get();
}

interface Parent2
{
	public abstract double getDou();
}

abstract class Child implements Parent, Parent2
{
	public int get()
	{
		return 5;
	}
}

class Grandchild extends Child
{
	private int num_;
	public Object Child;
	public Grandchild()
	{
		num_ = 3;
	}
	public Grandchild(int num)
	{
		num_ = num;
	}
	public int getNum()
	{
		return num_;
	}
	public int get()
	{
		System.out.print("override, ");
		return 10;
	}
	public double getDou()
	{
		return 2.3;
	}
	public int getAge()
	{
		return 80;
	}
}

public class Test 
{

	public static void main(String[] args)
	{
		Grandchild defaultgc = new Grandchild();
		Grandchild gc = new Grandchild(12);
		System.out.println(gc.getNum());
		System.out.println(gc.get());
		System.out.println(defaultgc.getNum());
	}

}
