import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
//2745
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>(30);

        hm.put('A', 10); hm.put('B', 11); hm.put('C', 12); hm.put('D', 13);
        hm.put('E', 14); hm.put('F', 15); hm.put('G', 16);
        hm.put('H', 17); hm.put('I', 18); hm.put('J', 19);
        hm.put('K', 20); hm.put('L', 21); hm.put('M', 22);
        hm.put('N', 23); hm.put('O', 24); hm.put('P', 25);
        hm.put('Q', 26); hm.put('R', 27); hm.put('S', 28);
        hm.put('T', 29); hm.put('U', 30); hm.put('V', 31);
        hm.put('W', 32); hm.put('X', 33); hm.put('Y', 34); hm.put('Z', 35);
        hm.put('1', 1); hm.put('2', 2); hm.put('3', 3); hm.put('4', 4);
        hm.put('8', 8); hm.put('7', 7); hm.put('6', 6); hm.put('5', 5);
        hm.put('9', 9); hm.put('0', 0);

        long result = 0L;

        String str = sc.next();

        int rule = sc.nextInt();

        for(int i = 0; i < str.length(); i++)
        {
            long a = 1L;
            for(int j = 0; j < (str.length() - i - 1); j++)
            {
                a *= rule;
            }

            result += hm.get(str.charAt(i)) * a;
        }

        System.out.println(result);
    }
}