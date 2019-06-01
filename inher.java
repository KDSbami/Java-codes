import java.util.*;
class bill{
	int twok,onek,five,one,ten,quan,price,finn,rokda;	
	void calc()
	{
	finn=twok*2000+onek*1000+five*500+one*100+ten*10;
	rokda=(price*quan);
	}	
}
class Cash extends bill{
	void get_cash()
	{
		Scanner sc=new Scanner(System.in);
		price=sc.nextInt();
		quan=sc.nextInt();
		twok=sc.nextInt();
		onek=sc.nextInt();;
		five=sc.nextInt();
		one=sc.nextInt();
		ten=sc.nextInt();
		calc();
		
	}
	void display()
	{
		if(finn<rokda)
		{
		System.out.print(rokda-finn);
		}
		else if(finn==rokda)
		{
		System.out.print("Clear");
		}
		else
		{
		System.out.print("balance: "+ (finn-rokda));
		}
	}
		
	
}
public class inher{

	public static void main(String[] args)
	{
		Cash d=new Cash();
		d.get_cash();
		d.display();
	}	
}