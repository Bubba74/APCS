
public class CommissionEmployee extends Employee {
	
	public double grossSales;
	public double commissionRate;

	public CommissionEmployee (String first, String last, String SSN, double sales, double rate){
		super (first, last, SSN);
		grossSales = sales;
		commissionRate = rate;
	}

	public double getPaymentAmount(){
		return grossSales*commissionRate;
	}
}
