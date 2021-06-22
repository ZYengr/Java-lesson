package tw.org.iii.zyjava;

import java.util.Arrays;

public class PokerV3 {

	public static void main(String[] args) {
		int num = 52;
		int[] poker = new int[num];
		for(int i=0;i<poker.length;i++) poker[i]=i;
		for(int i=num-1;i>0;i--) {
			int rand = (int)(Math.random()*(i+1));
			
			//poker[rand]<=>poker[i]
			int temp = poker[i];
			poker[i]=poker[rand];
			poker[rand]=temp;
		}
		for(int v:poker) {
			System.out.print(v+" ");
		}
		System.out.println();
		
		//----------------------------------
		String[] suits = {"黑桃","紅心","方塊","梅花"};
		String[] values = {"A","1","2","3","4","5","6","7"
				,"8","9","10","J","Q","K"};
		int[][] players = new int[4][13];
		for (int i=0;i<52;i++) {
			players[i%4][i/4]=poker[i];
		}
		for(int[] player:players) {
			Arrays.sort(player);
			for(int card:player) {
				System.out.print(suits[card/13]+values[card%13]+" ");
			}
			System.out.println();
		}
	}
}
