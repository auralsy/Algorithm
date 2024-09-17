//입출력 관련
import java.io.BufferedReader;
import java.io.BufferedWriter;
//예외 관련
import java.io.IOException;
//문자열 토큰 관련
import java.util.StringTokenizer;
//입출력 스트림 관련
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[k+1];
		
		for(int i = n+1; i <= k; i++)
			dp[i] = (i/2 >= n && i % 2 == 0? Math.min(dp[i-1], dp[i/2]) : dp[i-1]) + 1;
		
		bw.write(String.valueOf(dp[k]));
		bw.flush();
	}
}