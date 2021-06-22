package tw.org.iii.zyjava;

public class ZY16 {

	public static void main(String[] args) {
		//矩陣:matrix =>空間
		//陣列:array =>記憶體資料=>線性
		int[][] a = new int[3][4];
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println("---");
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("---");
		int [] b = new int[] {1,2,3,4};
		
		//for-each，較為死板
		for (int v:b) { 
			System.out.print(v+" ");
		}
		System.out.println("\n---");
		
		for (int[] v : a) {
			for (int vv : v) {
				System.out.print(vv +" ");
			}
			System.out.println();
		}
	}
}
