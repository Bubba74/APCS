
public class Invoice implements Payable {

	public String partNumber;
	public String partDesc;
	public int quantity;
	public double pricePerItem;

	public Invoice (String PN, String desc, int numberToBuy, double price){
		partNumber = PN;
		partDesc = desc;
		quantity = numberToBuy;
		pricePerItem = price;
	}

	public double getPaymentAmount(){
		return quantity*pricePerItem;
	}
}
