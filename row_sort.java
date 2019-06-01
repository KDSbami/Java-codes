import java.util.*;

public class row_sort{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int aa=sc.nextInt();	
		int b=sc.nextInt();
		int a[][]=new int[aa][b];
		for(int i=0;i<aa;i++)
		{
			for(int j=0;j<b;j++)
			{
				a[i][j]=sc.nextInt();
			}	
		}
		int sum=0;
		for(int[] g:a)
		{	
			sum=0;
			for(int y:g)
			{
				sum=sum+y;
			}
			System.out.println(sum+" ");
		}
	}	
}