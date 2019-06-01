import java.util.*;

public class next_highest
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
		
		for(int i=0;i<a;i++)
		{
			index[i]=arr[i];
			for(int j=i;j<a;j++)
			{
				if(arr[j]>index[i])
				{
					index[i]=arr[j];
					break;
				}
			}
			if(index[i]!=arr[i])
			{
			System.out.print(index[i]+" ");
			}
			else
			{System.out.print("0 ");	}
		}
	}	
}