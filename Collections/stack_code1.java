/*
 Stack
 
 vector is extended by stack
 so we can use functions of collections list vector and stack.
 collection can store hetrogenous data- see file hetro_code1.java
 */

import java.util.*;

public class stack_code1
{
    public static void main(String[] args)
    {
        Stack a=new Stack();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int b=sc.nextInt();
            a.add(b);
        }
        Collections.reverse(a);
        System.out.print(a);
        
    }
}

