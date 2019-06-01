import functions.*;
import java.util.*;

public class runmain
{
    public class teacher
    {
        String[] name=new String[30];
        int[] salary=new int[30];
        int[] year=new int[30];
        functions_teacher a =new functions_teacher();
        void get_t(int i)
        {
            a.scan_t(name[i],salary[i],year[i]);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);  
        char gett='a';
        while(gett!='e')
        {
            teacher t=new teacher();
            System.out.println("1.Teacher");
            System.out.println("2.Student");
        int get=sc.nextInt();
            if(get==1)
            {
                System.out.println("1.Enter Teacher Details.");
                System.out.println("2.Show Teacher details");
                System.out.println("3.calculate incriment");
            }
            int gut=sc.nextInt();
            if (gut =='1')
            {
                t.get_t(0);
            }
            
        }
        
    }
}
