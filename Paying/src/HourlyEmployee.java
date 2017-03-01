
public class HourlyEmployee extends Employee {
	public double wage;
	public double hours;
	
	public HourlyEmployee (String first, String last, String SSN, double wages, double hoursWorked){
		super (first, last, SSN);
		wage = wages;
		hours = hoursWorked;
	}

	public double getPaymentAmount(){
		return wage*hours;
	}
}
