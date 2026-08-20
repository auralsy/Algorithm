class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long bill = 0;
        long addMoney = price;
        
        for(int i = 1; i <= count; i++)
        {
            addMoney = price * i;
            
            bill += addMoney;
        }

        if(money >= bill)
            answer = 0;
        else
        {
            answer = bill - money;
        }
        
        return answer;
    }
}