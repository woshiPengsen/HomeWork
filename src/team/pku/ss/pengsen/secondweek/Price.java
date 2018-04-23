package team.pku.ss.pengsen.secondweek;

/**
 * 价格统计，给出四种水果重量及价格，四舍五入输出对应钱数及总钱数。
 * @pengsen
 */

import java.util.Scanner;
public class Price {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double watermelon = 1.2;
        double peach = 3.5;
        double grape = 4.5;
        double apple = 5;

        double wmWeight 	= input.nextDouble();
        double peachWeight 	= input.nextDouble();
        double grapeWeight 	= input.nextDouble();
        double appleWeight 	= input.nextDouble();

        double wmPrice	 	= watermelon * wmWeight;
        double peachPrice 	= peach * peachWeight;
        double grapePrice 	= grape * grapeWeight;
        double applePrice	= apple * appleWeight;

        double totalPrice 	= wmPrice + peachPrice + grapePrice + applePrice;


        System.out.println(String.format("%.1f", wmPrice));
        System.out.println(String.format("%.1f", peachPrice));
        System.out.println(String.format("%.1f", grapePrice));
        System.out.println(String.format("%.1f", appleWeight));
        System.out.println(String.format("%.1f", totalPrice));
        input.close();
    }
}
