package team.pku.ss.pengsen.thirdweek;

/**
 * 进制转换
 * 输入第一个整数：待转换的十进制数 第二整数：要转成的进制
 * 转换后整数
 * @author pengsen
 */

import java.util.*;
public class Trans {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int k = input.nextInt();
        trans(m, k);
    }

    static void trans(int m, int k)
    {//请修改代码

        int a[] = new int[1024];
        int i=0;

        for(i = 1; m != 0; i++)
        {
            a[i] = m % k;
            m = m / k;
        }

        i--;
        for(; i !=0; i--){
            //   System.out.println(i+"a"+(a[i]));
            System.out.print((a[i]));
        }


    }

}
