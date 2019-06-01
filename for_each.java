import java.util.*;

public class for_each
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][4];
		int x=0;
		int y=0;
		for(int[] i:a)
		{
			y=0;
			a[x]=i;
			for(int j:i)
			{
			j=sc.nextInt();
			a[x][y]=j;
			y++;
			}
			x++;
		}

		int r=a[0].length;
		int m=a.length;
		for(int[] i:a)
		{
			for(int j:i)			
			{
			System.out.print(j);
			}
			
		}

	
		System.out.print(r+" "+m);
		
	}
}