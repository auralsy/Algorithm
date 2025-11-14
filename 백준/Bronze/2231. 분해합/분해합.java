import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mid = 0;

        for(int i = 0; i < n; i++)
        {
            int submid = 0;
            String str = String.valueOf(i);
            for(int j = 0; j < str.length(); j++)
            {
                submid += Character.getNumericValue(str.charAt(j));
            }
            mid = i + submid;

            if(mid == n)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}