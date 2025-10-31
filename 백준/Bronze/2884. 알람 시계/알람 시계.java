import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m >= 45)
            System.out.printf("%d %d", h, m-45);
        else
        {
            if(h >= 1)
                System.out.printf("%d %d", h-1, 60+m-45);
            else
                System.out.printf("%d %d", 23, 60+m-45);
        }
    }
}