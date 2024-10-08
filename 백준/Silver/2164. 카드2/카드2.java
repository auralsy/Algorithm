import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 int n = Integer.parseInt(br.readLine());
		 
		 //큐 & 연결리스트로 풀이
		 Queue<Integer> queue = new LinkedList<>();
		 
		 //가드값 대입
		 for(int i = 1; i <= n; i++)
		 {
			 queue.add(i);
		 }
		 
		 //규칙 실행
		 while(queue.size() > 1)
		 {
			 queue.poll(); // 맨 앞에 있는 요소 버림
			 queue.add(queue.poll()); // 다음거 버리면서 동시에 뒤에 추가
		 }
		 
		 // 마지막 남은 거 출력, write는 문자열을 인자로 받음 -> 숫자 출력시 string으로 변환해줘야함
		 bw.write(String.valueOf(queue.poll())); // 마지막 남은거 출력
		 
		 bw.flush(); // 버퍼 비우는 역할
		 bw.close(); // 출력 스트림 닫고 관련 기능 해제. 호출시 자동으로 flush() 호출됨. 
		 
	}
}