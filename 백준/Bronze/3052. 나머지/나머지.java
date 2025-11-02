import java.util.*;
import java.lang.Math;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i = 0; i < 10; i++)
        {
            int k = sc.nextInt();
            hs.add(k%42);
        }

        System.out.println(hs.size());
    }
}