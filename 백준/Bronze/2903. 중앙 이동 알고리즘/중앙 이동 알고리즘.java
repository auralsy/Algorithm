import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int rot = 2;

        for(int i = 0; i < n; i++)
        {
            rot = (rot*2) - 1;
        }

        int result = rot*rot;

        System.out.println(result);
    }
}