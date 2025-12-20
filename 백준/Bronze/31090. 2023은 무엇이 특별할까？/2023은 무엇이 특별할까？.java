import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            int year = sc.nextInt();

            int yearPlusOne = year + 1;

            if(yearPlusOne%(year%100) == 0)
                System.out.println("Good");
            else
                System.out.println("Bye");
        }
        }
    }