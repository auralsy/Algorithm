import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int du = sc.nextInt();
        int nd = sc.nextInt();
        int aim = sc.nextInt();

        int day = (aim-nd)/(du-nd) + ((aim-nd)%(du-nd) == 0? 0:1);

        System.out.println(day);
    }
}