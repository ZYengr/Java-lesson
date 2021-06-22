package tw.org.iii.zyjava;

import java.text.Format;
import java.util.Scanner;

public class ZY10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("month = ");
		int month = sc.nextInt();
		int days=0;
		
		switch(month) {
			case 1 :case 3 :case 5 :case 7 :case 8 :case 10 :case 12 :
				days =31;break;
			case 4:case 6:case 9:case 11:
				days =30;break;
			case 2:
				days =28;break;
		}
		System.out.println(String.format("%d月: %d天", month, days));
	}

}
