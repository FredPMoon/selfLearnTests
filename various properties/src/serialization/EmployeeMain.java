package serialization;

import java.io.*;

class SEmployee implements Serializable
{
	public static final long serialVersionUID = 2;
	private String fname;
	private String lname;
	private transient String pass;//if declared transient: won't be serializable-won't be saved to stream.
	public SEmployee(String s1, String s2, String s3)
	{
		fname = s1;
		lname = s2;
		pass = s3;
	}
	public void print()
	{
		System.out.println(fname + " " + lname + " " + pass);
	}
}

public class EmployeeMain
{

	public static void main(String[] args) 
	{
		SEmployee emp = new SEmployee("David", "Beckham", "soccer player");
		try
		{
			ObjectOutputStream ooc = new ObjectOutputStream(new FileOutputStream("1.txt"));
			ooc.writeObject(emp);
			ooc.flush();
			ooc.close();
			ObjectInputStream oic = new ObjectInputStream(new FileInputStream("1.txt"));
			SEmployee new_emp = (SEmployee)oic.readObject();
			oic.close();
			emp.print();
			new_emp.print();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
