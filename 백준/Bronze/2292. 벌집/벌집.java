import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 1;

        for(int i = 1; i < 20000000; i++)
        {
            if(n == 1)
            {
                System.out.println(1);
                break;
            }
            else if(count < n && count + 6*i >= n)
            {
                System.out.println(i+1);
                break;
            }
            else
                count = count + 6*i;
        }
    }
}