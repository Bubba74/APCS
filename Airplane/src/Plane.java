
import java.util.List;

public class Plane {

	public int firstClassWidth;
	public int firstClassLength;
	public int economyWidth;
	public int economyLength;

	public Row[] rows;

	public Plane (int firstWidth, int firstLength, int econWidth, int econLength){
		firstClassWidth = firstWidth;
		firstClassLength = firstLength;
		economyWidth = econWidth;
		economyLength = econLength;

		rows = new Row[firstLength+econLength];
		for (int i=0;i<firstLength;i++)
			rows[i] = new Row(econWidth);
		for (int i=0;i<firstLength;i++){
			rows[i].seat(1).destroy();
			rows[i].seat(4).destroy();
		}
		for (int i=firstLength;i<firstLength+econLength;i++)
			rows[i] = new Row(econWidth);

	}//Plane

	public void fillWithParties (List<Party> parties){
		
		for (Party par: parties)
			seatParty(par);

	}//fillWithParties

	public void seatParty (Party par){
		boolean firstClass = par.list()[0].classPref() == Passenger.TravelClass.First;

		int left = (firstClass ? 0 : firstClassLength);
		int right = (firstClass ? firstClassLength : firstClassLength+economyLength);

		boolean seated = false;

		for (int i=left; i<right; i++){
			if (rows[i].canSeatAll(par)){
				for (Passenger p: par.list()){
					rows[i].fill(p);
				}
				seated = true;
				break;
			}
		}
		
		if (!seated){
			System.out.println(par);
			System.out.println("Could not be seated on one row");
			for (Passenger p: par.list()){
				seatPerson (p);
			}
		}
	}//seatParty method

	public void seatPerson (Passenger p){

		switch (p.classPref()){
		case First:
			for (int i=0;i<firstClassLength; i++){
				if (rows[i].fill(p)) return;
			}
			break;
		case Econ:
			for (int i=firstClassLength; i<rows.length; i++){
				if (rows[i].fill(p)) return;
			}
			break;
		}

	}//seatPerson method

	public void printAll(){
		//Print out an empty plane

		for (int col=economyWidth-1; col >= 0; col--){
			for (int row=0;row<firstClassLength+economyLength;row++){
				rows[row].seat(col).print(col,row);
				if (row == firstClassLength-1) System.out.print("    ");
			}
			System.out.println();
		}
	}//printAll method

	public void printFull(){
		//Print out occupied seats

		for (int col=economyWidth-1; col >= 0; col--){
			for (int row=0;row<firstClassLength+economyLength;row++){
				if (rows[row].seat(col).filled()){
					rows[row].seat(col).print(col,row);
				} else if (rows[row].seat(col).empty()){
					System.out.print("   --");
				} else {
					System.out.print("     ");
				}
				if (row == firstClassLength-1) System.out.print("    ");
			}
			System.out.println();
		}
	}//printFull method

	public void printAssignments(){
		//Print out assignments

		for (int row=0;row<firstClassLength+economyLength;row++){
			for (int col=0; col < economyWidth; col++){
				Seat seat = rows[row].seat(col);
				if (seat.filled()){
					seat.print(col, row);
					System.out.print("  --  ");
					System.out.println(seat.passenger());
				}
					
			}
		}
	}//printAssignments

	public static void main(String[] args){
		Plane plane = new Plane(4,3,6,23);
		plane.printAll();
	}

}
	

