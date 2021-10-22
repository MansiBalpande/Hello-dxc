package abstraction;

public class Wiring {
	
	public static void main(String[] args) {
		//wiring
		ISwitchBoardListener sListener = new SolarAppliances();
		           //HavellsAppliances(); //connecting switches to havells socket
		//mansi clicking the switches
		sListener.switchOne();
		sListener.switchTwo();
		sListener.switchThree(12);
		sListener.switchFour();
		
	}

}
