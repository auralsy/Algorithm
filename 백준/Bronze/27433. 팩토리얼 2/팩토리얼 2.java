import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        
        long fr = 1L;
        
        for(int i = 1; i <= n; i++)
        {
            fr *= i;
        }

        System.out.println(fr);
    }
}