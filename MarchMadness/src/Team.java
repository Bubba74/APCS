
public class Team {

	public String name;
	
	public double stat1;
	public double stat2;
	public double stat3;

	public Team (String name, double s1, double s2, double s3){
		this.name = name;

		stat1 = s1;
		stat2 = s2;
		stat3 = s3;
	}
	
	public Team play (Team opp){
		if (name.compareTo(opp.name) < 0)	
			return this;
		return opp;
	}

	public String toString(){
		return String.format("%18s -- %.2f\t%.2f\t%.2f",name,stat1,stat2,stat3);
	}
	public String name(){
		return String.format("%18s",name);
	}
}
