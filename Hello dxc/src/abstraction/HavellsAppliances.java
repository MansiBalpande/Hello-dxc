package abstraction;

/**
 * implementation is like sockets
 * @author admin
 *
 */

public class HavellsAppliances implements ISwitchBoardListener  {

	public void switchOne() {
		System.out.println("havells fan is on");
	}
	
	public int switchTwo() {
		System.out.println("havells ac is on");
		return 28;
		
	}
	
	public boolean switchThree(int type) {
		System.out.println("havells led is on");
		return false;
	}
	
	public void switchFour() {
		System.out.println("havells tublight is on");
		
	}}

	
	

