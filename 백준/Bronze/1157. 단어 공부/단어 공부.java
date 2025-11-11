import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        // A->65, a->97

        int[] count = new int[26];

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) < 97)
            {
                count[str.charAt(i) - 65]++;
            }
            else
            {
                count[str.charAt(i) - 97]++;
            }
        }

        int max = 0;
        boolean check = false;
        int ind = 0;

        for(int i = 0; i < 26; i++)
        {
            if(count[i] > max)
            {
                max = count[i];
                ind = i;
                check = false;
            }
            else if(count[i] == max && max != 0)
            {
                check = true;
            }
        }

        if(!check)
        {
            char c = (char)(ind + 65);
            System.out.println(c);
        }
        else
        {
            System.out.println("?");
        }
    }
}