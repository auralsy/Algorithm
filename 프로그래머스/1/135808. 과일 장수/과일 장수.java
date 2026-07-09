import java.util.*;

// 한 상자 사과 m개 / 사과 최대 점수 = k / 한 상자 가격 = 최소 점수 * m / 최대 이익 구해야 함
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 총 상자 개수
        int totalBoxNum = score.length/m;
        
        // 오름차순 정렬
        Arrays.sort(score);
        
        // 수익 발생 시
        if(totalBoxNum != 0)
        {
            if(totalBoxNum == 1)
            {
                int min = score[score.length-m];
                answer += min * m;
            }
            else
            {
                int j = score.length - m;
                
                while(j >= 0)
                {
                    answer += (m * score[j]);
                    
                    j -= m;
                }
            }
        }
        
        return answer;
    }
}