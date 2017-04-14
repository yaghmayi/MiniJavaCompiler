package runner.base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHelper 
{
	public static String readFile(String filePath)
	{
		BufferedReader br = null; 
		String content = null;
		try 
		{
			br = new BufferedReader(new FileReader(filePath));
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) 
		    {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    content = sb.toString();
		    br.close();
		} 
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		
		return content;
	}
}
