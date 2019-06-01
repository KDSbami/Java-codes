import java.util.*;

public class prev_smallest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		int index[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=(a);i>0;i--)
		{	
			index[i-1]=arr[i-1];
			for(int j=i-1;j>0;j--)
			{
			if(arr[j]<index[i-1])
			{
				index[i-1]=arr[j];
				break;
			}
			}
			
		}
		
		for(int i=0;i<a;i++)
		{
		if(index[i]!=arr[i])
		{
		System.out.print(index[i]+" ");
		}
		if(index[i]==arr[i])
		{
		System.out.print("0 ");
		}
		}
		
		
	}	
}