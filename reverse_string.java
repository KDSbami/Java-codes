import java.util.*;


public class reverse_string
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String value= sc.nextLine();
        Scanner cs= new Scanner(value);
        //System.out.println(value);
        int i=0;
        String[] x=new String[10];
        do
        {
            x[i]=cs.next();
            i++;

        }
        while(cs.hasNextLine());
       // System.out.println(x[0]);
        for(int ii=9;ii>=0;ii--)
        {
            if(x[ii]!=null)
            {
                System.out.print(x[ii]+" ");
            }
        }
    }
}
