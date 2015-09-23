package MainPackage;
// Import scanners 
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	
	/// here I execute through the tuition class with scanners 
	
	Scanner input= new Scanner(System.in);
	
	System.out.print("Enter initial tuition cost:");
	double InitialTuition = input.nextDouble();
	
	System.out.print("Enter Percentage Increase:");
	double PercentageIncreases = input.nextDouble();

	System.out.print("Enter APR:");
	double APR = input.nextDouble();
	
	System.out.print("Enter Terms:");
	double Terms = input.nextDouble();
	
	Tuition newTut = new Tuition(InitialTuition,PercentageIncreases,APR,Terms);
	double OverallTuition = newTut.generateTuition();
	double OverallPayment = newTut.generatePayment();
	
	System.out.format("Final Tuition: "+ "%.2f%n", OverallTuition);
	System.out.format("Monthly Payment: "+ "%.2f%n", OverallPayment);
	}
}
