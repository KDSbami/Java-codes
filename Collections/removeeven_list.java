import java.util.*;

public class removeeven_list
{
    public static void main(String[] args)
    {
        ArrayList<Integer> ob = new ArrayList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int b=sc.nextInt();
            ob.add(b);
        }
        int i=0;
        for(Integer x:ob)
        {
            
            if(x!=0)
            {
                if(x%2==0)
                {
                    ob.remove(i);
                }
            }
            i++;
        }
    }
}
