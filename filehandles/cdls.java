import java.io.*;
import java.util.*;


public class cdls
{
	public static void main(String[] args) throws Exception
	{
		//gets current path
		String filename_delete = new String(".hide_javacdls");
		File firstIn = new File(filename_delete);
		firstIn.createNewFile();
		String basePath_absolute = new String(firstIn.getAbsolutePath());
		firstIn.delete();
		basePath_absolute = basePath_absolute.replace(".hide_javacdls","");

		//breaks down path
		int i=0;
		//String[] path= new String[100];
		HashMap<Integer,String> path = new HashMap<Integer,String>();
		Scanner breakPath = new Scanner(basePath_absolute).useDelimiter("/");
		while(breakPath.hasNext())
		{ 
			path.put(i,breakPath.next());
			i++;
		}
		for(int x=0;x<path.size();x++)
		{
		System.out.println(path.get(x));
		}

		//execution based code
		Scanner sc = new Scanner(System.in);
		String r = sc.next();
		String valNewPath = new String();
	while(r!="exit")
	{
		if(r.equals("cd"))
		{
			String pathNew = sc.next();
			File path_new = new File(pathNew);
			valNewPath = basePath_absolute + path_new;
			File absoluteNewPath = new File(valNewPath);
			
			if(!(path_new.exists()))
			{
				if(pathNew.charAt(0)=='/')
				{
					System.out.println(path_new+" not found.");	
				}
				else
				{
					System.out.println(valNewPath+" not found.");
				}
			}
			else if(path_new.exists())
			{
					if(pathNew.charAt(0)=='/')
				{
					System.out.println("Current path: "+pathNew);
				}
				else
				{
					System.out.println("Current path: "+valNewPath);
				}
			}
		}
		else if (r.equals("exit"))
		{
			return;
		}	
		else{
			System.out.println("command not found.");
		}
		r = sc.next();
	}

	}
}