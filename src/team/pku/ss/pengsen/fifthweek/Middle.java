package team.pku.ss.pengsen.fifthweek;

import java.util.*;

/**
 *
 */
public class Middle{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int [] A = new int[m];
        for(int i = 0; i < m; i++)
            A[i] = input.nextInt();

        int n = input.nextInt();
        int [] B = new int[n];
        for(int j = 0; j < n; j++)
            B[j] = input.nextInt();

        int cnt = (m+n)/2;
        int [] C = new int[cnt+1];
        int i = 0;
        int j = 0;
        int k = 0;

        for(; k <= cnt && i < m && j < n ; k++)
        {
            if(A[i] < B[j])
                C[k] = A[i++];
            else
                C[k] = B[j++];
        }
        if(i < m)
            for(; k <= cnt; k++)
                C[k] = A[i++];
        else
            for(; k <= cnt ; k++)
                C[k] = B[j++];

        if((m+n) % 2 == 0)
            System.out.println(String.format("%.5f",(float)(C[k-2]+C[k-1])/2));
        else
            System.out.println(C[k-1]);
    }
}
