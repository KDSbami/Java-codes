import java.util.*;

public class sum_except{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int arr[]=new int[a];
		int arr_sum[]=new int[a];
		int sum=0;
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		
		
		for(int j=0;j<a;j++)

		{
			arr_sum[j]=sum-arr[j];
			System.out.print(arr_sum[j]+" ");
		}
	}	
}