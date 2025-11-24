import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            String str = sc.next();
            set.add(str);
        }

        ArrayList<String> list = new ArrayList<>(set);

        Collections.sort(list, (l1, l2) -> {
           if(l1.length() == l2.length())
               return l1.compareTo(l2);
           else
               return l1.length() - l2.length();
        });

       for(String s : list)
       {
           System.out.println(s);
       }
    }
}