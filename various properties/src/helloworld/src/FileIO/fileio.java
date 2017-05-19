package FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileio 
{
	public static void main(String[] args) 
	{
		FileReader fr = null;
		BufferedReader br = null;
		try
		{
			fr = new FileReader("src/FileIO/1.txt");
			br = new BufferedReader(fr);
			String line = br.readLine();
			while(line != null)
			{
				System.out.println(line);
				line = br.readLine();
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
		}
		
	}

}
