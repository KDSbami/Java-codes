/*
 class cant extend to 2 classes
 
 interface implements multiple inheritances in one class
 
 
 
 SYNTAX---------->
 class b
 interface a
 interface x
 
 class c extends b implements a,x
 It provides 100% abstraction
 
 all variables in interface are public final and static
 all methods   in interface are public and abstract.
 
 */
import java.util.*;

interface test
{
    int a=10;
    void print();
}

abstract class b
{
    int aa =5;
   abstract void print();
}

class x extends byte{}
class tester extends x implements test
{
    public void print()
    {
        System.out.print(aa);
    }
}
public class interface_class
{
    public static void main(String[] args)
    {
        tester a=new tester();
        a.print();
        
    }
}

