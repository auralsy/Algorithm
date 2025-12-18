import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        int resu = Integer.parseInt(br.readLine());

        for(int i = 0; i < 9; i++)
        {
            int n = Integer.parseInt(br.readLine());

            resu -= n;
        }

        System.out.println(resu);
        }
    }