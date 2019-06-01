import java.util.*;
public class mysteryno
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		sc.close();
		int b=a;
		int c=0;
		int opp=0;
		int d=0;

		for(int i=0;i<a/2+1;i++)
		{
			c=b-i;
			opp=0;
			while(c!=0)
			{
				
				d=c%10;
				opp=(opp*10)+d;
				c=c/10;
				
			
			}
			System.out.println(opp+" "+"yes"+i);
			if(opp==i)
			{
			if(c+i==b)
			{
			System.out.print(i+" "+"yes");
			break;
			}
			}
			
		}
		
						
	}
}