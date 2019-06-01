/*
                                        STRING TOKANIZER
Constructers of string tokanizer class
 StringTokanizer a=new StringTokanizer (String,delimiter)
                                        By default is "\\s"
 StringTokanizer a=new StringTokanizer (String)
 
  StringTokanizer a=new StringTokanizer (String,delimiter,flag)
        flag is bool.                               default-false
 
 if flag = false-----------token will be only data
 if flag is true----------token will also consider delimiter
 
 methods
 
 hasMoreTokens()
 
 nextToken()
 */
import java.util.*;
public class String_tokanizer
{
    public static void main(String[] args)
    {
        String as=new String("es");
        StringTokenizer a=new StringTokenizer("1234es567e8s77",as);
        while(a.hasMoreTokens())
        {
            System.out.println(a.nextToken());
        }
    }
}
