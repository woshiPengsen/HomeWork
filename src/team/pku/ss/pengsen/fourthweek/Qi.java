package team.pku.ss.pengsen.fourthweek;
import java.util.*;
/**
 *井字棋
 * 判断3*3方格那方获胜
 *
 */

public class Qi{
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        Scanner input = new Scanner(System.in);
        for(int row=0;row<a.length;row++) {
            for(int colum =0;colum<a[row].length;colum++) {
                a[row][colum]=input.nextInt();
            }
        }


        int sign1=0,sign2=0;

        for(int i=0;i<3;i++) {
            sign1=0;sign2=0;
            for(int j=0;j<3;j++) {
                if(a[i][j]==0) {
                    sign1++;
                }else {
                    sign2++;
                }
            }
            if(sign1==3||sign2==3) {
                break;
            }
        }


        if(sign1!=3&&sign2!=3) {
            for(int i=0;i<3;i++) {
                sign1=0;sign2=0;
                for(int j=0;j<3;j++) {
                    if(a[j][i]==0) {
                        sign1++;
                    }else {
                        sign2++;
                    }
                }
                if(sign1==3||sign2==3) {
                    break;
                }
            }
        }



        if(sign1!=3&&sign2!=3) {
            sign1=0;sign2=0;
            for(int i=0;i<3;i++) {
                if(a[i][i]==0) {
                    sign1++;
                }else {
                    sign2++;
                }
            }
        }

        if(sign1!=3&&sign2!=3) {
            sign1=0;sign2=0;
            for(int i=0;i<3;i++) {
                if(a[i][3-i-1]==0) {
                    sign1++;
                }else {
                    sign2++;
                }
            }
        }

        if(sign1==3) {
            System.out.println("Alice Win");
        }else if(sign2==3) {
            System.out.println("Bob Win");
        }else {
            System.out.println("Draw");
        }




    }
}

//助教
    //通过tag区分谁赢，通过有三个全等判断有人赢
    /*
public class Qi {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int [][] num = new int[3][3];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                num[i][j] = input.nextInt();

        int tag = -1;
        for(int i = 0; i < 3; i++){
            if(num[i][0] == num[i][1] && num[i][1] == num[i][2])
                tag = num[i][0];
        }


        for(int j = 0; j < 3; j++){
            if(num[0][j] == num[1][j] && num[1][j] == num[2][j])
                tag = num[0][j];
        }

        for(int i = -1; i < 2; i += 2){
            if(num[0][1+i] == num[1][1] && num[1][1] ==num[2][1-i])
                tag = num[0][1+i];
        }

        if(tag == 0)
            System.out.print("Alice Win");
        else if(tag == 1)
            System.out.print("Bob Win");
        else
            System.out.print("Draw");
    }
}
*/