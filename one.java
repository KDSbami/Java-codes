import java.util.*;
import java.math.*;

public class one
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=a;
		int c=0;
		int finall=0;
		int count=((int)Math.log10(a))+1;
		
		for(int i=0;i<count;i++)
		{
			b=b%10;
			if(b==9)
			{
				b=0;
			}
			else
			{
				b=b+1;
			}
			c=b*((int)Math.pow(10,i));
			finall=finall+c;
			a=a/10;
			b=a;
		}
		System.out.println(finall);
	}
}