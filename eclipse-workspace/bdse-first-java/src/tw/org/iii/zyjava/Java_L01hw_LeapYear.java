package tw.org.iii.zyjava;

import java.util.Scanner;

public class Java_L01hw_LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("輸入年份");
		int year = sc.nextInt();
		if ((year%4==0 && year%100!=0)||year%400==0) {
			System.out.println(String.format("%d是閏年", year));
		}else {
			System.out.println(String.format("%d是平年", year));
		}
		sc.close();
	}

}
