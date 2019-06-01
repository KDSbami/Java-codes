//super test

class base{
	int x=0;
	base(int c)
	{
	int c=10;
		System.out.println("base "+c);
	}
	void test()
	{
		System.out.print("TESTING base");
	}
}
class test2 extends base{
	void test()
	{
		System.out.print("TESTING test2");
	}
}
class derived extends test2{
	derived(int x){

	System.out.print("Derived "+x);
	}
	derived(int r,int a){
		System.out.println("Derived\n");
		super.test();
	}
}

public class super_test{
	public static void main(String [] args)
	{
		derived x= new derived(3,4);
	}
}