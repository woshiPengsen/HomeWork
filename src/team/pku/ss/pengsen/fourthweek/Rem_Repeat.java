package team.pku.ss.pengsen.fourthweek;
import java.util.*;

public class Rem_Repeat {
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        int n=input.nextInt();
        int array[]=new int[n];

        for(int i=0;i<n;i++) {
            array[i]=input.nextInt();
        }

        int sign=0;

        //用冒泡排序进行递增排序
        for(int i=0;i<n;i++) {

            for(int j=0;j<n-1-i;j++) {

                if(array[j]>array[j+1]) {
                    int m=array[j];
                    array[j]=array[j+1];
                    array[j+1]=m;
                }

//				//若相等则直接做覆盖赋值
//				if(array[j]==array[j+1]) {
//					sign++;
//					for(int s=j;s<n-sign;s++) {
//						array[s]=array[s+1];
//					}
//					j--;
//				}


            }

        }


//		for(int i=0;i<n;i++) {
//			System.out.print(array[i]+" ");
//		}
//		System.out.println();


        int a[]=new int[n];
        //用一个新数组储存没有重复的数值
        int total=0;
        for(int i=0,j=0;i<n-1;i++) {
            if(array[i]!=array[i+1]) {
                a[j++]=array[i];
            }else{
                total++;
            }
        }
        a[n-1-total]=array[n-1];

        for(int i=0;i<n-total;i++) {
            System.out.print(a[i]+" ");
        }


        System.out.println();
    }

}


//助教
    //没有实现对任意数目数组的输入
/*
public class Rem_Repeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++)
            num[i] = input.nextInt();

        //冒泡排序
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n - 1 - i; j++)
                if (num[j] > num[j + 1]) {
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                }

        System.out.print(num[0] + " ");
        for (int i = 1; i < n; i++)
            if (num[i] != num[i - 1])
                System.out.print(num[i] + " ");//保证输出是严格递增的

        input.close();
    }
}
*/