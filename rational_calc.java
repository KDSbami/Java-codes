/*
4 objects in main
r1 using default num and den is 0
r2 using parameterised
r3 copy of r1
r4 copy of r2


addition 
multiplication
subtraction
division
reduce()= 2/6 will make is 1/3
*/

import java.util.*;

class rational{
	Scanner cs=new Scanner(System.in);
	int a,b,nv_flag=0;
	int hcf(int x,int y)
	{
		int hcfy=0;
		int max;
		if(x>y)
		{
		max=x;
		}
		else{
		max=y;
		}
		for(int i=1;i<max;i++)	
		{
			if(x%i==0&&y%i==0)
			{	
			hcfy=i;
			}
		}
		return hcfy;
	}
	rational input()
	{
	int x=cs.nextInt();
	int y=cs.nextInt();
	if(x<0&&y<0)
	{
	x=x*(-1);
	y=y*(-1);
	}
	else if(x<0&&y>0)
	{	
		nv_flag=1;
	}
	else if(x>0&&y<0)
	{	
		nv_flag=1;
		y=y*(-1);
		x=x*(-1);
	}
	rational aa=new rational(x,y);
	return aa;
	}
	rational()
	{
		a=0;
		b=0;
	}
	rational(int x,int y)
	{
		a=x;
		b=y;
	}
	rational(rational x)
	{
		a=x.a;
		b=x.b;
	}
	rational multi(rational q,rational r)
	{
		rational tempo=new rational();
		tempo.a=q.a*r.a;
		tempo.b=q.b*r.b;
		return tempo;	
	}
	rational div(rational q,rational r)
	{
		rational tempo=new rational();
		tempo.a=q.a*r.b;
		tempo.b=q.b*r.a;
		return tempo;		
	}
	
	rational addn(rational q,rational r)
	{	
		rational tempo=new rational();
		int hcff=hcf(q.b,r.b);
		int lcm=(q.b*r.b)/(hcff);
		tempo.a=((lcm/q.b)*q.a)+((lcm/r.b)*r.a);
		tempo.b=lcm;
		return tempo;	
		
	}
	rational subn(rational q,rational r)
	{	
		rational tempo=new rational();
		int hcff=hcf(q.b,r.b);
		int lcm=(q.b*r.b)/(hcff);
		tempo.a=((lcm/q.b)*q.a)-((lcm/r.b)*r.a);
		tempo.b=lcm;
		return tempo;	
		
	}
	void reduce()
	{
		rational tempo=new rational();
		System.out.println("Reduce karu number\nAgar haan toh y daba\nvarna kuch bhi daba de\n");
		char compare=cs.next().charAt(0);
		if(a<0)
		{
			nv_flag=-1;
			a=a*(-1);
		}
		else
		{
			nv_flag=1;
		}
		int hcffy=hcf(a,b);
		char y='y';
		if(compare==y)
		{
			a=(a/hcffy)*nv_flag;;
			b=(b/hcffy);
			nv_flag=1;

		}
		a=a*nv_flag;
		

		
	}
	void print()
	{	
		System.out.println("\n\n"+a+"/"+b+"\n\n");
	}
	
}

public class rational_calc{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char input_looper='z';
		char end='e';
		char mul='m';
		char add='a';
		char sub='s';
		char divi='d';
		while(input_looper!=end)
		{
			System.out.println("Do rational numbers daal re\n");
			rational temp=new rational();
			rational one=temp.input();
			rational two=temp.input();
			if(one.b==0||two.b==0)
			{
			System.out.println("Denominator to dekh le\n");
			}
			else
			{	
				System.out.println("Choose karle kya karne ka in numbers ka\na seADDITION\ns se SUBTRACTION\nm se MULTIPLICATION\nd se DIVISION\n");
				char input=sc.next().charAt(0);	
				if(input==mul)
				{
					temp=temp.multi(one,two);
					temp.reduce();
					temp.print();
				}
				else if(input==add)
				{
					temp=temp.addn(one,two);
					temp.reduce();
					temp.print();
				}
				else if(input==sub)
				{
					temp=temp.subn(one,two);
					temp.reduce();
					temp.print();
				}
				else if(input==divi)
				{
					temp=temp.div(one,two);
					temp.reduce();
					temp.print();
				}
				else
				{
					System.out.println("kya daal raha hai yaar nai aata mujhe ye\n");
				}
			}
			System.out.println("Agar mera aur kaam hai to koi bhi character daba de\nvarna e daba meri chutti kar\n");
			input_looper=sc.next().charAt(0);
		}
		if(input_looper==end)
		{
			System.out.println("Chal mai sone chala");
			return;
		}
		
	
	}
}
