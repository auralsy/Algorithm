import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        int ph = h+((m+c)/60);
        int pm = (m+c)%60;
        
        if(ph >= 24)
        {
            System.out.printf("%d %d", ph%24, pm);
        }
        else 
        {
            System.out.printf("%d %d", ph, pm);
        }
    }
}