import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] set = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i = 0; i < set.length; i++)
        {
            if(str.contains(set[i]))
                str = str.replace(set[i], "!");
        }
        System.out.println(str.length());
    }
}