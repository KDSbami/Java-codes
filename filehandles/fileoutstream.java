import java.io.*;
import java.util.*;


public class fileoutstream
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		FileOutputStream f = new FileOutputStream("run.kds",true);
		String s;

		while(!((s = sc.nextLine()).equals("exit")))
		{
			f.write(s.getBytes());

			f.write(System.getProperty("line.separator").getBytes());
		}

	}
}