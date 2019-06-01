import java.util.*;

public class delete_middle_stack
{
    public static void main(String [] args)
    {
        Stack<Integer> a=new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Integer c = sc.nextInt();
            a.add(c);
        }
        a.removeElementAt(a.size()/2);
        System.out.print(a);
    }
}
