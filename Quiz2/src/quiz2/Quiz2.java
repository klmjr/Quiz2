package quiz2;

public class Quiz2 {
	int totalCarPrice;
	int downPayment;
	int loanLength;
	double interestRate;
	
	public Quiz2(int totalCarPrice, int downPayment, int loanLength, double interestRate) {
		totalCarPrice = this.totalCarPrice;
		downPayment = this.downPayment;
		loanLength = this.loanLength;
		interestRate = this.interestRate;
		
		
	}

	public int gettotalCarPrice() {
		return totalCarPrice;
	}

	public int getDownPayment() {
		return downPayment;
	}

	public int getLoanLength() {
		return loanLength;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	
	
	public static double monthlyCarPayment(Quiz2 q) {
		double monthCost;
		monthCost = ((q.totalCarPrice - q.downPayment) * Math.pow(1 + (q.interestRate / 12), q.loanLength) / (12 * q.loanLength));
				
		return monthCost;
	}
	
	public static double compoundInterest(Quiz2 q) {
		double comInt;
		comInt = (q.totalCarPrice - q.downPayment) * Math.pow(1 + (q.interestRate / 12), q.loanLength) - q.totalCarPrice;
		return comInt;
	}
	

	
	

}
