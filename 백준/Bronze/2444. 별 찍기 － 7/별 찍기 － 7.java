import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int j = 1; j <= n; j++)
        {
            for(int i = 1; i <= (n-j); i++)
            {
                System.out.print(" ");
            }
            for(int i = 1; i <= 2*j-1; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n-1; i > 0; i--)
        {
            for(int j = n-i; j > 0; j--)
            {
                System.out.print(" ");
            }
            for(int j = 2*i-1; j > 0; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}