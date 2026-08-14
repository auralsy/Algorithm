// 원소 k배, 각 문자 k배

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        // picture 원소 자체를 k배
        for(int i = 0; i < picture.length; i++)
        {
            String str = "";
            for(int j = 0; j < picture[i].length(); j++)
            {
                char c = picture[i].charAt(j);
                
                for(int t = 0; t < k; t++)
                {
                    str += String.valueOf(c);
                }
            }
            picture[i] = str;
        }
        
        // picture 원소들을 k개씩 answer에
        int ind = 0;
        for(int i = 0; i < picture.length; i ++)
        {
            for(int j = 0; j < k; j++)
            {
                answer[ind] = picture[i];
                ind++;
            }
        }
        
        return answer;
    }
}