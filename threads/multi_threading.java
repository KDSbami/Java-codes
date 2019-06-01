/*
 main is a thread
 thread is a snippet of code to be executed.;
 
 THREAD LIFECYCLE
 
 new -> runable ->running ->terminste
 
 
 */
class mythr extends Thread
{
public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
public class multi_threading
{
public static void main(String[] args)
    {
        mythr a = new mythr();
        mythr b = new mythr();
        a.start();
        b.start();
        System.out.println(Thread.activeCount());
        for(int i=0;i<5;i++)
        {
            System.out.println("hi"+i);
        }
     
    }
}
