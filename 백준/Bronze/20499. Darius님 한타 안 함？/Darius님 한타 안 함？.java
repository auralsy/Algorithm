import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String KDA = sc.nextLine();
		sc.close();

		String[] arr = KDA.split("/");

		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) < Integer.parseInt(arr[1])
					|| Integer.parseInt(arr[1]) == 0) {
				result = "hasu";
			} else {
				result = "gosu";
			}
		}
		System.out.println(result);
	}

}