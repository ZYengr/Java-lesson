package tw.org.iii.zyjava;

public class PokerV2 {

	public static void main(String[] args) {
		//洗牌
		long start_t=System.currentTimeMillis();//start time
		boolean isRepeat;
		int rand;
		int[] poker = new int[52];
		for (int i=0; i<poker.length; i++) {
			
			do {
				rand = (int)(Math.random()*52);	// 0 - 51
				
				// 檢查機制
				isRepeat = false;
				for (int j=0; j<i; j++) {
					if (poker[j] == rand) {
						// 重複了
						isRepeat = true;
						break;
					}
				}
			}while (isRepeat);
			
			poker[i] = rand;
			System.out.println(poker[i]);
			
			
		}

		long end_t=System.currentTimeMillis();//end time
		System.out.print("time:");
		System.out.println(end_t-start_t);
		//發牌
		//攤牌->理牌

	}

}
