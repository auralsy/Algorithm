import java.io.*;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> que = new LinkedList<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		int l = 0; //큐에 마지막으로 삽입된 값 저장하는 변수
		
		for(int i = 0; i < n; i++)
		{
			//공백 기준 문자 나누기 위해
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			switch(s)
			{
			case "push" :
				l = Integer.parseInt(st.nextToken()); // 다음 토큰 가져옴
				que.offer(l);
				break;
			case "pop" :
				if(que.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(que.poll()).append("\n");
				break;
				//append() -> 큐 값 출력하는것
			case "size":
				sb.append(que.size()).append("\n");
				break;
			case "empty":
				if(que.isEmpty())
					sb.append(1).append("\n");
				else
					sb.append(0).append("\n");
				break;
			case "front":
				if(que.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(que.peek()).append("\n");
				break;
			case "back":
				if(que.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(l).append("\n");
				break;
			}
		}
		System.out.println(sb); //sb에 모아둔 값 출력
	}
}
