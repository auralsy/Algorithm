import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int[] count = new int[26];
        
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) < 97)
                count[str.charAt(i) - 65]++;
            else 
                count[str.charAt(i) - 97]++;
        }
        
        int max = 0;
        int index = 0;
        boolean check = false;
        
        for(int i = 0; i < 26; i++)
        {
            if(count[i] > max)
            {
                max = count[i];
                index = i;
                check = false;
            }
            else if(count[i] == max && max != 0)
            {
                check = true;
            }
        }
        
        if(!check)
        {
            char c = (char)(index+65);
            System.out.println(c);
        }
        else
            System.out.println("?");
    }
    }