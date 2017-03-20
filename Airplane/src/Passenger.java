
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

}//Passenger class
