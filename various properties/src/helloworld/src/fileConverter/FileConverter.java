package fileConverter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileConverter 
{
	public static void main(String[] args) 
	{
		FileReader fr = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		FileWriter fw = null;
		Scanner in = new Scanner(System.in);
		System.out.println("1. code with line numbers -> source code");
		System.out.println("2. source code -> Java Servlet response.getWriter() form");
		int type = Integer.parseInt(in.next());
		while(type != 1 && type != 2)
		{
			System.out.println("1. code with line numbers -> source code");
			System.out.println("2. source code -> Java Servlet response.getWriter() form");
			System.out.println("*****Please enter 1 or 2*****");
			type = Integer.parseInt(in.next());
		}
		try
		{
			fr = new FileReader("src/fileConverter/input.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("src/fileConverter/output.txt");
			pw = new PrintWriter(fw);
			String line = br.readLine();
			//delete line numbers
			if(type == 1)
			{
				int count = 0;
				while(line != null)
				{
					count++;
					if(line.length() == 2 || line.length() == 3)
					{
						pw.println();
					}
					else if(count >= 10)
					{
						pw.println(line.substring(3));
					}
					else
					{
						pw.println(line.substring(2));
					}
					line = br.readLine();
				}
				pw.flush();
				System.out.println("source code (without indentation) is output.txt");
				//make some format, i.e. indentation, brackets rearrange...

			}
			//product servlet code
			else if(type == 2)
			{
				while(line != null)
				{
					pw.println("out.println(\"" + line + "\");");
					line = br.readLine();
				}
				pw.flush();
				System.out.println("servlet code is in output.txt");
			}
		} catch(FileNotFoundException fnfe){
			System.out.println(fnfe.getMessage());
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if(br != null)
			{
				try
				{
					br.close();
				} catch(IOException ioe) {
					System.out.println(ioe.getMessage());
				}
			}
			if(fr != null)
			{
				try
				{
					fr.close();
				} catch(IOException ioe) {
					System.out.println(ioe.getMessage());
				}
			}
			in.close();
		}
	}
}
