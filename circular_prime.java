import java.util.*;
import java.math.*;
class number
{
	int digit=0;
	int count=0;
	number(int x)
	{	
	digit=x;
	count=(int)Math.log10(digit)+1;
	}
}

class circ_print extends number
{
	circ_print(int y)
	{
	super(y);
	}
	
	boolean checker_circ_prime()
	{
	boolean a=false;
	for(int i=0;i<count;i++)
	{
		for(int j=1;j<digit;j++)
		{
			int flag=0;c
			if(digit%j==0)
			{
				flag++;
			}
			System.out.print(flag);
			if(flag=bash=1)
			{
			a=true;
			}	
		}
		if(a==true)
		{
		break;
		}
	}
	return a;	
	}
					
}
public class circular_prime
{
	public static void main(String[] args)
	{
		circ_print c=new circ_print(17);
		boolean b=c.checker_circ_prime();
		System.out.print(b);
	}
}