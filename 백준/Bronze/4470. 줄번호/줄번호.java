import java.io.*;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine(); // 개행문자 처리
		
		String[] str = new String[n];
		
		for(int i = 0; i < n; i++)
		{
			str[i] = sc.nextLine();
		}
		
		for(int i = 0; i < n; i++)
		{
			System.out.printf("%d. " + "%s", i+1, str[i]);
			System.out.println();
		}
	}
}
