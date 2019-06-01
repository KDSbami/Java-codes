import java.util.*;
public class swap_wo_var_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print(a+" "+b);		
	}	
}