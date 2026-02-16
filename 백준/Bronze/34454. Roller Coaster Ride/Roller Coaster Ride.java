import java.io.*;
import java.util.*;

public class Main {
    public static int[] A;
    public static long result;

    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());

        if(n > (c*p))
            System.out.println("no");
        else
            System.out.println("yes");
    }
    }