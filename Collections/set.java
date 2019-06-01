/*
 SET
    hashSet
        linkedHashSet
 
 what is set?
all the values are unique
    in ++++list++++++ duplicacy is allowed
 
 hashset no sorting
 in hashset
 insertion order is preserved in linked hashset
 constructors
 
 hashSet(int capacity,float loadFactor) default is 0.75
 hashSet(int capacity)
 sortedset---- sorted
 removeAll
 remove
 
 
+++++++++++_____________BOUNDED TYPE PARAMETER_____________++++++++++++++
 
 */

/*
 to check if an element exists in the hashset.
 */
import java.util.*;

public class set{
    public static void main(String[] args)
    {
        HashSet a = new HashSet();
        Scanner sc=new Scanner(System.in);
        int input = sc.nextInt();
        
        for(int i=0;i<input;i++)
        {
            int b=sc.nextInt();
            a.add(b);
        }
        int c=sc.nextInt();
        if(a.contains(c))
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
        
    }
}

//insertion point is the index of first element which is greater than the value of the defined element.
