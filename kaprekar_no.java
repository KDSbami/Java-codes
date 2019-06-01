import java.util.*;
import java.math.*;
public class kaprekar_no{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sq=0;
		
		
		int tester2=0;
		int tester=0;
		sq=a*a;
		int b=sq;
		int temp=0;
		int i=0;
		int flag=0;
		while(b!=0)
		{
		temp=b%10;
		b=b/10;
		tester=(int)Math.pow(10,i)*temp+tester;
		i++;
		if(b+tester==a)
		{
			flag++;
		}
		}
		if(flag>0)
		System.out.println("Yes");

		else
		System.out.println("No");
		
	}	
}