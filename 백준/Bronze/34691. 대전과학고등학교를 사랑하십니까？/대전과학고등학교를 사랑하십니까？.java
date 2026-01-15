import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();

        while(true)
        {
            String str = br.readLine();
            
            if(str.equals("end"))
                break;

            switch(str)
            {
                case "animal" :
                {
                    System.out.println("Panthera tigris");
                    continue;
                }
                case "tree" :
                {
                    System.out.println("Pinus densiflora");
                    continue;
                }
                case "flower" :
                {
                    System.out.println("Forsythia koreana");
                    continue;
                }
            }
        }
    }
    }