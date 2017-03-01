
public class SalariedEmployee extends Employee {
	public double weeklySalary;

	public SalariedEmployee (String firstname, String lastname, String SSN, double salary){
		super (firstname, lastname, SSN);
		weeklySalary = salary;
	}

	public double getPaymentAmount(){
		return weeklySalary;
	}
}
