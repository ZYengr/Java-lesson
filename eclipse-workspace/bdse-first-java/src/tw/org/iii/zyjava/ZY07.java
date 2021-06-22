package tw.org.iii.zyjava;

import java.util.Scanner;

public class ZY07 {
	public static void main(String[] args) {
		int score;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Score = ");
//		score = sc.nextInt();
		//亂數產生0-100的整數成績，範圍中有101個值
		int weight = 101; 
		score = (int)(Math.random()*weight);
		//大樂透，1-49，範圍中有49個值
		//score = (int)(Math.random()*49)+1;
		System.out.println(score);
		if (score >= 90) {
			System.out.println("A");
		}else {
			if (score >=80) {
				System.out.println("B");
			}else {
				if (score >=70) {
					System.out.println("C");
				}else {
					if (score >=60) {
						System.out.println("D");
					}else {
						System.out.println("E");
					}
				}
			}
		}
		System.out.println("----");
		// else if只是巢狀結構的變型
		if (score >= 90) {
			System.out.println("A");
		}else if (score >=80) {
			System.out.println("B");
		}else if (score >=70) {
			System.out.println("C");
		}else if (score >=60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		
	}

}
