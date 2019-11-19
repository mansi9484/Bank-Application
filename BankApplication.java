package bank;

import java.util.Scanner;

	class BankAccount
	{
	
		int Balance;
		int PreviousTransaction;
		String CustomerName;
		String CustomerId;
		Scanner sc = new Scanner(System.in);
		
		
		public BankAccount(String CustomerName, String CustomerId) 
		{
			this.CustomerName=CustomerName;
			this.CustomerId=CustomerId;	
		}
	
		
		void deposit (int amount)
		{
			if (amount!=0)
			{
				Balance=Balance+amount;
				PreviousTransaction= +amount;
			}
		}
		
		void withdraw (int amount)
		{
			if (amount!=0)
			{
				Balance=Balance-amount;
				PreviousTransaction= -amount;
			}
		}
		
		void getPreviousTransaction()
		{
			if (PreviousTransaction > 0)
			{
				System.out.println("deposited: " +PreviousTransaction);
			}
			else if (PreviousTransaction < 0)
			{
				System.out.println("withrawn: " +Math.abs(PreviousTransaction)  );
			}
			else
			{
				System.out.println("No transaction occured");
			}
		}
	
		void display()
		{
			char option;
			System.out.println("Welcome "+CustomerName);
			System.out.println("Your Id is: " +CustomerId);
 
			System.out.println("\t");
		 	
			System.out.println("Choose one from the below options:");
			System.out.println("\t");
			System.out.println("A. Check Balance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdraw");
			System.out.println("D. Check previous transaction");
			System.out.println("E. Exit");
			
			
			do
			{
				System.out.println("\t");
				System.out.println("Enter option:");
				
				 option = sc.next().charAt(0);
				
				
					switch(option)
					{
						case 'A':
							System.out.println("Balance = "+Balance);
							break;
							
						case 'B':
							System.out.println("Enter amount to be deposited:");
							int amount = sc.nextInt();
							deposit(amount);
							System.out.println("amount deposited");
							break;
							
						case 'C':
							System.out.println("Enter amount to be withdrawn:");							
							int amount1 = sc.nextInt();
							withdraw(amount1);
							System.out.println("amount withdrawn");
							break;
							
						case 'D':
							getPreviousTransaction();
							break;
							
						case 'E':
							break;
							
						default:
							System.out.println("Invalid option."+ "\n" + "Enter a valid option:");
					}
			}
			while(option!='E');
			{
				System.out.println("THANK YOU");
			}
			
		}
	}

	public class BankApplication 
	{
		public static void main(String[] args)
		{
			BankAccount b1 = new BankAccount ("Mansi", "15678");
			b1.display();
		}

	}
	
	

	


