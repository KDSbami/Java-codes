/*
	all these classes are sub classes of input stream classes
*/

import java.io.*;
import java.util.*;

public class dataoutputstream
{
	public static void main(String[] args)
	{
		FileOutputStream f = new FileOutputStream("run.kds");
		DataOutputStream d = new DataOutputStream(f);
		//same way 
		FileInputStream ff = new FileInputStream("run.kds");
		DataInputStream dd = new FileInputStream(ff);
		
	}
}