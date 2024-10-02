import java.io.*;

//완전 탐색 문제
public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 0; // 입력받는 n과 비교할 인덱스
		int num = 666; // 첫 시작점 666
		
		while(true)
		{
			// contains()는 문자열에서 사용하는 메서드(boolean 값 리턴)
			// 문자열에 666 있으면 count 올림
			if(String.valueOf(num).contains("666"))
			{
				count++; 
			}
			
			// 인덱스가 n이랑 같으면 num 출력
			if(n == count)
			{
				System.out.println(num);
				break;
			}
			
			// 다음 수로 넘어감
			num++;
		}
		
		bw.flush();
		bw.close();
	}
}