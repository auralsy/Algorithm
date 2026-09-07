// 점수|보너스|옵션
// 점수 -> 0~10 / 보너스 -> S,D,T(제곱) / 옵션 -> *(2배), #(마이너스) 없을수도

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] str = dartResult.split("");
        int ind = -1;
        int[] score = new int[3];
        
        for(int i = 0; i < str.length; i++)
        {
            if(str[i].matches("[0-9]"))
            {
                ind++;
                if(str[i+1].matches("[0-9]"))
                {
                    score[ind] = Integer.parseInt(str[i]) * 10;
                    i++;
                }
                else
                {
                    score[ind] = Integer.parseInt(str[i]);
                }
            }
            
            switch(str[i])
            {
                case "D" :
                    score[ind] = score[ind] * score[ind];
                    break;
                case "T" :
                    score[ind] = score[ind] * score[ind] * score[ind];
                    break;
                case "*":
                    score[ind] *= 2;
                    if(ind - 1 >= 0) score[ind - 1] *= 2;
                    break;
                case "#" :
                    score[ind] *= -1;
                    break;
            }
        }
        
        for(int i = 0; i < 3; i++)
        {
            answer += score[i];
        }
        
        return answer;
    }
}