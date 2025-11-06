import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int sum = 0;

        for(int i = 0; i < str.length(); i++)
        {
            sum = sum + Character.getNumericValue(str.charAt(i));
        }

        System.out.println(sum);
    }
}