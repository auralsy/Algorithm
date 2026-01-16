import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            if (n <= 10000) {
                System.out.println("Accepted");
            } else {
                System.out.println("Time limit exceeded");
            }
        }
        
        sc.close();
    }
}