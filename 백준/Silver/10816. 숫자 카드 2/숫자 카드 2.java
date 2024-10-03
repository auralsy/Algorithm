import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException
	{
		
		 Scanner sc = new Scanner(System.in);
	        StringBuilder sb = new StringBuilder(); // 문자열 조작 가능하게 하는 class

	        int N = sc.nextInt();
	        int[] A = new int[N];

	        for (int i = 0; i < A.length; i++) 
	        {
	            A[i] = sc.nextInt();
	        }

	        int M = sc.nextInt();

	        Arrays.sort(A); //정렬 for 이진탐색

	        for (int i = 0; i < M; i++) 
	        {
	            int target = sc.nextInt();
	                sb.append(upperBound(A, target) - lowerBound(A, target)).append(" ");
	        }
	        System.out.println(sb);

	    }
	
	
	    public static int upperBound(int[] arr, int target)
	    {
	        int left = 0;
	        int right = arr.length;
	        while(left<right)
	        {
	            int mid = (left+right)/2;
	            if(target < arr[mid])
	            {
	                right = mid;
	            }else left=mid + 1;
	        }
	        return left;
	    }
	    
	    
	    public static int lowerBound(int[] arr, int target)
	    {
	        int left = 0;
	        int right = arr.length;
	        while(left<right)
	        {
	            int mid = (left+right)/2;
	            if(arr[mid]>=target)
	            {
	                right = mid;
	            }else left = mid + 1;
	        }
	        return left;
	    }
}