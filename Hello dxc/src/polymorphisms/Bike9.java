package polymorphisms;

public class Bike9 {
	
	final int speedlimit=90;//final variable
	
	void run() {
		//speedlimit=400;
		System.out.println("bike9 speed limit is "+speedlimit);
	}
	
	public static void main(String[] args) {
		Bike9 obj=new Bike9();
		obj.run();
		Bike9 myBike = new Bike9(); //this has one partition-- speedLimit
		Honda myHonda = new Honda(); //this has 2 partitions -- speedLimit and petrolTank
		//myHonda = (Honda) myBike; //upcasting is not defined -- which partition should i remove i don't know
		myBike = (Bike9)myHonda; //downcasting -- petrol tank partition from honda gets removed
	}

}

class Honda extends Bike9{
	int petrolTank = 5;
	void run() {System.out.println("running safely with 100kmph");}
}
