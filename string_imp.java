/*
Relational string
String s=new String("Hello")---------------->object
String s2=new String("Hello")
String s=new String();
 String a="Hello";----------------->literal
String is immutable(unchanged over time). Why?
 {
 It doesnt make a change in the old memory but make a new memory space for the data.It will happen internally
 }
 Strings are constant in java.
 s=s+"Computer";-----------> here the change will not be performed in the location but give a new memory location to the concatinated string.
 
 
compiler treates symbols as overloaded system but after string it is considered as a character
 SOP(30 + 40 +"abc"+30+40)---------->70abc3040
 
 
 char a[]={h,e,l,l,o}----------------> sop("gdfgdfg"+a) gives hashcode of a use as seperate variable to run it correctly since  + converts it to object.
 
 
 object class a.equals(); -----equals compare reference but for string comares their content
 */
import java.util.*;
public class string_imp{
    public static void main(String[] args)
    {
       String s="Hello";
        String s4="Hello";
        String s1=new String("Hello");
        String s2=new String("Hello");
        s2 = s2 +"abc";
        if(s==s4)
        {
            System.out.print("s and s1");
        }
        //String s=new String("1234           a 567");
       /* String a=new String("This is a  test");
        Scanner sc=new Scanner(s).useDelimiter("\\s+");
        for(int i=0;i<a.strlen;i++)
        {
            String q=sc.next();
        }*/
       // String q=sc.next();
      
        
        
    }
}

//Scanner sc=new Scanner(input).useDelimiter("\\s+");


