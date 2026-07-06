import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 0; i < numbers.length-1; i++)
        {
            for(int j = i+1; j < numbers.length; j++)
            {
                que.add(numbers[i] + numbers[j]);
            }
        }
        
        Set<Integer> s = new TreeSet<>(que);
        
        
        int[] answer = new int[s.size()];
        int index = 0;
        for(int ele : s)
        {
            answer[index++] = ele; 
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}