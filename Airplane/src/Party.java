
public class Party {
	
	public int size;
	public Passenger[] passengers;
	int i;

	public Party (int partySize){
		size = partySize;
		passengers = new Passenger[size];
		i = 0;
	}//Party

	public void addPassenger (Passenger person){
		if (i == size)
			System.out.println("AAAHH, TOO MANY PEOPLE!!!");

		passengers[i] = person;
		i++;
	}//addPassenger method

	public String toString(){
		String string = String.format("Party with %d %5s\n",size, (size==1?"person":"people"));

		for (int index=0;index<size;index++)
			string += passengers[index].toString() + "\n";
		return string;
	}

}//Party class
