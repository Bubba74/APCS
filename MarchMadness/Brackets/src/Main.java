/*
  Henry Loh, APCS, Period 2
*/



import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	

	static Team[] unlucky8 = new Team[8];
	static Team[] lucky4 = new Team[4];
	static int[] placements = new int[4];

	static List<Team> teams = new ArrayList<Team>();
	static Team[] t64;
	static Team[] t32;
	static Team[] t16;
	static Team[] t8;
	static Team[] t4;
	static Team[] t2;
	static Team[] winner;

	public static void main(String[] args){

		Scanner file = null;

		try {
			file = new Scanner(new File("../InputFile.txt"));
		} catch (FileNotFoundException e){
			e.printStackTrace();
			System.out.println("\n\n\nFile not found!!!!");
		}

		if (file == null) return;
		

		//-----Actual stuff--------//
		readFile     (file);
		readUnlucky8 (file);

		lucky4 = round(unlucky8);
		insertLucky4 ();
		
		t64 = new Team[64];
		for (int i=0;i<64;i++) t64[i] = teams.get(i);

		t32 = round(t64);
		t16 = round(t32);
		t8  = round(t16);
		t4  = round(t8);
		t2  = round(t4);
		winner = round(t2);

		printPreBracket();
		
		printBrackets();
		
	}//main method

	public static void printPreBracket(){
		System.out.println("8 -> 4");
		for (int i=0;i<8;i++){
			System.out.print(unlucky8[i].name());
			if (unlucky8[i] == lucky4[i/2]) System.out.print(lucky4[i/2].name());
			System.out.println();
		}
	}//printprebracket
	public static void insertLucky4(){
		for (int i=0;i<4;i++){
			teams.add(placements[i],lucky4[i]);
		}
	}
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
			System.out.print(t64[i].name());

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

	public static void readFile(Scanner file){

		String name;
		double s1, s2, s3;

		for (int i=0; i < 60; i++){

			name = file.next();
			s1 = file.nextDouble();
			s2 = file.nextDouble();
			s3 = file.nextDouble();
			
			teams.add( new Team(name,s1,s2,s3) );
			System.out.println(teams.get(teams.size()-1));
		}

	}//readFile method

	public static void readUnlucky8 (Scanner file){
		
		String name;
		double s1, s2, s3;

		for (int i=0; i < 8; i++){
			if (i % 2 == 0) placements[i/2] = file.nextInt();
			
			name = file.next();
			s1 = file.nextDouble();
			s2 = file.nextDouble();
			s3 = file.nextDouble();
			
			unlucky8[i] = new Team (name, s1, s2, s3);
		}

	}//readUnlucky8

			
} // Main class


