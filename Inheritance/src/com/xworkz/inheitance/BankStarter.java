package com.xworkz.inheitance;
import com.xworkz.inheritance.abstractBank.Bank;
import com.xworkz.inheritance.abstractBank.IciciBank;
import com.xworkz.inheritance.abstractBank.HdfcBank;

public class BankStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new IciciBank();
		
		bank.provideLoan();
		bank.openAccount();
		bank.closeAccount();
		
		String get=bank.getBankName();
		
		System.out.println(get);
		
		String ifsc=bank.getIfscCode();
		
		System.out.println(ifsc);
		
		
		Bank bank1=new HdfcBank("HDFC","345dgj76gdbh89");
		
		bank1.closeAccount();
		bank1.openAccount();
		bank1.provideLoan();
		
		String set=bank1.getBankName();
		

		System.out.println(set);
		
		String code=bank1.getIfscCode();
		
		System.out.println(code);
		

	}

}
