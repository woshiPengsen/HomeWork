package team.pku.ss.pengsen.fifthweek;
import java.util.*;
/**
 * 冒泡排序
 * 输入：一行数字
 * 输出：排好序的数字
 *难点是解决一行不定数目的整型数组的输入
 */

//自己写
    /*

public class Bubble{

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        String s= input.nextLine();
        String[] str=s.split("");


        int num[]=new int[s.length()];

        //获取除了最后一组数以外的其他数字


        int c=s.indexOf(' ');

//		String intstring=s.substring(0,c);
//		int num1=Integer.parseInt(intstring);
//     	System.out.print("num1="+num1);
//		num[0]=num1;



        int j=0;
        int i=0;
        int total=0;//统计一共有多少数字

        //输入最后一个空格之前的所有数字至对应整型数组内
        c=s.indexOf(' ');
        while(c!=-1) {

            String intstring1=s.substring(i,c);
            int num2=Integer.parseInt(intstring1);
            num[j++]=num2;
            total++;
            i=c+1;
            c=s.indexOf(' ',i);
        };


        //将最后一个空格之后的数字输入
        String intstring1=s.substring(i);
        int num3=Integer.parseInt(intstring1);
        num[j]=num3;
        total++;

        //冒泡排序
        for(int i1=0;i1<total;i1++) {
            for(int j1=0;j1<total-1;j1++) {
                if(num[j1]>num[j1+1]) {
                    num[j1]+=num[j1+1];
                    num[j1+1]=num[j1]-num[j1+1];
                    num[j1]=num[j1]-num[j1+1];
                }
            }
        }

        //输出前total项
        int i1=0;
        for(i1=0;i1<total-1;i1++) {
            System.out.print(num[i1]+" ");
        }


        System.out.print(num[i1]);
    }
}
*/

public class Bubble{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        while(input.hasNext())
            list.add(input.nextInt());
        for(int i = 0; i < list.size(); i++)
            for(int j = 0; j < list.size() - i - 1; j++)
                if(list.get(j) > list.get(j+1))
                {
                    int temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1, temp);
                }
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");

    }
}