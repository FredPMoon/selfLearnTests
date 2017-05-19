package generics;

public class Test2
{
	public static<T> void print(T[] t)
	{
		for(int i=0;i<t.length;i++)
		{
			System.out.println(t[i]);
		}
	}
	
	public static void main(String[] args)
	{
		Integer arrInt[] = {1,2,3};
		Test2.<Integer>print(arrInt);
		String arrStr[] = {"He ", "can ", "talk."};
		Test2.print(arrStr);
	}

}
