import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if(max < b)
            max = b;
        if(max < c)
            max = c;

        int save = (a+b+c) - max;

        while(save <= max)
        {
            max--;
        }

        System.out.println(save + max);
    }
}