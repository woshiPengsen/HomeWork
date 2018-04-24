package team.pku.ss.pengsen.secondweek;
import java.util.Scanner;
/**
 *
 */
public class Fee {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int N= input.nextInt();

//        int fee = (int)((N <= 3) ? 14: (14 + (N-3) * 2.3 + 0.5));
//        //+0.5为啥：为了四舍五入？
//        //强制类型转换会直接删去小数部分，不能四舍五入，加0.5后恰好借此形成四舍五入
//        System.out.println(fee);


        double money;
        if(N<=3){
            money=14;
        }else{
            money=14+2.3*(N-3);
        }

        String t=String.format("%.0f",money);
        System.out.println(t);
    }

}
