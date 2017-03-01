
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	

	static Team[] teams = new Team[64];
	static Team[] t32;
	static Team[] t16;
	static Team[] t8;
	static Team[] t4;
	static Team[] t2;
	static Team[] winner;

	public static void main(String[] args){

		readFile(teams);


		t32 = round(teams);
		t16 = round(t32);
		t8  = round(t16);
		t4  = round(t8);
		t2  = round(t4);
		winner = round(t2);

		
		printBrackets();
		
	}//main method

	public static Team[] round (Team[] prevBracket){
//		System.out.println("\n\n\n");
//		for (Team t: prevBracket) System.out.println(t);
		Team[] nextBracket = new Team[prevBracket.length/2];
		for (int i=0;i<prevBracket.length/2;i++){
			nextBracket[i] = prevBracket[2*i].play(prevBracket[2*i+1]);
		}

//		System.out.println("\n\n");
//		for (Team t: nextBracket) System.out.println(t);

		return nextBracket;
	}//round method

	public static void printBrackets(){
		System.out.println("\n\nBRACKETS\n\n");

		for (int i=0;i<64;i++){
			System.out.print(teams[i].name());

			if (i % 2 == 1)
				System.out.println(t32[i/2].name());
			else
				System.out.printf("%18s","");

			if (i % 4 == 2)
				System.out.println(t16[i/4].name());
			else
				System.out.printf("%18s","");

			if (i % 8 == 4)
				System.out.println(t8[i/8].name());
			else
				System.out.printf("%18s","");

			if (i % 16 == 8)
				System.out.println(t4[i/16].name());
			else
				System.out.printf("%18s","");

			if (i % 32 == 16)
				System.out.println(t2[i/32].name());
			else
				System.out.printf("%18s","");

			if (i % 64 == 32)
				System.out.println(winner[i/64].name());
			else
				System.out.printf("%18s","");

			System.out.println();
			System.out.println();
		}
	}

	public static void readFile(Team[] teams){
		Scanner file = null;

		try {
			file = new Scanner(new File("../InputFile.txt"));
		} catch (FileNotFoundException e){
			e.printStackTrace();
			System.out.println("\n\n\nFile not found!!!!");
		}

		if (file == null) return;

		String name;
		double s1, s2, s3;

		int i=0;

		while (file.hasNext()){
			name = file.next();
			s1 = file.nextDouble();
			s2 = file.nextDouble();
			s3 = file.nextDouble();
			
			teams[i++] = new Team(name,s1,s2,s3);
		}
	}//readFile method

}


