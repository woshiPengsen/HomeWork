package team.pku.ss.pengsen.secondweek;
/**
 * 判断日期是否符合格式
 * @彭森
 */

/*
public class Date{
	public static void main(String[] args){
		int N;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();

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
 */

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Date1 d = new Date1();

        d.year = scanner.nextInt();
        d.month = scanner.nextInt();
        d.day = scanner.nextInt();

        if (d.isValidDate())
            System.out.println(1);
        else
            System.out.println(0);

    }
}

class Date1{
    int year;
    int month;
    int day;
    public boolean isLeapYear(int y){
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
            return true;
        return false;
    }
    public boolean isValideMonth(int m){
        if (m > 0 && m < 13)
            return true;
        return false;
    }
    public int daysInMonth(int y,int m){
        switch (m){
            case 4: return 30;
            case 6: return 30;
            case 9: return 30;
            case 11: return 30;
            case 2 :
                if(isLeapYear(y)==true) return 29;
                return 28;
            default: return 31;
        }
    }

    public boolean isValidDate(){
        if(isValideMonth(this.month) == true && this.day > 0 && this.day <= daysInMonth(this.year,this.month))
            return true;
        return false;
    }
}
