import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        boolean judge = false;

        if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
            judge = true;

        if(judge == true)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
