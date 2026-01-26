import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        int[] apb = new int[26];

        for(int i = 0; i < 26; i++)
        {
            apb[i] = -1;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        hm.put('a', 0); hm.put('b', 1); hm.put('c', 2); hm.put('d', 3);
        hm.put('e', 4); hm.put('f', 5); hm.put('g', 6); hm.put('h', 7);
        hm.put('i', 8); hm.put('j', 9); hm.put('k', 10); hm.put('l', 11);
        hm.put('m', 12); hm.put('n', 13); hm.put('o', 14); hm.put('p', 15);
        hm.put('q', 16); hm.put('r', 17); hm.put('s', 18); hm.put('t', 19);
        hm.put('u', 20); hm.put('v', 21); hm.put('w', 22); hm.put('x', 23);
        hm.put('y', 24); hm.put('z', 25);


        for(int i = 0; i < str.length(); i++)
        {
            if(apb[hm.get(str.charAt(i))] == -1)
                apb[hm.get(str.charAt(i))] = i;
        }

        for(int i = 0; i < 26; i++)
            sb.append(apb[i]).append(" ");

        System.out.println(sb.toString());
    }
    }