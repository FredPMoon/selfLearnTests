package generics;

public class Test<T>
{
	public void print(T t)
	{
		System.out.println(t);
	}
	
	public static void main(String[] args) 
	{
		Test<String> obj = new Test<String>();
		obj.print("templated");
		Test<Integer> intobj = new Test<Integer>();
		intobj.print(100);
	}

}
