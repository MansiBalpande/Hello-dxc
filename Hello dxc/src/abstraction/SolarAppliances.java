package abstraction;

public class SolarAppliances implements ISwitchBoardListener {
	
	@Override
	public void switchOne() {
		System.out.println("solar light is on");
	}
	
	@Override
	public int switchTwo() {
		System.out.println("solar ac is on");
		return 22;
	}
	
	@Override
	public boolean switchThree(int type) {
		System.out.println("solar LED is on");
		return false;
		
	}
	
    @Override
	public void switchFour() {
		System.out.println("solar tubelight is on");
	}
}
