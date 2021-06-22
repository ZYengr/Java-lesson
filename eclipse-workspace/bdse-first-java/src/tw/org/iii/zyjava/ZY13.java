package tw.org.iii.zyjava;

public class ZY13 {

	public static void main(String[] args) {
		int[] a;//陣列的宣告方法
		a = new int[3];//create new array that index=>0~2
		System.out.println(a.length);
		System.out.println("---");
		a[0] = 123;
		a[1] = 987;
		a[2] = 777;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
