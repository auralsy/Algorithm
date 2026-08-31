class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        // 긴 변을 가로로 몰아버리기
        for(int i = 0; i < sizes.length; i++)
        {
            if(sizes[i][0] < sizes[i][1])
            {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        int rLen = 0;
        int cLen = 0;
            
        
        // 가로, 세로 각각 최대 길이 설정
        for(int i = 0; i < sizes.length; i++)
        {
            if(sizes[i][0] > rLen)
                rLen = sizes[i][0];
            
            if(sizes[i][1] > cLen)
                cLen = sizes[i][1];
        }
        
        answer = rLen * cLen;
        
        return answer;
    }
}