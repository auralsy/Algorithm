class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        if (isParallel(dots[0], dots[1], dots[2], dots[3])) 
            answer = 1;
        if (isParallel(dots[0], dots[2], dots[1], dots[3])) 
            answer = 1;
        if (isParallel(dots[0], dots[3], dots[1], dots[2])) 
            answer = 1;
        
        return answer;
    }
    
    private boolean isParallel(int[] a, int[] b, int[] c, int[] d) {
        long dy1 = a[1] - b[1];
        long dx1 = a[0] - b[0];
        long dy2 = c[1] - d[1];
        long dx2 = c[0] - d[0];
        
        return (dy1 * dx2 == dy2 * dx1);
    }
}