import java.util.*;
	
public class stat_class{
	public static void main(String[] args){
		b q=new b();
		System.out.println("_______b________");
		b.xx test=q.new xx();
		System.out.println("________x_______");
		b.y testa=q.new y();
		System.out.println("________y_______");
		test.print();
		testa.prinat();
		
		
		
	}
}

class b
{

		class xx{
		
		{
		System.out.println("STATIC STUFF X");
		}
		void print(){
		System.out.println("stat class b");
		}

		}
	b(){
		System.out.println("const class b");
	}
	

	class y{
		
		{
		System.out.println("STATIC STUFF Y");
		}
		void prinat(){
		System.out.println("non stat class b");
		}
	}
}

//4973