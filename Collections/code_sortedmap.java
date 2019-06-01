import java.util.*;

public class code_sortedmap
{
	public static void main(String [] args)
	{
		SortedMap<Integer,String>m=new TreeMap();

		m.put(2,"h");
		m.put(1,"q");
		m.put(4,"o");
		m.put(5,"u");
		m.put(6,"d");
		m.put(3,"f");

		Set s = m.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			Map.Entry m1=(Map.Entry)

			i.next();
			System.out.print(m1.getKey()+" "+m1.getValue()+"\n");
		}


	}
}