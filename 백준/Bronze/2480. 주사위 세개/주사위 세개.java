import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int count = 0;
        int max = a;
        int p = 0;
        int same = 0;
        
        if(a == b)
        {
            if(a == c)
                count = 3;
            else if(a != c)
            {
                count = 2;
                same = a;
            }
                
        }
        else if(a != b)
        {
            if(a == c)
            {
                count = 2;
                same = a;
            }
                
            else if(a != c)
            {
                if(b == c)
                {
                    count = 2;
                    same = b;
                }
                    
                else if(b != c)
                    count = 0;
            }
        }
        if(b > max)
            max = b;
        
        if(c > max)
            max = c;
        
        if(count == 3)
            p = 10000 + a*1000;
        else if(count == 2)
            p = 1000 + same*100;
        else 
            p = max*100;

        System.out.println(p);
    }
}