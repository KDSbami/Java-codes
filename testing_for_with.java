import java.util.*;
	
public class testing_for_with
{
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			int arrays[][]=new int[2][2];

			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
				arrays[i][j]=sc.nextInt();
				}
			}
			int result=0;
			for(int[] x:arrays)
			{
				for(int y:x)
				{
					result+=y;
				}
			}
			System.out.print(result);
	}
}