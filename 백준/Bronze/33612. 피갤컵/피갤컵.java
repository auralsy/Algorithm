import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean visited[];
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        int m = 8 + (n-1)*7;
        int y = 2024 + m/12;

        if(m%12 == 0)
        {
            System.out.printf("%d %d", y-1, 12);
        }
        else
            System.out.printf("%d %d", y, (m%12));


        // 24 8 / 25 3 / 25 10 / 26 5 / 26 12
    }
    }