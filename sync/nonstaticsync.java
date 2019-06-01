import java.util.*;

class table
{
synchronized void print(int n)
    {
        System.out.print(Thread.currentThread().getName());
        for(int i=1;i<=10;i++)
        {
            System.out.print(n+"="+(n*i)+"\n");
        }
    }
}
    class myThread extends Thread
    {
        table t;
        int h;
        myThread(table t1,int h1)
        {
            t=t1;
            h=h1;
        }
            public void run()
            {
            t.print(h);
            }
        
    }

public class nonstaticsync
{
    public static void main(String[] args)
    {
        table ob = new table();
        table ob1 = new table();
        myThread m1= new myThread(ob,2);
        myThread m2= new myThread(ob,3);
        myThread m3= new myThread(ob1,4);
        myThread m4= new myThread(ob1,5);
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        
    }
}
