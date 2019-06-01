import java.util.*;
import java.math.*;
import java.text.*;
class compound{

	float p,r,t;
	compound(float x, float y,float z)
	{
		p=x;
		r=y;
		t=z;
	}
	void cal_compound()
	{
		float g=p*(float)Math.pow(1+r/100,t);
		DecimalFormat f=new DecimalFormat("#.0");	
		System.out.print(f.format(g));
	}
	
}




public class compound_interest{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
	
		compound cc=new compound(a,b,c);
		cc.cal_compound();
	}
}