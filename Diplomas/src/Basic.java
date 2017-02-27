
public class Basic implements Comparable<Basic>{

	private static int studentID = 0;

	public int diplomaID;
	public String firstName;
	public String lastName;

	public boolean isBasic;

	public Basic (String first, String last ){
		diplomaID = ++studentID;
		firstName = first;
		lastName = last;
		
		isBasic = true;
	}
	public Basic (String first, String last, boolean isBasic){
		diplomaID = ++studentID;
		firstName = first;
		lastName = last;
		isBasic = isBasic;
	}

	public String toString(){
		return String.format("ID# %d:\t%s, %s: %s",diplomaID,lastName,firstName,(isBasic?"Basic":"Honors"));
	}

	public int compareTo (Basic other){
		return lastName.compareTo(other.lastName);
	}

}

