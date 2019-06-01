import java.util.*;

public class bracket_stack
{
    public static void main(String[] args)
    {
        Stack<Integer> a = new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        String b = sc.next();
        int c=b.length();
        Integer flag1=0;
        Integer flag=0;
        for(int i=0;i<c;i++)
        {
            if(b.charAt(i)=='('&&(b.charAt(i+1)==')'))
            {
                flag++;
                a.add(flag);
                a.add(flag);
                
                
            }
            else if(b.charAt(i)==')')
            {
                if(i==(c-1))
                {
                    flag--;
                }
                a.add(flag);
                
                
            }
        }
        System.out.print(a);
    }
}
//(())(()
/*  1221343
a 1221343
b 1222344
 */
