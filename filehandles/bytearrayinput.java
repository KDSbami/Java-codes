import java.io.*;
import java.util.*;


public class bytearrayinput
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		FileOutputStream f = new FileOutputStream("run.kds",true);
		//String s;
		int i=0;
		byte[] b = new byte[] {1,2,3,4,5,6,7};
		int s;
		ByteArrayInputStream ba = new ByteArrayInputStream(b);
		while((s=ba.read())!=-1)
		{
			System.out.println(s);
			i++;
		}

	}
}