package MainPackage;
// import needed libraries 


import org.apache.poi.ss.formula.functions.FinanceLib;

public class Tuition {
// create constructor 
	public Tuition(double initialTuition, double percentageIncreases, double repaymentAPR, double terms) {
		super();
		InitialTuition = initialTuition;
		PercentageIncreases = percentageIncreases;
		RepaymentAPR = repaymentAPR;
		Terms = terms;
	}
// create setters and getters 
	public double getRepaymentAPR() {
		return RepaymentAPR;
	}

	public void setRepaymentAPR(double repaymentAPR) {
		RepaymentAPR = repaymentAPR;
	}

	public double getTerms() {
		return Terms;
	}

	public void setTerms(double terms) {
		Terms = terms;
	}

	public double getInitialTuition() {
		return InitialTuition;
	}

	public void setInitialTuition(double initialTuition) {
		InitialTuition = initialTuition;
	}

	public double getPercentageIncreases() {
		return PercentageIncreases;
	}

	public void setPercentageIncreases(double percentageIncreases) {
		PercentageIncreases = percentageIncreases;
	}
// specify private fields 
	private double InitialTuition;
	private double PercentageIncreases;
	private double RepaymentAPR;
	private double Terms;
// create method for calculating tuition 
	public double generateTuition(){
			double Tuition = InitialTuition;
				for (int years = 0; years<4; years++){
					double IncreaseTution = 0;
					if (years >= 1){
						IncreaseTution=(Tuition * PercentageIncreases);}
					Tuition+=IncreaseTution;}

				return Tuition;
// create method for calculating payment
	}
	public double generatePayment() {
		boolean t = true;
		double terms;
		double LoanAPR;
		double tuition;
			tuition = this.generateTuition();
			LoanAPR = this.getRepaymentAPR();
			terms = this.getTerms();
			
			
// set parameters into finance lib payment function 
		double Payment = FinanceLib.pmt(LoanAPR, terms, tuition, 0, t);
		return -Payment;
	}
}

