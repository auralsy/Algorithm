import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int basePrice = 250;

        if (s <= a) 
        {
            System.out.println(basePrice);
        } 
        else 
        {
            int additionalHeight = s - a;
            int additionalLayers = (int) Math.ceil((double) additionalHeight / b);
            int totalPrice = basePrice + additionalLayers * 100;
            System.out.println(totalPrice);
        }
    }
}