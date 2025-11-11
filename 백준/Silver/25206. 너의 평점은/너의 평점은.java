import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        HashMap<String,Double> hm = new HashMap<String, Double>();
        Double resultSum = 0.0;
        Double sum = 0.0;

        hm.put("A+", 4.5);
        hm.put("A0", 4.0);
        hm.put("B+", 3.5);
        hm.put("B0", 3.0);
        hm.put("C+", 2.5);
        hm.put("C0", 2.0);
        hm.put("D+", 1.5);
        hm.put("D0", 1.0);
        hm.put("F", 0.0);

        for(int i = 0; i < 20; i++)
        {
            String name = sc.next();
            Double score = sc.nextDouble();
            String pscore = sc.next();

            if(pscore.equals("P"))
            {
                continue;
            }
            else
            {
                sum += score;
                resultSum += (hm.get(pscore) * score);
            }

        }

        System.out.println(resultSum/sum);
    }
}