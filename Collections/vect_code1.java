/*
 using vector
 input - 1 2 2 3 3
 output - 1 2 3
 */

import java.util.*;

public class vect_code1
{
    public static void main(String[] args)
    {
        Vector<Integer> v = new Vector<Integer>();
        Iterator it = v.iterator();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int test=0;
        for(int i=0;i<n;i++)
        {
            int b = sc.nextInt();
            v.add(b);
        }
        Collections.sort(v);
        for(int i=0;i<v.size();i++)
        {
            int c=(Integer)v.get(i);
            int initial =v.indexOf(c);
            int fin=v.lastIndexOf(c);
            if(initial != fin)
            {
                while(v.remove(c));
            }
            v.add(c);
            System.out.println(c+" "+initial+" "+" "+fin);
        }
        //System.out.println(v);
    }
}






