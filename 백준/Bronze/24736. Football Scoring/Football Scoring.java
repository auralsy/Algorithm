import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		
		for(int i = 0; i < 5; i++)
			arr1[i] = sc.nextInt();
		for(int i = 0; i < 5; i++)
			arr2[i] = sc.nextInt();
		
		int k = arr1[0]*6 + arr1[1]*3 + arr1[2]*2 + arr1[3]*1 + arr1[4]*2;
		int s = arr2[0]*6 + arr2[1]*3 + arr2[2]*2 + arr2[3]*1 + arr2[4]*2;
		
		System.out.printf("%d %d", k, s);
	}
}