package generics;

public class GenericsDemo {
	
	public static void main(String[] args) {
		Account<String> account = new Account<String>();
		account.setObj("SBI Account");
		System.out.println(account.getObj());
		
		Account<Integer> gpayAccount = new Account<>();
		gpayAccount.setObj(984856477);
		System.out.println("gpay account no is"+ gpayAccount.getObj());
	}

}