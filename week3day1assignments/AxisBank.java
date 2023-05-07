package bank;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Total savings deposit");
		
	}
	
	public static void main(String[] args) {
		
		AxisBank obj = new AxisBank();
		
		obj.deposit();
		
	}
	
}
