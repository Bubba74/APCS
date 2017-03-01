
public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	public double baseSalary;

	public BasePlusCommissionEmployee (String first, String last, String SSN, double sales, double rate, double base){
		super (first, last, SSN, sales, rate);
		baseSalary = base;
	}

	public double getPaymentAmount(){
		return baseSalary + grossSales*commissionRate;
	}
}

