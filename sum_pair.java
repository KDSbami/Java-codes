import java.util.*;

public class sum_pair
	{
		public static void main(String[] args)
		{
			//Scanning and initialisation
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int arr[]=new int[a];	
			for(int i=0;i<a;i++)
			{
				arr[i]=sc.nextInt();
			}
			int b=sc.nextInt();
			sc.close();
				



			//Logic
			for(int i=0;i<a-1;i++)
			{
				if(arr[i]+arr[i+1]==b)
				{
					System.out.println(arr[i]+" "+arr[i+1]);
				}
			}
			
			
	
		}
	}