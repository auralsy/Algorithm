import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        int a = 0;
        int b = 0;

        while(count < n)
        {
            count = count + i;
            i++;
        }

        if((i-1)%2 == 0)
        {
            a = 1 + (count - n);
            b = (i-1) - (count-n);
        }
        else 
        {
            a = (i-1) - (count-n);
            b = 1 + (count - n);
        }


        System.out.println(b  + "/" + a);
    }
}