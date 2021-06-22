package tw.org.iii.zyjava;

import java.util.Scanner;

public class ZY03 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("a= ");
		a = sc.nextInt();
		System.out.print("b= ");
		b = sc.nextInt();
		int v1 = a+b;
		int v2 = a-b;
		int v3 = a*b;
		int v4 = a/b;
		int v5 = a%b;
		System.out.println(String.format("%d+%d=%d",a,b,v1));
		System.out.println(String.format("%d-%d=%d",a,b,v2));
		System.out.println(String.format("%dX%d=%d",a,b,v3));
		System.out.println(String.format("%d/%d=%d ... %d",a,b,v4,v5));
		sc.close();
	}
}