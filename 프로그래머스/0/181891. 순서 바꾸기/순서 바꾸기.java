import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
        {
            list.add(num_list[i]);
        }
        
        int j = 0;
        
        for(int i = n; i < num_list.length; i++)
        {
            answer[j] = num_list[i];
            j++;
        }
        
        int t = 0;
        
        for(int i = j; i < num_list.length; i++)
        {
            answer[i] = list.get(t);
            t++;
        }
        
        return answer;
    }
}