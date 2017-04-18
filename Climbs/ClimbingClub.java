
import java.util.List;
import java.util.ArrayList;

public class ClimbingClub {

	private List<ClimbInfo> climbs;

	public ClimbingClub(){
		climbs = new ArrayList<ClimbInfo>();
	}

	public void addClimbA(String name, int time){
		climbs.add(new ClimbInfo(name, time));
	}//addClimbA

	public void addClimbB(String name, int time){
		ClimbInfo climb = new ClimbInfo (name, time);
		
		for (int i=0; i<climbs.size(); i++){
			if (climbs.get(i).getName().compareTo(name) > 0){
				climbs.add(i, climb);
				return;
			}
		}
		climbs.add(climb);
	}//addClimbB

	public int distinctPeakNames(){
		if (climbs.size() == 0) return 0;

		ClimbInfo curr = climbs.get(0);
		String prevName = curr.getName();
		String currName = null;
		int numNames = 1;

		for (int i=1; i<climbs.size(); i++){
			curr = climbs.get(i);
			currName = curr.getName();
			if (!prevName.equals(currName)){
				numNames++;
				prevName = currName;
			}
		}
		
		return numNames;
	}//distinctPeakNames

	public String toString(){ return "" + climbs;}

}//ClimbingClub

