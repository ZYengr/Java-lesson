package tw.org.iii.zyjava;

public class ZY04 {

	public static void main(String[] args) {
		int a =10;
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		System.out.println("---");
		int b =a++;//++在變數後面，代表先回傳給b，再執行++
		System.out.println(a);
		System.out.println(b);
		System.out.println("---");
		b =++a;//vise versa
		System.out.println(a);
		System.out.println(b);
		b += 123;
		System.out.println(b);
	}

}
