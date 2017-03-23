
public class Passenger {

	public enum TravelClass {
		First , Econ
	};
	public enum Location {
		W, C, A
	};
		
	public String firstName;
	public String lastName;

	public TravelClass travelClass;
	public Location loc;

	public Passenger (String first, String last, TravelClass firstOrEcon, Location seatLocation){
		firstName = first;
		lastName = last;

		travelClass = firstOrEcon;
		loc = seatLocation;
	}
	public Passenger (String first, String last, String firstOrEcon, String seatLocation){
		firstName = first;
		lastName = last;

		travelClass = TravelClass.valueOf(firstOrEcon);
		loc = Location.valueOf(seatLocation);
	}

	public String toString (){
		String className = "";
		String locName = "";

		switch (travelClass){
		case First:
			className = "First";
			break;
		case Econ:
			className = "Econ";
			break;
		}
		switch (loc){
		case W:
			locName = "W";
			break;
		case C:
			locName = "C";
			break;
		case A:
			locName = "A";
			break;
		}

		return String.format("%10s %10s %5s %s",firstName, lastName, className, locName);
	}
}//Passenger class
