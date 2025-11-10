import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fr = 1;

        for(int i = 1; i <= n; i++)
        {
            fr *= i;
        }

        System.out.println(fr);

    }
}