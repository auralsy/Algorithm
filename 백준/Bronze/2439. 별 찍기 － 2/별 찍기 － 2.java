import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++)
        {
            for(int j = 0; j < (n-i); j++)
            {
                System.out.print(" ");
            }

            for(int k = 0; k < i; k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        }
    }