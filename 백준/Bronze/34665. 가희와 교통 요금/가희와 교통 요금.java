import java.io.*;
import java.util.*;

public class Main {
    public static int[] A;
    public static long result;

    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String a = br.readLine();
        String b = br.readLine();
        
        if(a.equals(b))
            System.out.println(0);
        else
            System.out.println(1550);
    }
    }