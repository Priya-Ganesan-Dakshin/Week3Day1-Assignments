package week3day1_Bank;

public class AxisBank extends BankInfo {
	public void deposit()
	{
		System.out.println("The interest for deposit is 10%");
		
	}

	public static void main(String[] args) {
		AxisBank interestrate = new AxisBank();
		interestrate.saving();
		interestrate.fixed();
		interestrate.deposit();
		}

	}

