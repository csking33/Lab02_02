import java.util.Scanner;


public class Main 
{
	static Scanner in = new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Present value exercise");
		System.out.println();
		System.out.println();
		futureValueCalc();
		System.out.println("Would you like to run the program again?");
		while (!in.next().toLowerCase().equals("n"))
		{
			futureValueCalc();
		}
	}
	
	public static void futureValueCalc()
	{		
		System.out.println("Please enter Present Value: ");
		int presentValue = in.nextInt();
		//Check that user input is valid, value cannot be less than 0
		while (presentValue < 0)
		{
			System.out.println("Present value must be greater than 0");
			presentValue = in.nextInt();
		}
		
		//Check that user input is valid, interest rate cannot be less than 0
		System.out.println("Please enter Interest Rate: ");
		double interestRate = in.nextDouble();
		while(interestRate < 0)
		{
			System.out.println("Interest rate must be greater than 0");
			interestRate = in.nextDouble();
		}
		//If interest rate given as a percentage, convert to decimal for calculations
		if(interestRate >= 1)
		{
			interestRate = interestRate / 100;
		}
		
		System.out.println("Please enter number of years: ");
		int years = in.nextInt();
		//Check that years given is greater than 0
		while (years < 0)
		{
			System.out.println("Number of years cannot be less than 0");
			years = in.nextInt();
		}
		
		//Perform present value calculation and print to console.
		System.out.println(presentValue * Math.pow((1 + interestRate), years));
	}
}
