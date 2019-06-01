import java.util.*;

public class matrix_multi
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		int arr[][]=new int[a][b];
		int arr2[][]=new int[b][c];
		matrix_multi m=new matrix_multi();
		
		m.input(arr,a,b);
		m.input(arr2,b,c);
		m.multiply(arr,arr2,a,c,b);
		
	}

	void input(int array[][],int x,int y)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
	}
		
	void multiply(int array[][],int array2[][],int x,int a,int b)
	{
		int[][]arrays=new int[x][b];
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<a;j++)
			{
				for(int k=0;k<b;k++)
				{
					arrays[i][j]=arrays[i][j]+(array[i][k]*array2[k][j]);
					
				}
				System.out.println(arrays[i][j]);
			}
				
		}
			}

}

