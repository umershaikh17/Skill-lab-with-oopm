import java.util.Scanner;



public class BankLab2 {



	Scanner in=new Scanner(System.in); 

	String name;

	char account_type;

	int account_number,amount;

	float balance;

	

	public BankLab2(String n,int a, char t, float b) {

		// TODO Auto-generated constructor stub

		name = n;

		account_number=a;

		account_type=t;

		balance=b;



	}

	

	int deposit()

	{

		System.out.println("Enter the amount to	deposit: ");

		int amount=in.nextInt();

		if(amount<0)

		{

			System.out.println("Invalid amount,Enter a valid amount"); 

			return 0;

		}

		balance=balance+amount;

		return 1;

	}

	

	int withdraw()

	{

		System.out.println("Your Balance= "	+balance ); 

		System.out.println("Enter amount to withdraw: "); 

		int amount=in.nextInt();

		if (balance<amount)

		{

			System.out.println("Insufficient Balance:	"); 

			return 0;

		}

		if(amount<0)

		{

			System.out.println("Invalid	amount" ); 

			return 0;

		}

		balance=balance-amount; 

		return 1;

	}
