package FileHandleText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readrowdata 
{
	public void ReadRowData(int row) throws IOException
	{
		File f=new File("../Project_Maruf1/maruf.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		int i=0;
		String s;
		while ((s=b.readLine())!=null)
		{
			i++;
			if(i==row)
			{
			System.out.println(s);
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException 
	{
		readrowdata r=new readrowdata();
		r.ReadRowData(2);
	}
}
