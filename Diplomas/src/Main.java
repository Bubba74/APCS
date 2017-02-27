
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	static List<Basic> diplomas = new ArrayList<Basic>();
	static Scanner in;

	public static int countBasic (){
		int count = 0;
		for (Basic b:diplomas){
			if (b.isBasic) count ++;
		}
		return count;
	}
	public static int countHonors (){
		int count = 0;
		for (Basic b: diplomas){
			if (!b.isBasic) count ++;
		}
		return count;
	}

	public static void main (String[] args){
	
		readFile();

		System.out.println("----------_UNSORTED---------------");
		for (Basic b : diplomas){
			System.out.println(b);
		}

		System.out.println("------------SORTED----------------");
		diplomas.sort(null);
		for (Basic b : diplomas){
			System.out.println(b);
		}

		in = new Scanner (System.in);
		String input = "";
		Basic changedDiploma = null;
		int index = -1;

		while (!input.equals("QUIT")){
			System.out.println("\n\nDiplomas List\n");
			System.out.printf("Honors: %d\tBasic: %d\n",countHonors(),countHonors());
			System.out.println();
		 	for (Basic b: diplomas) System.out.println(b);
			
			input = in.next();
			boolean newDiploma = false;
			for (Basic b: diplomas){
				if (b.lastName.equals(input)){
					newDiploma = true;
					changedDiploma = switchDiploma(b);
					index = diplomas.indexOf(b);
				}
			}

			if (newDiploma)
				diplomas.set(index,changedDiploma);
		}		

	}//main method

	public static Basic switchDiploma(Basic diploma){
		if (diploma.isBasic){
			System.out.print("Concentration? ");
			String concentration = in.next();
			return new Honors (diploma.firstName,diploma.lastName,concentration);
		} else {
			System.out.println("Switching to basic");
			return new Basic (diploma.firstName,diploma.lastName);
		}
	}//switchDiploma method

	public static void readFile (){
		
		Scanner file = null;
		try {
			file = new Scanner( new File("./GraduationList.txt"));
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		String first, last, type;
		String concentration;

		while (file.hasNext()){
			first = file.next();
			last = file.next();
			type = file.next();
			if (type.equals("Honors")){
				concentration = file.next();
				diplomas.add(new Honors (first,last,concentration));
			} else {
				diplomas.add(new Basic (first,last));
			}
		}//iterate over file
	}//readFile method
}//Main class
