import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(bf.readLine());
		
		//초기화 값(빈 문자열)
		String ans = "";
		
		for(int i = 0; i < n; i++)
		{
			String str = bf.readLine();
			
			if(str.contains("S"))
			{
				ans = str;
			}
		}
		
		sb.append(ans);
		System.out.println(sb.toString());
	}
}