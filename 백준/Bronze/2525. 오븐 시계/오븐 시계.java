import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean arrive;
    static boolean visited[];
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minu = Integer.parseInt(st.nextToken());

        int ctm = Integer.parseInt(br.readLine());

        int minuR = (minu + ctm)%60;
        int hourR = (minu + ctm)/60 + hour;

        if(hourR >= 24)
            hourR -= 24;

        System.out.printf("%d %d", hourR, minuR);
        }
    }