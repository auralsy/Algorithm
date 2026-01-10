import java.io.*;
import java.util.*;

public class Main {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;
    
    public static void main(String args[]) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int resu = 0;

        char[] A = new char[n]; // 입력받는 문자열
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;
        
        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++)
        {
            checkArr[i] = Integer.parseInt(st.nextToken());
            
            if(checkArr[i] == 0)
                checkSecret++;
        }
        
        for(int i = 0; i < m; i++)
        {
            Add(A[i]);
        }
        
        if(checkSecret == 4)
            resu++;
        
        for(int i = m; i < n; i++)
        {
            int j = i - m;
            Add(A[i]);
            Remove(A[j]);
            
            if(checkSecret == 4)
                resu++;
        }
        System.out.println(resu);
        br.close();
    }
    
    private static void Add(char c)
    {
        switch(c)
        {
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0])
                    checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1])
                    checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2])
                    checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3])
                    checkSecret++;
                break;
        }
    }
    
    private static void Remove(char c)
    {
        switch(c)
        {
            case 'A':
                if(myArr[0] == checkArr[0])
                    checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1])
                    checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2])
                    checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3])
                    checkSecret--;
                myArr[3]--;
                break;
        }
    }
    }