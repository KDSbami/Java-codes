import java.util.*;

//top tip of diamond
interface shape
{
     void calculate();
}

//diamond bodies
class circle implements shape
{
   public void calculate()
    {
        System.out.print("Circle");
    }
}
interface square extends shape
{
    void calculate();
}

class output extends circle implements square
{
   public void calculate()
    {
        System.out.println("hi square");
    }
    void test(){
    
        calculate();
       
    }
}




public class shape_abstract_interface
{
    public static void main(String[] args)
    {
        output a =new output();
        a.test();
    }
}

