
public class Main {

	static Plane = new Plane (4,3,6,22);
	static List<Party> parties = new ArrayList<Party>();

	public static void main (String[] args){
		
		readInParties(parties);

		for (Party p : parties)
			System.out.println(p);

	}//main

	public static void readInParties (List<Party> partyList){

		Scanner file = null;
		
		try {
			file = new Scanner (new File("../Orders.txt"));
		} catch (FileNotFoundException e){
			System.out.println("../Orders.txt not found!!");
		}

		String first, last;
		String class;
		String seatChoice;
		int partySize;

		while (file.hasNext()){
			first = file.next();
			last = file.next();
			class = file.next();
			seatChoice = file.next();
			partySize = file.nextInt();

			Passenger p = new Passenger (first, last, class, seatChoice);

			if (partySize == 0){
				parties.get(parties.size()-1).addPassenger(p);
			} else {
				Party party = new Party (partySize);
				party.addPassenger (p);
				parties.add(party);
			}
		}//scan file
	}//readInParties
}//Main class
