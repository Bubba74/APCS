
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {


	public static void main (String[] args){

		Scanner file = null;
		Team[] teams = new Team[351];

		try {
			file = new Scanner ( new File ("../Raw.txt"));
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}

		System.out.println("Reading File");
		for (int i=0;i<351;i++){
			teams[i] = Team.readTeam(file);
		}

		System.out.println("\n\nDone Reading Input File\n\n");
		for (int i=0;i<351;i++){
			System.out.println(teams[i]);
		}

	}
}
