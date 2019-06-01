import java.util.*;

class clasroom
{
    int amount = 10000;
    static int i;
    synchronized void withdraw(int amount)
    {
        System.out.print("Going to withdraw\n");
        if(this.amount<amount)
        {
            System.out.print("low balance");
            try
            {
                wait();
            }
            catch(Exception e)
            {}
        }
        this.amount -=amount;
        i++;
        System.out.print("withdraw complete\n"+i);
    }
    synchronized void deposit(int amount)
    {
        System.out.print("GTD\n");
        this.amount+=amount;
         System.out.print("DC\n");
        notify();
    }
    
}

public class staticsync
{
public static void main(String[] args)
    {
        clasroom c = new clasroom();
        new Thread()
        {
    public void run(){
        c.withdraw(15000);
    }}
    .start();
        new Thread()
        {
            public void run(){
                c.withdraw(50000);
            }}
        .start();
    new Thread(){
    public void run()
        {
        c.deposit(100000);
        }}
    .start();
    
}
}
