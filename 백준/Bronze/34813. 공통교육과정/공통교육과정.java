import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        
        char c = str.charAt(0);
        
        switch(c)
        {
            case 'F' :
                System.out.println("Foundation");
                break;
            case 'C':
                System.out.println("Claves");
                break;
            case 'V':
                System.out.println("Veritas");
                break;
            case 'E':
                System.out.println("Exploration");
                break;
        }
    }
    }