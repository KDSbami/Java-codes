public class sync
{
    static int arr[]={0};
    public static void main(String[] args) throws InterruptedException
    {
    Thread t= new Thread()
    {
        public void run()
        {
            for(int i=0;i<50;i++)
            {
                increase();
            }
        }
    };
    Thread t2= new Thread()
    {
        public void run()
        {
            for(int i=100;i>0;i--)
            {
                decrease();
            }
        }
    };
    t.start();
    t2.start();
    t.join();
    t2.join();
    System.out.print(arr[0]);
    }
public synchronized static void increase()
    { synchronized(arr){
arr[0]++;
    }
}
public static void decrease()
    {  synchronized(arr){
        arr[0]--;}
}
}
