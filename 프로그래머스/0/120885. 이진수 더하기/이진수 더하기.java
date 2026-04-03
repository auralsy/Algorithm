import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        int bit1 = Integer.parseInt(bin1, 2);
        int bit2 = Integer.parseInt(bin2, 2);
        
        answer = Integer.toBinaryString(bit1 + bit2);
        
        return answer;
    }
}