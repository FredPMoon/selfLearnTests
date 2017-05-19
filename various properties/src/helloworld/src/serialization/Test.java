package serialization;

import java.io.*;

class Person
{
	private String name;
	public Person(String n)
	{
		name = n;
	}
}
class Employee extends Person
{
	private String name;
	private int salary;
	public Employee(String n, int s)
	{
		super(n);
		name = n;
		salary = s;
	}
	public void saveData(PrintWriter pw)
	{
		pw.println(name + "'s salary: " + salary);
		pw.flush();
	}
}

public class Test 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee("Ted Mosby", 100000);
		PrintWriter pw = null;
		try 
		{
			pw = new PrintWriter(new FileWriter("src/serialization/emp.txt"));
			e.saveData(pw);
		} catch (IOException e1) {
			//System.out.println("I caught it.");
			e1.getMessage();
		} finally {
			if(pw != null)
			{
				pw.close();
			}
		}
	}

}
