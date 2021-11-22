class Bicycle {
	public int cadence = 0;
	public int speed = 0;
	public int gear = 0;

	public Bicycle(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}

	public void changeCadence(int newValue){
		cadence = newValue;
	}

	public void changeGear(int newValue){
		gear = newValue;
	}

	public void speedUp(int increment){
		speed = speed + increment;
	}

	public void applyBrakes(int decrement){
		speed = speed - decrement;
	}

	public void printStates() {
		System.out.println(" cadence: " + cadence + " speed: "+ speed+ " gear: "+ gear);
	}
}

class BicycleDemo{
	public static void main(String[] args) {

		//Create two different bicycle objects
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();

		//Invoke methods on those objects
		bike1.changeCadence(50);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.printStates();

		bike2.changeCadence(50);
		bike2.speedUp(10);
		bike2.changeGear(2);
		bike2.changeCadence(40);
		bike2.speedUp(10);
		bike2.changeGear(3);
		bike2.printStates();
	}
}


class MountainBike extends Bicycle{
	public int seatHeight;

	public MountainBike(int startHeight, int startCadence,
						int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
		seatHeight = startHeight;
	}

	public void setHeight(int newValue){
		seatHeight = newValue;
	}
}