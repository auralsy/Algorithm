import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // 리스트에 담기
        for(int i = 0; i < arr.length; i++)
        {
            list.add(arr[i]);
        }
        
        // 쿼리 수행
        for(int i = 0; i < query.length; i++)
        {
            if(i % 2 == 0)
            {
                while(list.size() > query[i] + 1)
                {
                    list.remove(list.size()-1);
                }
            }
            else
            {
                for(int j = 0; j < query[i]; j++)
                {
                    list.remove(0);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}