import java.util.*;

public class sum_sequence
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		int b=sc.nextInt();
		sc.close();
		
		int val_initial=0;
		int val_final=0;
		int sum=0;
		
		for(int i=0;i<a;i++)
		{
			for(int j=i;j<a;j++)
			{
			
				sum=sum+arr[j];	
				if(sum==b)
				{
				val_initial=i;
				val_final=j;
				break;	
				}
			
			}
			if(sum==b)
			{
			break;
			}
			else
			{
			sum=0;
			}
			
		}
		if(b!=arr[0]&&sum==b)
		{
		for(int i=val_initial;i<=val_final;i++)
		System.out.print(arr[i]+" ");		
		}
		else if(b==arr[0])
		{
		System.out.print(arr[0]);
		}
		else
		{
		System.out.print("No possible combination");
		}
	}
}