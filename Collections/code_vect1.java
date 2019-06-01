/*
 vector
 -variable size (increases in size).
 -add or append
 -legacy methods
 array list is faster than vector list
 
 methods
 
 .add
 .size
 .print
 .
 */
import java.util.*;

public class code_vect1
{
    public static void main(String[] args)
    {
        Vector<String> v = new Vector<String> (4);
        v.add("hello");
        v.add("bye");
        v.add("hello");
        v.add("bye");
        v.add("hello");
        v.add("bye");
        v.add("hello");
        v.add("bye");
        v.add("hello");
        System.out.println(v.size());
        System.out.println(v.capacity());
        
        
    }
}
