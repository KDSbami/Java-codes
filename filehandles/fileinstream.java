import java.io.*;

public class fileinstream
{
    public static void main(String[] args) throws Exception
    {
    	int ch;
        FileInputStream f = new FileInputStream(args[0]);
        while((ch = f.read())!=-1)
        {
        	System.out.print((char)ch);
        }
    }
}

