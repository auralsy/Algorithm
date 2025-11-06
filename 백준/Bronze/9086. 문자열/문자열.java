import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= t; i++)
        {
            String str = sc.nextLine();
            System.out.printf("%s%s\n", str.charAt(0), str.charAt(str.length()-1));
        }
    }
}