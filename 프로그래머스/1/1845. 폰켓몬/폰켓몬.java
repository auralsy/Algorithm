import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        TreeSet<Integer> ts = new TreeSet<>();
        for(int num : nums)
        {
            ts.add(num);
        }
        
        
        int n = nums.length/2;
        
        if(ts.size() >= n)
            answer = n;
        else if(ts.size() < n)
            answer = ts.size();
        
        return answer;
    }
}