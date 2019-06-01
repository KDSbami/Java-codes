import java.util.*;
	
public class col_sort{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int ar[][]=new int [a][b];
		
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<b;i++)
		{
			sum=0;
			for(int j=0;j<a;j++)
			{
			sum=sum+ar[j][i];
			}
			System.out.print(sum+" ");
		}
	}	
}