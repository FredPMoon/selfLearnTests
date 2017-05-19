package enumeration;

//in same pacakge, so still works without importing 
//(can only import public class, which can only be one in each file)
//import enumeration.Day;

public class Test 
{

	public static void main(String[] args) 
	{
		Day d = Day.MONDAY;
		System.out.println(d);
		Name n = Name.Fred;
		System.out.println(n);
		
		Day d2 = Day.FRIDAY;
		System.out.println(d2.getNum_());
		
		for(Day status: Day.values())
		{
			System.out.println(status);
		}
		
		
		/*Operation op = Operation.PLUS;
		double temp = op.calculate(3, 8);*/
		double result = Operation.TIMES.calculate(5, 9);
		System.out.println(result);
	}

}
