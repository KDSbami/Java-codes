/*
isalive()
*/
class thr implements Runnable
{
public void run()
    {
        System.out.println("Hi");
    }
}

public class thread2
{
public static void main(String[] args)
    {
        thr b = new thr();
        Thread a = new Thread()
        {
            public void run()
            {
                System.out.println("hello");
            }
        };
        Thread c = new Thread()
        {
            public void run()
            {
                System.out.println("hi");
                
            }
        };
        a.setPriority(10);
        a.start();
        System.out.println(a.getPriority());
        System.out.println(a);
        c.start();
        System.out.println(a.isAlive());
      
    }
}
