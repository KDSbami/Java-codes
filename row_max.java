import java.util.*;

public class row_max{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[][]=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int arr_final[]=new int[a];
		int max=0;
		for(int i=0;i<a;i++)
		{
			max=0;
			for(int j=0;j<b;j++)
			{
				if(arr[i][j]>arr_final[i])
				{
				arr_final[i]=arr[i][j];
				}
				
			}
			
		}
		for(int i=0;i<a;i++)
		{
		System.out.println("val "+arr_final[i]);
		}
		
		
	}
}