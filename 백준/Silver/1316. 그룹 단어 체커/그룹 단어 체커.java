import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int count = 0; // 그룹 단어의 개수

        int n = sc.nextInt();
        sc.nextLine();

        // 입력 단어 개수 만큼 반복
        for(int i = 0; i < n; i++)
        {
            boolean[] checkList = new boolean[26]; // 등장했는지 확인하는 체리
            char pre_c = '?'; // 직전 글자 저장 변수
            boolean endOfLoop = true;
            String str = sc.nextLine();

            // 입력 단어마다 한글자씩 반복
            for(int j = 0; j < str.length(); j++)
            {
                char c = str.charAt(j);

                if(pre_c != c)
                {
                    if(checkList[c - 'a'])
                    {
                        endOfLoop = false;
                        break;
                    }
                    else
                    {
                        checkList[c - 'a'] = true;
                    }
                }

                pre_c = c;
            }

            // 실패가 없었다면 정답 + 1
            if(endOfLoop)
                count++;
        }

        System.out.println(count);
    }
}