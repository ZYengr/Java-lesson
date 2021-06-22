package tw.org.iii.zyjava;

public class ZY09 {

	public static void main(String[] args) {
		int a = 10;
		final int b = 11;//final指的是只能給一值而已，所以可以視為常數
		
		switch(a) { //byte, short, int, char, string, enum 
			case 1:
				System.out.println("A");
				break;//break如果沒寫，會繼續往下執行
			case b:
				System.out.println("B");
				break;
			case 100:
				System.out.println("C");
				break;
			default:
				System.out.println("X");
		}
		System.out.println("---");

	}

}
