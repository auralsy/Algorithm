class Solution {
    public String[] solution(String[] str_list) {
        int j = 0;
        
        String[] answer = {};
        
        while(j < str_list.length)
        {
            String str = str_list[j];
            
            if(str.equals("l") || str.equals("r"))
            {
                if(str.equals("l"))
                {
                    answer = new String[j];
                    for(int i = 0; i < j; i++)
                    {
                        answer[i] = str_list[i];
                    }
                    break;
                }
                else if(str.equals("r"))
                {
                    answer = new String[str_list.length - j - 1];
                    int t = 0;
                    for(int i = j+1; i < str_list.length; i++)
                    {
                        answer[t] = str_list[i];
                        t++;
                    }
                    break;
                }
            }
            
            j++;
        }
        
        return answer;
    }
}