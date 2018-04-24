package team.pku.ss.pengsen.thirdweek;
import java.util.Scanner;
/**
 * 简单斐波那契数列
 * 输入一行，包括一个整数N
 * 输出一行，包括一个整数，为斐波那契第N项值
 * @pengsen
 */

//自己做
    /*与助教的流式处理大同
public class Fib {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int s=0;
        int i=0;
        Scanner input = new Scanner(System.in);
        int N=input.nextInt();
        if(N==0) {
            System.out.println(0);
            return;
        }else if(N==1) {
            System.out.println(1);
            return;
        }
        for(i=2;i<=N;i++) {
            s=n1+n2;
            n1=n2;
            n2=s;
        }
        System.out.println(s);
    }

}
*/

//助教
    //数组
    /*
public class Fib{
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        long [] fib = new long[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i <= n; i++)
            fib[i] = fib[i-1] + fib[i-2];
        System.out.print(fib[n]);
    }
}
*/
    //流式处理
    /*
public class Fib{
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        if (n == 0)
        {
            System.out.print("0");
            return;
        }
        else
        {
            long fib_pre = 0;
            long fib_med = 1;
            long fib_post = fib_med;
            while(--n > 0)
            {
                fib_post = fib_pre + fib_med;
                fib_pre = fib_med;
                fib_med = fib_post;
            }
            System.out.print(fib_post);
        }
    }
}
    */

    //类方法
    //递归往回找，并计数
public class Fib{
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        long fib_n = fib(n);                //使用long 防止越界
        System.out.println(fib_n);
    }
    static long fib(int n)
    {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
}