import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        
        int p = 10 + 2*(25-a+t);
        
        if(p < 0)
            System.out.println(0);
        else
            System.out.println(p);
    }
    }