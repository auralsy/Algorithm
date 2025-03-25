class Solution {
    public int[] solution(int money) 
    {
        int[] answer = new int[2];
        
        int c = 0;
        int r = 0;
        
        if(money < 5500)
            r = money;
        else if(money == 5500)
            c = 1;
        else
        {
            c = (money/5500);
            r = (money%5500);
        }
        
        answer[0] = c;
        answer[1] = r;
        
        return answer;
    }
}