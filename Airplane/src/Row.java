
public class Row {

	public int width;
	public Seat[] seats;

	public Row (int width){
		this.width = width;
		seats = new Seat[width];
		for (int i=0;i<width;i++) seats[i] = new Seat();
	}
	
	public boolean fill (Passenger p){
		switch (p.locPref()){
		case W:
			if (seat(0).fill(p)) return true;
			if (seat(5).fill(p)) return true;
			break;
		case C:
			if (seat(1).fill(p)) return true;
			if (seat(4).fill(p)) return true;
			break;
		case A:
			if (seat(2).fill(p)) return true;
			if (seat(3).fill(p)) return true;
			break;
		default:
			return false;
		}
		return false;
	}//fill method

	public boolean canSeatAll (Party party){
		for (Passenger p: party.list()){
			if (!canSeat(p)) return false;
		}
		return true;
	}//canSeatAll

	public boolean canSeat (Passenger p){
		switch (p.locPref()){
		case W:
			if (seat(0).empty()) return true;
			if (seat(5).empty()) return true;
			break;
		case C:
			if (seat(1).empty()) return true;
			if (seat(4).empty()) return true;
			break;
		case A:
			if (seat(2).empty()) return true;
			if (seat(3).empty()) return true;
			break;
		default:
			return false;
		}
		return false;
	}//canSeat
		
	public Seat seat(int index){
		return seats[index];
	}

}
