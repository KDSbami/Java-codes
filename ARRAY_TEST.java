import java.util.*;

public class ARRAY_TEST
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
			
		}
		arr=array;
		for(int j=0;i<a;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}	
}