/*
File class
	
constructors:-

File ob = new File(String path);
File ob = new File(String parent,String child); parent is directory and chld is directory.
File ob = new File(File file_obj);
File ob = new File(File ob,String child);



File f = new File("java");

Strinf a = new String[100]();

a = f.list();

*/
import java.io.*;
public class filehandlingbasics extends Exception
{
	public static void main(String[] args)
	{
		
		
		 try {
		 File ob = new File("run.kds");
         //ob.createNewFile();
         File ob2 = new File("/Users/apple/Desktop/Sem 4");
         String run[] = new String[100];
         run = ob2.list();
         for(String a:run)
         {
         	System.out.println(a);
         }
     
         System.out.print(run);
         } 

      catch (Exception e) {

      }

	}
}


