package tw.org.iii.zyjava;

public class ZY19 {

	public static void main(String[] args) {
		
		int n = 50;
		int i = 1;
		int sum=0;
		while(i<=n) {
			sum+=i++;
		}
		System.out.println(String.format("1 + 2 + ... + %d = %d", n, sum));

	}

}
