
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

		rows = new Row[2*firstLength+2*econLength];
		for (int i=0;i<2*firstLength;i++)
			rows[i] = new Row(econWidth);
		for (int i=0;i<2*firstLength;i++){
			rows[i].seat(1).destroy();
			rows[i].seat(4).destroy();
		}
		for (int i=2*firstLength;i<2*firstLength+2*econLength;i++)
			rows[i] = new Row(econWidth);

	}//Plane

	public void print(){
		//Print out an empty plane
	/*
		for (int col=economyWidth-1; col >= 0; col--){
			for (int row=0;row<firstClassLength+economyLength;row++){
				if (row >= firstClassLength || (col != 1 && col != 4)) {
					System.out.printf("  %1s%d", (char)(col+'A'), row);
				} else {
					System.out.printf("    ");
				}
				if (row == firstClassLength-1)
					System.out.print("    ");
			}
			System.out.println();
		}
	*/
		for (int col=economyWidth-1; col >= 0; col--){
			for (int row=0;row<firstClassLength+economyLength;row++){
				rows[row*2].seat(col).print(col,row);
				if (row == firstClassLength-1) System.out.print("    ");
			}
			System.out.println();
		}
	}//toString

	public static void main(String[] args){
		Plane plane = new Plane(4,3,6,23);
		plane.print();
	}

}
	

