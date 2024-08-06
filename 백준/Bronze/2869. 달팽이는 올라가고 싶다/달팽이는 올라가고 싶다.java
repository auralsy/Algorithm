import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		int s = (v - b) / (a - b) + ((v-b)%(a-b) == 0? 0 : 1);
		
		System.out.println(s);
	}

}
