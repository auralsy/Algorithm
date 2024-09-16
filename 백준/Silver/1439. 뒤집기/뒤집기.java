import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int count_number = 0;
		char arr = str.charAt(0);
		
		for(int i = 1; i < str.length(); i++)
		{
			if(arr != str.charAt(i))
			{
				arr = str.charAt(i);
				
				count_number++;
			}
		}
		
		int f = ((count_number) / 2 + (count_number % 2));
		
		System.out.println(f);
	}
}
