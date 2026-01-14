import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int floor = Integer.parseInt(st.nextToken());
        
        if(floor >= 13)
            System.out.println(floor + 1);
        else
            System.out.println(floor);
    }
    }