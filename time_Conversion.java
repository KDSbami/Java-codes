import java.util.*;

class convert{
		long d,h,m,s,s_in;
		convert(long x)
		{
			s_in=x;
		}
		convert(convert xx)
		{
			s_in=xx.s_in;
		}
		void converter()
		{
			m=s_in/60;
			s=s_in-(m*60);
			h=m/60;
			m=m-(h*60);
			d=h/24;
			h=h-(d*24);
			System.out.printf("%d Days %d Hours %d minutes %d seconds",d,h,m,s);
			//System.out.print(d+" "+h+" "+m+" "+s);
		}
}

public class time_Conversion{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		convert x=new convert(a);
		convert l=new convert(x);
		l.converter();
	}	
}