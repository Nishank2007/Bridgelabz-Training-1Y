class University2{
	public static void main(String[] args){
		
		int fee = 125000;
		int dp = 10;
		double da = (dp*fee)/100;
		double finalfee = fee-da;
		System.out.println("The discount amount is INR "+ da+" and final discounted fee is INR "+ finalfee);
	}
}