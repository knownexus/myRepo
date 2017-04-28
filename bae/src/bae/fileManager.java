package bae;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class fileManager {

	public String readFile(String fileName){
		BufferedReader br = null;
		String everything = null;
		try
		{

		br = new BufferedReader(new FileReader(fileName));
		StringBuilder sb = new StringBuilder();

		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line.toString());
		        sb.append(",");//System.lineSeparator());
		        line = br.readLine();
		    }
		    everything = sb.toString();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} finally 
		{
		    try 
		    {
				br.close();
			} 
		    catch (IOException e) 
		    {
				e.printStackTrace();
			}
		}
		return everything;
	}
	
	public String[] parseText(String str, String token)
	{
		String[] strings = str.split(token);

		
		return strings; //returns a list of all of the sections in the .txt
	}
	
	public String[] parsePerson(String str, String token)
	{
		//System.out.println(str);
		//System.out.println(str);
		String[] strings = str.split(token);
		int i = 0;
		String[] stringy = new String[4];
		
		for (String string : strings) 
		{
			//system.out.println(string);
			if(string.length() > 0)
			{
				//System.out.print(string);
				stringy[i++] = string;
			}
		}
		return stringy;
	}
}
