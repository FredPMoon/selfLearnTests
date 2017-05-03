import java.util.Scanner;

public class ifandswitch 
{
	public static void main(String[] args)
	{
		System.out.print("Please enter first number: ");
		Scanner in = new Scanner(System.in);
		double x = Integer.parseInt(in.next());
		System.out.print("Please enter first number: ");
		double y = Integer.parseInt(in.next());
		if(args.length == 1)
		{
			String operator = args[0];
			double z = 0;
			switch(operator)
			{
				case "+":
					z = x + y;
				case "-":
					z = x - y;
				case "*":
					z = x * y;
				case "/":
					z = x / y;
			}
			System.out.println(x + " " + operator + " " + y + " = " + z);
		}
		in.close();
	}
}
