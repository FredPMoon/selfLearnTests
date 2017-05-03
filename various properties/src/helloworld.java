//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class helloworld
{
	public static void main(String[] args)
	{
		/*System.out.print("hello world!!! Please enter something: ");
		Scanner in = new Scanner(System.in);
		String x = in.nextLine();
		System.out.println("You typed: " + x);
		in.close();*/
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(isr);
		String line;
		int num;
		while(true)
		{
			try
			{
				System.out.print("Enter a number: ");
				line = buffer.readLine();
				num = Integer.parseInt(line);
				System.out.println("you entered: " + num);
				
			} catch(IOException ioe){
				System.out.println("IOException: " + ioe.getMessage());
			}
		}
	}
}
