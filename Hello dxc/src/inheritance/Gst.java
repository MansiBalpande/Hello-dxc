package inheritance;

public class Gst extends IncomeTax{
	
	String aadhaarCard; //additional property/partition of the child class
	
	/**
	 * to give a new defination to calculeTax method
	 */
     @override
     int calculateTax(int income) {
		// TODO Auto-generated method stub
    	 int tax = super.calculateTax(income); //reusing the functionality
    	 if(income > 10000) {
    		 tax = income/5;
    	 }
    	 return  tax;
     }
     
}
