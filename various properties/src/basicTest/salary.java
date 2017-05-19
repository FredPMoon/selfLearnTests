package basicTest;

import java.util.Scanner;
import java.util.Vector;
import java.util.Map;

class Pair<T,U>
{
	private T key_;
	private U value_;
	
	public Pair(T key,U value)
	{
		this.key_ = key;
		this.value_ = value;
	}
	
	public Pair<T,U> make_pair(T key, U value)
	{
		return new Pair<T,U>(key,value);
	}
	
	public T first()
	{
		return this.key_;
	}
	
	public U second()
	{
		return this.value_;
	}
}

public class salary 
{	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("How many employees? ");
		String num_temp = in.next();
		int num = Integer.parseInt(num_temp);
		Vector<Pair<String, Double> > v = new Vector<Pair<String, Double> >();
		for(int i=0;i<num;i++)
		{
			System.out.print("Please enter name of employee #" + (i+1) + ": ");
			String name = in.next();
			System.out.print("Please enter hourly rate of " + name + ": ");
			String temp = in.next();
			double rate = Double.parseDouble(temp);
			Pair<String, Double> new_pair = new Pair<String, Double>(name, rate);
			v.add(new_pair);
		}
		in.close();		
		for(int i=0;i<num;i++)
		{
			System.out.println(v.get(i).first() + "'s annual salary is $" + (v.get(i).second())*40*50);
		}
	}
}
