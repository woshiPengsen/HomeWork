package team.pku.ss.pengsen.fourthweek;
import java.util.*;

/**
 * 求数组最大元素下标
 * 求n个不同整数中，不大于m的最大元素的下标。没有输出-1
 * 输入：5
 *       2 5 3 1 4 （-100-100）
 *       5
 * 输出：1
 *
 */

//自己
    //麻烦
public class Max_index{
    private static Scanner input;

    public static void main(String[] args) {

        input = new Scanner(System.in);
        int n=input.nextInt();
        int arrayMax[]=new int[n];
        arrayMax[0]=input.nextInt();
        int max=arrayMax[0];
        int sign=0;

        int min=max;
        //读取数组并取得最大值最小值对应下标
        for(int i=1;i<n;i++) {
            arrayMax[i]=input.nextInt();
            if(arrayMax[i]>max) {
                max=arrayMax[i];
                sign=i;
            }
            if(arrayMax[i]<min) {
                min=arrayMax[i];
            }

        }

        int m=input.nextInt();
        //判断是否在最大值最小值区间内
        if(m>=max) {
            System.out.println(sign);
            return;
        }else if(min>m) {
            System.out.println("-1");
            return;
        }

        //寻找目标下标
        max=min;
        sign=0;
        for(int i=0;i<n;i++) {
            if(arrayMax[i]<=m&&arrayMax[i]>max) {
                max=arrayMax[i];
                sign=i;
            }
        }
        System.out.println(sign);

    }


}

//助教
/*
public class Max_index {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] num = new int[n];
        for(int i = 0; i < n; i++)
            num[i] = input.nextInt();
        int m = input.nextInt();

        int limited_max = -100;
        int index = -1;
        for ( int i = 0; i < n; i++)
            if(num[i] <= m && num[i] > limited_max)
            {
                index = i;
                limited_max = num[i];
            }
        System.out.println(index);
    }
}
*/