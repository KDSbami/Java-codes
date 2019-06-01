import java.util.*;

public class for_each_test_2{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();



	for(int x:a%10)
	{
		System.out.println("x");
		a=a/10;	
	}
	}
}