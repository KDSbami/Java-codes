import java.util.*;
	
public class freq_sort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] temp;
		int array[]=new int[a];
		int array2[][]=new int[a][2];
		int flag=0;
		for(int i=0;i<a;i++)
		{
			array[i]=sc.nextInt();
		}
		
		
	
		for(int i=0;i<a;i++)
		{	flag=0;
			for(int j=0;j<a;j++)
			{	
				if(array[i]==array[j])
				{
					array2[i][0]=array[i];
					flag++;
					array2[i][1]=flag;
				}	
			}
		}
		
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a-1;j++)
			{
				if(array2[j][1]>array2[j+1][1])
				{
					temp=array2[j];
					array2[j]=array2[j+1];		
					array2[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a;i++)
		System.out.print(array2[i][0]+" ");
					
	}
}