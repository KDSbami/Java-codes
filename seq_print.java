import java.util.*;

public class seq_print
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
        int flag=0;
        int val;
        int flaga=0;
        int r=0;
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
        
        for(int i=0;i<a-1;i++)
        {
            
            if(arr[i]<=arr[i+1])
            {
                flag++;
            }
            else
            {
                
                if(flaga<flag)
                {
                flaga=flag;
                val=arr[i];
                }
                flag=0;
            }
        }
        for(int i=0;i<=flaga;i++)
        {
            System.out.print(arr[i]+" ");
        }
            
       
	}
}
