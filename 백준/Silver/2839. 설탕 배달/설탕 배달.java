import java.util.Arrays;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int sum = -1; // 못 나눌때 값을 기본으로 설정
		
		
		for(int i = (n/5); i >= 0; i--)
		{ // i는 5kg로 채울 수 있는 최대 수
			int rmd = n - (i * 5); // 남은 키로수
			
			if(rmd % 3 == 0) // 남은게 3으로 나눠지면 계산하고 아님 -1
			{
				sum = i + (rmd / 3);
				break;
			}
		}
		
		bw.write(String.valueOf(sum)); 
		// bw.write 자체가 문자열 출력이라 sum을 문자열로 변환해줘야함.
		
		bw.flush();
		bw.close();
	}
}