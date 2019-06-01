import java.util.*;
public class code1_list
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ob = new ArrayList();
        ob.add(1);
        ob.add(2);
        //method 1 to iterate all
        for(Integer a:ob)
        System.out.print(a);
        //method 2 to iterate
        Iterator i=ob.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next());
        }
        //method 3
        ListIterator it=ob.listIterator();
        while(it.hasNext())
        {
            System.out.print(it.next());
        }
        while(it.hasPrevious())
        {
            it.previous();
        }
        //method 4
        Enumeration e=Collections.enumeration(ob);
        while(e.hasMoreElements())
        {
            System.out.print(e.nextElement());
        }
        
    }
}
