import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;

        for(int i = 0; i < str.length(); i++)
        {
            sum += Character.getNumericValue(str.charAt(i));
        }

        System.out.println(sum);
        }
    }