
public class Party {
	
	public int size;
	public Passenger[] passengers;

	public Party (int partySize){
		size = partySize;
		passengers = new Passenger[size];
	}//Party

	public void addPassenger (Passenger person){
		if (i == size)
			System.out.println("AAAHH, TOO MANY PEOPLE!!!");

		passengers[i] = person;
		i++;
	}//addPassenger method

}//Party class
