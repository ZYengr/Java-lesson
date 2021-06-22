package tw.org.iii.zyjava;

import tw.org.iii.myclasses.Bike;
import tw.org.iii.myclasses.Scooter;

public class ZY20 {

	public static void main(String[] args) {
		Bike myBike = new Bike();
		Bike urBike = new Bike();
		System.out.println(myBike.getSpeed());
		System.out.println(urBike.getSpeed());
		System.out.println("---");
		int i =0;
		while(myBike.getSpeed()<5) {
			myBike.upSpeed();
			i++;
		}
		System.out.println(String.format
				("speed is %f,step %d times", myBike.getSpeed(), i));
		System.out.println("------");
		Scooter s1 = new Scooter();
		s1.upSpeed();
		s1.upSpeed();s1.upSpeed();s1.upSpeed();
		s1.downSpeed();
		System.out.println(s1.getSpeed());
	}

}