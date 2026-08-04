// 안 마신 콜라 수, 빈 병 수
import java.util.*;

class Solution {
    static int count = 0;
    
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        if(a > n)
            answer = 0;
        else
        {
            answer = cola(a, b, n);
        }
        
        return answer;
    }
    
    public int cola(int a, int b, int n)
    {
        int notYetCola = n;
        int givenCola = 0;
        int emptyBottle = 0;
        
        givenCola = (notYetCola / a) * b;
        count += givenCola;
        emptyBottle = notYetCola / a * a;
        notYetCola = notYetCola - emptyBottle + givenCola;
        
        if(notYetCola >= a)
        {
            return cola(a, b, notYetCola);
        }
        else
        {
            return count;
        }
    }
}