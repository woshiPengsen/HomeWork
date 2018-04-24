package team.pku.ss.pengsen.fifthweek;

import java.util.*;

/**
 *
 */
public class LDS{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] num = new int[n];
        int [] length = new int[n];
        int [] index = new int[n];
        for(int i = 0; i < n; i++)
        {
            num[i] = input.nextInt();
            length[i] = 1;
            index[i] = -1;
        }
        int max_length = 1;
        int max_index = -1;

        for(int i = 0; i < n; i++)
            for(int j = i-1; j >= 0; j--)
                if(num[j] > num [i])
                    if(length[j]+1 > length[i])
                    {
                        length[i] = length[j]+1;
                        index[i] = j;
                        if(length[i] > max_length)
                        {
                            max_length = length[i];
                            max_index = i;
                        }
                    }
        int [] dec_sub = new int[max_length];
        int length1 = max_length - 1;

        for(int i = max_index; i >=0; i = index[i] )
            dec_sub[length1--] = num[i];

        for(int i = 0; i < max_length; i++)
            System.out.print(dec_sub[i] + " ");
    }
}
