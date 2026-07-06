import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] arr1 = new int[10000];
        int[] arr2 = new int[10000];
        int[] arr3 = new int[10000];
        
        for(int i = 0; i < 10000; i += 5)
        {
            arr1[i] = 1;
            arr1[i+1] = 2;
            arr1[i+2] = 3;
            arr1[i+3] = 4;
            arr1[i+4] = 5;
        }
        
        for(int i = 0; i < 10000; i += 8)
        {
            arr2[i] = 2;
            arr2[i+1] = 1;
            arr2[i+2] = 2;
            arr2[i+3] = 3;
            arr2[i+4] = 2;
            arr2[i+5] = 4;
            arr2[i+6] = 2;
            arr2[i+7] = 5;
        }
        
        for(int i = 0; i < 10000; i += 10)
        {
            arr3[i] = 3;
            arr3[i+1] = 3;
            arr3[i+2] = 1;
            arr3[i+3] = 1;
            arr3[i+4] = 2;
            arr3[i+5] = 2;
            arr3[i+6] = 4;
            arr3[i+7] = 4;
            arr3[i+8] = 5;
            arr3[i+9] = 5;
        }
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int i = 0; i < answers.length; i++)
        {
            if(answers[i] == arr1[i])
                count1++;
            
            if(answers[i] == arr2[i])
                count2++;
            
            if(answers[i] == arr3[i])
                count3++;
        }
        
        int maxScore = Math.max(count1, Math.max(count2, count3));
        
        List<Integer> list = new ArrayList<>();
        
        if(maxScore == count1)
            list.add(1);
        
        if(maxScore == count2)
            list.add(2);
        
        if(maxScore == count3)
            list.add(3);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}