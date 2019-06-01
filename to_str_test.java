import java.util.*;
class complex{
	int real;
	int imaginary;
	
	complex(int r,int i)
	{
	real=r;
	imaginary=i;
	}
}

class calculation extends complex{
	
	int result_r;
	int result_i;
	
	calculation(int a,int b)
	{
		super(a,b);
		result_r=0;
		result_i=0;
			
	}
	public String tostring()
	{
	if(result_i>=0)
	{
			return result_r +" + "+ result_i+"i";
	}
	else
	{
		return result_r +" "+result_i+"i";
	}
	}
	void addition(calculation a)
	{
		result_r=real+a.real;
		result_i=imaginary+a.imaginary;
	}
	void subtraction(calculation a)
	{
		result_r=real-a.real;
		result_i=imaginary-a.imaginary;
	}
	void multiplication(calculation a)
	{
		result_r=real*a.real-imaginary*a.imaginary;
		result_i=real*a.imaginary+imaginary*a.real;
	}	
}


public class to_str_test{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	int i=sc.nextInt();
	int r1=sc.nextInt();
	int i1=sc.nextInt();
	
	calculation prim=new calculation(r,i);
	calculation sec=new calculation(r1,i1);
	prim.addition(sec);
	System.out.println(prim.tostring());
	prim.subtraction(sec);
	System.out.println(prim.tostring());
	prim.multiplication(sec);
	System.out.println(prim.tostring());
	
	}
}