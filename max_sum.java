import java.util.*;

public class max_sum{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int array[]=new int[a];
		for(int i=0;i<a;i++)	
		{
			array[i]=sc.nextInt();
		}
		int max=0;
		int sum=0;
		for(int i=0;i<a;i++)
		{
			for(int j=i+1;j<a;j++)
			{
				if(sum<(array[i]+array[j]))
				{
					sum=array[i]+array[j];
				}	
			}
		}


		for(int i=0;i<a;i++)
		{
			for(int j=i;j<a;j++)
			{
				if(sum==(array[i]+array[j]))
				{
					System.out.println(array[i]+" "+array[j]);
				}	
			}
		}
	}
}