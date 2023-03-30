package week1.day1;

public class Bike {
 public void twoWheeler() {
	 System.out.println("This is my bike");
 }
	public static void main(String[] args) {
		
		Car bmw = new Car();
		bmw.applyBreak();
		bmw.soundHorn();
		Bike rx = new Bike();
		rx.twoWheeler();
	}

}
