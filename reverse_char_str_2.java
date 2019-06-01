import java.util.*;

public class reverse_char_str_2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        StringBuffer val=sc.nextLine();
        
        Scanner cs=new Scanner(val);
        int iterator=0;
        val.reverse();
        String x[]=new String[10];
        while(cs.hasNextLine())
        {
            x[iterator]=cs.next();
            iterator++;
        }
        for(int i=9;i<=0;i--)
        {
            System.out.print(x[i]+" ");
        }
        
    }
}
