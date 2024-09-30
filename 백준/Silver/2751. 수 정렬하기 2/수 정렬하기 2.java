import java.util.Arrays;
//java.io.~ 는 다 임포트하는것
import java.io.*;

//scanner하고 sysout으로 하니까 시간 초과 나옴
//그래서 bufferd랑 stream 사용

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < n; i++)
		{
			//bw.write()는 문자열을 버퍼에만 기록(바로 출력 ㄴㄴ)
			bw.write(arr[i] + "\n");
		}
		
		bw.flush(); //BufferedWriter에 저장된 내용을 출력 버퍼에서 실제 출력 스트림으로 보냄.
		bw.close(); //BufferedWriter를 닫아 자원 해제.
	}
}
