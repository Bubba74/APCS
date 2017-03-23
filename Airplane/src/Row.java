
public class Row {

	public int width;
	public Seat[] seats;

	public Row (int width){
		this.width = width;
		seats = new Seat[width];
		for (int i=0;i<width;i++) seats[i] = new Seat();
	}
	
	public Seat seat(int index){
		return seats[index];
	}

}
