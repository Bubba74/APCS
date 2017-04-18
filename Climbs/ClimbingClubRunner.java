import java.util.*;

public class ClimbingClubRunner
 {
    public static void main(String[] args)
    {
		ClimbingClub bob = new ClimbingClub();
		bob.addClimbA("Monadnock", 274);
		bob.addClimbA("Whiteface", 301);
		bob.addClimbA("Algonquin", 225);
		bob.addClimbA("Monadnock", 344);
		
		System.out.println( bob );    	// A-  "Monadnock"   274		"Whiteface"  301		"Algonquin"   225		"Monadnock"   344

		bob = new ClimbingClub();
		bob.addClimbB("Monadnock", 274);
		bob.addClimbB("Whiteface", 301);
		bob.addClimbB("Algonquin", 225);
		bob.addClimbB("Monadnock", 344);
		
		System.out.println( bob );    	// B-  "Algonquin"  225		"Monadnock"  274		"Monadnock"    344          "Whiteface"    301
		System.out.println( bob.distinctPeakNames() );	// C-  3
    }
}
