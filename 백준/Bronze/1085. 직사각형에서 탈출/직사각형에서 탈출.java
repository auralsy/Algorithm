import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int east = w - x;
        int west = x;
        int south = y;
        int north = h - y;
        
        int min = east;
        
        if(min > west)
            min = west;
        
        if(min > south)
            min = south;
        
        if(min > north)
            min = north;

        System.out.println(min);
    }
}