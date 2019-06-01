import java.util.*;

class Name
{

	
}

class comparename implements Comparator<comparator1>
{
	public int compare(comparator1 a, comparator1 b)
	{

		return a.name.compareTo(b.name);
	}
}

public class comparator1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		
		List<String> s = new ArrayList<String>();
		for (int i=0;i<5;i++)
		{
		String name = sc.nextLine();
		s.add(name);
		}
		Collections.Sort(s,new comparename());
	}

}

