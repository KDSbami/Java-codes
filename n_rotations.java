import java.util.*;

public class n_rotations
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int array[]=new int[a];
		int arr[]=new int[a];
		
		for(int i=0;i<a;i++)
		{
		array[i]=sc.nextInt();	
		
		arr[i]=array[i];
		}
		
		
		
		int b=sc.nextInt();
		sc.close();
		while(b!=0)
		{	
		for(int j=0;j<a;j++)
		{
			if(j==(a-1))
			{
			array[0]=arr[j];
			}
			else 
			{
			array[j+1]=arr[j];
			}
			
		}
		for(int i=0;i<a;i++)
		{
			arr[i]=array[i];
		}
		b--;
		}
		for(int i=0;i<a;i++)
		{
			System.out.print(array[i]+" ");
		}
	}	
}