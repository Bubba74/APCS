
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
			rows[i] = new Row(firstWidth);
		for (int i=2*firstLength;i<2*firstLength+2*econLength;i++)
			rows[i] = new Row(econWidth);

	}//Plane

	

