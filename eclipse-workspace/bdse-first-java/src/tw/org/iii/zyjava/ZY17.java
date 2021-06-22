package tw.org.iii.zyjava;

public class ZY17 {

	public static void main(String[] args) {
		int[][] a = new int[4][];
		a[0]=new int[3];
		a[1]=new int[1];
		a[2]=new int[2];
		a[3]=new int[1];
		
		for (int[] v: a) {
			for (int vv: v) {
				System.out.print(vv+" ");
			}
			System.out.println();
		}
		

	}

}
