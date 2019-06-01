import java.util.*;

public class func
{
	int printadd(int r)
		{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		r=r+a;
		return r;
		}
	public static void main(String[] args)
	{
		
		func f=new func();
		int a=f.printadd(5);
		System.out.print(a);
		
		
	}
}