/* 
 버퍼 사용하여 데이터 효율적으로 읽을 수 있게 함
 버퍼 사용 -> 일정량 데이터 한꺼번에 저장 -> 조금씩 읽어오기 -> 성능 향상
 */
import java.io.BufferedReader; 
/*
 입출력 작업 중 예외 처리에 사용
 예외 발생 가능 상황 : 파일 없음, 읽쓰 불가능 상황, 네트워크 연결 없음, 스트림 오류
 오류 발생 가능성 높은 코드에 대한 예외 처리 위해 사용
 */
import java.io.IOException;
/*
 바이트 스트림 -> 문자 스트림
 InputStream(바이트 기반 입력 스트림) -> Reader(문자 기반 입력 스트림)
 즐, 어댑터 역할!
 바이트 데이터 -> 문자 데이터
 */
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException
	{
		//입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//입력이 br을 통한 것이므로 이걸 정수로 변환
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++)
		{
			//공백 기준으로 분리(단어 단위로 분리 됨)
			String[] w = br.readLine().split(" ");
			
			//w배열에서 단어 하나씩 가져와 처리, 단어 가져와 변수 word에 저장하고 순차적으로 처리
			for(String word : w) 
			{
				//문자열 조작 클래스
				StringBuilder sb = new StringBuilder(word);
				//StringBuilde -> 가변 문자열, String -> 불변 문자열
				//가변 -> 조작 쉬움 단, System.out은 불변 문자열 출력할 수 있음
				//따라서 마지막에 to.String()으로 가변 -> 불변 해줌
				System.out.print(sb.reverse().toString() + " ");
			}
			System.out.println();
		}
		br.close();
	}
}
