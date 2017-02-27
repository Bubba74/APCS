
public class Honors extends Basic {
	
	public String concentration;

	public Honors (String first, String last, String focus){
		super (first,last,false);
		concentration = focus;
	}

	public String toString(){
		return String.format("ID# %d:\t%s, %s: %s\t%s",diplomaID,lastName,firstName,"Honors",concentration);
	}
}
