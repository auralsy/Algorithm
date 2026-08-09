import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        
        for(String s : str)
        {
            if(!s.isEmpty())
            {
                list.add(s);
            }
        }
        String[] answer = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        
        Arrays.sort(answer);
        return answer;
    }
}