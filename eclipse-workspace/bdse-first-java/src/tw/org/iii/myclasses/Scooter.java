package tw.org.iii.myclasses;

public class Scooter extends Bike{
	public void upSpeed() {
		speed = speed <1?1:speed*1.8;
	}
}
