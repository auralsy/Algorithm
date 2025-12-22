import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashSet<String> hs = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i = 0; i < n; i++)
        {
            String str = br.readLine();

            if(str.equals("ENTER"))
            {
                count += hs.size();
                hs.clear();
                continue;
            }

            hs.add(str);
        }

        count += hs.size();

        System.out.println(count);
        }
    }