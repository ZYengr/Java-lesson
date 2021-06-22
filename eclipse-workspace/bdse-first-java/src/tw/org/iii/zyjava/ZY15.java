package tw.org.iii.zyjava;

public class ZY15 {

	public static void main(String[] args) {
		int[] p;
		p = new int[7];
		
		for(int i=0;i<100000;i++) {
			int point = (int)(Math.random()*6)+1;
			if(point<1 || point>6) {
				p[0]++;
			}else {
				p[point]++;
			}
		}
		if(p[0]==0) {
			String format = "%d點出現%d次";
			for (int i=1; i<p.length;i++) {
				System.out.println(String.format(format, i,p[i]));
			}
		}else {
			System.out.println("ERR!");
		}
		

	}

}