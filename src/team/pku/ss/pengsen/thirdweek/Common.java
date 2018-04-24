package team.pku.ss.pengsen.thirdweek;

/**
 *求最大公约数和最小公倍数
 * 输入：两个整数
 * 输出两行：最大公约数和最小公倍数
 * @author pengsen
 */

import java.util.*;
public class Common {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b= input.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }

    //求最大公约数
    //辗转相除法
    static int gcd(int n1, int n2)
    {

        int gcd = 0;
        if (n1 < n2) {

            int a=n2;
            n2=n1;
            n1=a;

        }

        if (n1 % n2 == 0) {
            gcd = n2;
        }

        while (n1 % n2 > 0) {
            n1 = n1 % n2;

            if (n1 < n2) {
                int a=n2;
                n2=n1;
                n1=a;
            }

            if (n1 % n2 == 0) {
                gcd = n2;
            }
        }

        return gcd;
    }
    //最小公约数
    static int lcm(int n1, int n2) {
        return n1 * n2 / gcd(n1, n2);
    }


}
