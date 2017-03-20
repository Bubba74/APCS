
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
		this.status = status;
		occupant = null;
	}
	public Seat (Passenger person){
		status = Status.kFull;
		occupant = person;
	}

	public void fill (Passenger person){

		switch (status){
		case kNonexistent:
			System.out.println("Tried to assign passenger to non existent seat!");
			System.exit(1);
			break;
		case kEmpty:
			occupant = person;
			status = Status.kFull;
			break;
		case kFull:
			System.out.println("Seat Filled Already!!");
			break;
		}
	}//fill

	public boolean filled (){
		return (status == Status.kFull ? true : false);
	}//filled method
	public boolean empty (){
		return !filled();
	}//empty method

}//Seat class
