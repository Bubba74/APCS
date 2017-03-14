/*
  Henry Loh, APCS, Period 2
*/

public class Team {

	public String name;
	
	//Wins
	public double stat1;
	//AdjEM
	public double stat2;
	//AdjOffense
	public double stat3;

	public Team (String name, double s1, double s2, double s3){
		this.name = name;

		stat1 = s1;
		stat2 = s2;
		stat3 = s3;
	}
	
	public Team play (Team opp){
		double score1 = stat1 + 4*stat2 + stat3/2;
		double score2 = opp.stat1 + 4*opp.stat2 + opp.stat3/2;

		if (score1 >= score2) return this;

		return opp;
	}

	public String toString(){
		return String.format("%18s -- %.2f\t%.2f\t%.2f",name,stat1,stat2,stat3);
	}
	public String name(){
		return String.format("%18s",name);
	}
}
