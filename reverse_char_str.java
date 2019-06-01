import java.util.*;

public class reverse_char_str
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String val=sc.nextLine();
        
        Scanner cs=new Scanner(val);
        int iterator=0;
        String x[]=new String[10];
        while(cs.hasNextLine())
        {
            x[iterator]=cs.next();
            iterator++;
        }
        for(iterator=0;iterator<10;iterator++)
        {
            if(x[iterator]!=null)
            {
                for(int i=x[iterator].length()-1;i>=0;i--)
                {
                    System.out.print(x[iterator].charAt(i));
                }
                System.out.print(" ");
            }
        }
    }
}
