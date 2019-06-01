package functions;
import java.util.*;
import java.math.*;

public class functions_teacher
{
    Scanner sc=new Scanner(System.in);
   public void scan_t(String names,int salary,int year)
    {
        System.out.println("Input the name of the teacher:");
        names=sc.nextLine();
         System.out.println(" ");
         System.out.println("Input the salary of the teacher:");
        salary=sc.nextInt();
        System.out.println(" ");
        System.out.println("Input the year she joined:");
        year=sc.nextInt();
        System.out.println(" ");
    }
   public void check_sal(int year,int salary)
    {
       if(year>5||salary>=30000)
       {
           System.out.println(salary/10);
       }
        else
        {
            System.out.println("This enitiy is not eligible for raise.");
        }
    }
    
    public void print_t(String names,int year,int salary)
    {
            System.out.println("name:"+names);
            System.out.println(" ");
            System.out.println("salary:"+salary);
            System.out.println(" ");
            System.out.println("the year they joined:"+year);
            System.out.println(" ");
    }
}



