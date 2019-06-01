import java.util.*;

public class man_w_one_loop
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int array[]=new int[a];
		int max=0;
		int min=0;
		for(int i=0;i<a;i++)
		{
			array[i]=sc.nextInt();
		}
		min=array[0];
		for(int i=0;i<a;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
			if(array[i]<min)
			{
				min=array[i];
			}
			
		}
		System.out.println(max);
		System.out.println(min);
	}	
}
