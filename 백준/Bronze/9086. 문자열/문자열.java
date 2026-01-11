import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++)
        {
            String str = br.readLine();
            
            if(str.length() == 1)
            {
                System.out.printf("%c%c", str.charAt(0), str.charAt(0));
                System.out.println();
            }
            else
            {
                System.out.printf("%c%c", str.charAt(0), str.charAt(str.length()-1));
                System.out.println();
            }
        }
    }
    }