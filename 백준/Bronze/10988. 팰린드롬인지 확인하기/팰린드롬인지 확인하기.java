import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int len = str.length();
        String str1 = "";

        if(len%2 == 0)
        {
            for(int i = (len-1); i >= (len/2); i--)
            {
                str1 += str.charAt(i);
            }

            for(int i = (len/2-1); i >= 0; i--)
            {
                str1 += str.charAt(i);
            }
        }
        else if(len%2 != 0)
        {
            for(int i = (len-1); i >= (len/2+1); i--)
            {
                str1 += str.charAt(i);
            }

            str1 += str.charAt(len/2);

            for(int i = (len/2-1); i >= 0; i--)
            {
                str1 += str.charAt(i);
            }
        }

        if(str.equals(str1))
            System.out.println(1);
        else System.out.println(0);
    }
}