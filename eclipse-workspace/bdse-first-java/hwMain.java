package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Action {
	    int factor = 0;
	    int prime = 1;
	    int perfectNumber = 2;
	    int amstrong = 3;
	}

public class hwMain {

	public static void main(String[] args) {
		System.out.print("輸入數字:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("0:	factor");
		System.out.println("1:	prime");
		System.out.println("2:	perfectNumber");
		System.out.println("3:	amstrong");
		System.out.println("輸入動作:");
		Scanner sc1 = new Scanner(System.in);
		int action = sc1.nextInt();

		switch(action) {
    	case Action.factor:
    		System.out.println("factor:"+new factor().getFactor(num));
    		break;
    	case Action.prime:
    		System.out.println("prime:"+prime(num));
    		break;
    	case Action.perfectNumber:
    		System.out.println("perfectNumbers:"+ perfectNumber(num));
    		break;
    	case Action.amstrong:
    		System.out.println("amstrong"+amstrong(num));
    		break;
    	default:
    		System.out.println("無此動作，離開迴圈");
    		break;
		}
		sc1.close();
		sc.close();
	}
	
	static List<Integer> prime(int num){
		List<Integer> primes = new ArrayList<Integer>();
		for(int i=2;i<=num;i++)
			if(new factor().getFactor(i).size()==2)
				primes.add(i);
		return primes;
	}
	
	static List<Integer> perfectNumber(int num){
		List<Integer> perfectNumbers = new ArrayList<Integer>();
		for(int i=2;i<=num;i++)
			if(new factor().factorSum(i)==i)
				perfectNumbers.add(i);
		return perfectNumbers;
	}
	
	static List<Integer> amstrong(int num){
		if(num>99) {
			List<Integer> amstrongs = new ArrayList<Integer>();
			for(int i=100;i<=num;i++) {
				String num2str = Integer.toString(i);
				int sum=0;
				for(int j=0;j<num2str.length();j++)
					sum += Math.pow(Integer.parseInt(num2str.substring(j,j+1)), 3);
				if(sum==i)
					amstrongs.add(i);
			}
			return amstrongs;			
		}else {
			System.out.println("數字需要大於100");
			return null;
		}
	}
}

class factor {
	private List<Integer> factor = new ArrayList<Integer>();
	private int sum = 0;

	List<Integer> getFactor(int num){
		for(int i=1;i<=num/2;i++)
			if(num%i == 0)
				factor.add(i);
		factor.add(num);
		return factor;
	}
	int factorSum(int num) {
		 factor = getFactor(num);
		for(int i=0;i<factor.size()-1;i++)
			sum += factor.get(i);
		return sum;	
	}
}