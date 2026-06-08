class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int n = 0;
        for(int i = 0; i < todo_list.length; i++)
        {
            if(finished[i] == false)
                n += 1;
        }
        
        String[] answer = new String[n];
        int j = 0;
        for(int i = 0; i < todo_list.length; i++)
        {
            if(finished[i] == false)
            {
                answer[j] = todo_list[i];
                j += 1;
            }
                
        }
        return answer;
    }
}