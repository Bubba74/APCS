
public class Seat {

	public enum Status {
		kNonexistent, kEmpty, kFull
	}

	public Status status;
	public Passenger occupant;

	public Seat (){
		status = Status.kEmpty;
		occupant = null;
	}
	public Seat (Status status){
		if (status == Status.kFull){
			System.out.println("Illegal seet status, cannot be filled with no passenger");
			status = Status.kNonexistent;
		}
		this.status = status;
		occupant = null;
	}
	public Seat (Passenger person){
		status = Status.kFull;
		occupant = person;
	}

	public Passenger passenger(){
		Passenger returnPerson = Passenger.nullPassenger();

		switch (status){
		case kNonexistent:
			System.out.println("No Person");
			System.exit(1);
			break;
		case kEmpty:
			System.out.println("Empty");
			System.exit(1);
			break;
		case kFull:
			returnPerson = occupant;
			break;
		}
		return returnPerson;
	}//passenger method

	public boolean fill (Passenger person){

		switch (status){
		case kNonexistent:
			return false;
		case kEmpty:
			occupant = person;
			status = Status.kFull;
			return true;
		case kFull:
			return false;
		}
		return false;
	}//fill

	public void print(int col, int row){
		if ( status == Status.kNonexistent){
			System.out.print("     ");
		} else {
			System.out.printf("  %2d%s", row, (char)(col+'A'));
		}
	}//print
			

	public void destroy(){
		status = Status.kNonexistent;
	}
	public boolean doesExist(){
		return !(status==Status.kNonexistent);
	}
	public boolean canBeFilled(){
		return empty() && doesExist();
	}
	public boolean filled (){
		return (status == Status.kFull ? true : false);
	}//filled method
	public boolean empty (){
		return (status == Status.kEmpty ? true : false);
	}//empty method

}//Seat class
