package org.bank;

public class HDFC extends Banks{
    
	void deposit() {
		System.out.println("overridden");
		System.out.println("This one comes from hdfc bank");
		System.out.println("Money successfully deposited in bank");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		HDFC bank = new HDFC();
		bank.deposit();
		bank.interest();
		bank.saving();
	}

}
