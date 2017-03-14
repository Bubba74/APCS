
import java.util.Scanner;

public class Team {


	public int rank;
	public String name;
	public String conf;

	public int wins;
	public int losses;

	public double adjEM;
	public double adjO;
	public double adjO_rank;
	public double adjD;
	public double adjD_rank;

	public double adjT;
	public int    adjT_rank;
	public double luck;
	public int    luck_rank;

	public double sos_adjEM;
	public int    sos_adjEM_rank;
	public double sos_oppO;
	public int    sos_oppO_rank;
	public double sos_oppD;
	public int    sos_oppD_rank;

	public double ncsos_adjEM;
	public int    ncsos_adjEM_rank;

	public Team (int rank, String name, String conf,
			int wins, int losses,
			double adjEM, double adjO, int adjO_rank, double adjD, int adjD_rank,
			double adjT, int adjT_rank, double luck, int luck_rank,
			double sos_adjEM, int sos_adjEM_rank, double sos_oppO, int sos_oppO_rank, double sos_oppD, int sos_oppD_rank,
			double ncsos_adjEM, int ncsos_adjEM_rank)
	{

		this.rank = rank;
		this.name = name;
		this.conf = conf;

		this.wins = wins;
		this.losses = losses;

		this.adjEM = adjEM;
		this.adjO = adjO;
		this.adjO_rank = adjO_rank;
		this.adjD = adjD;
		this.adjD_rank = adjD_rank;

		this.adjT = adjT;
		this.adjT_rank = adjT_rank;
		this.luck = luck;
		this.luck_rank = luck_rank;

		this.sos_adjEM = sos_adjEM;
		this.sos_adjEM_rank = sos_adjEM_rank;
		this.sos_oppO = sos_oppO;
		this.sos_oppO_rank = sos_oppO_rank;
		this.sos_oppD = sos_oppD;
		this.sos_oppD_rank = sos_oppD_rank;

		this.ncsos_adjEM = ncsos_adjEM;
		this.ncsos_adjEM_rank = ncsos_adjEM_rank;

	}//Team constructor

	public String toString (){
		//		Variable types
		//		      dssddffdfdfdfdfdfdfdfd
		return String.format("%d\t%s\t%s\t%d\t%d\t%f\t%f\t%d\t%f\t%d\t%f\t%d\t%f\t%d\t%f\t%d\t%f\t%d\t%f\t%d\t%f\t%d",
				rank,name,conf,wins,losses,
				adjEM, adjO, adjO_rank, adjD, adjD_rank, adjT, adjT_rank, luck, luck_rank,
				sos_adjEM, sos_adjEM_rank, sos_oppO, sos_oppO_rank, sos_oppD, sos_oppD_rank,
				ncsos_adjEM, ncsos_adjEM_rank);
	}//toString method

	public static Team readTeam (Scanner file){
		
		int rank;
		String name;
		String conf;
	
		int wins;
		int losses;
	
		double adjEM;
		double adjO;
		int adjO_rank;
		double adjD;
		int adjD_rank;
		double adjT;
		int    adjT_rank;
		double luck;
		int    luck_rank;
	
		double sos_adjEM;
		int    sos_adjEM_rank;
		double sos_oppO;
		int    sos_oppO_rank;
		double sos_oppD;
		int    sos_oppD_rank;
	
		double ncsos_adjEM;
		int    ncsos_adjEM_rank;

		//---------Read in values from file-----------//
		rank = file.nextInt();
		System.out.println(rank);
		name = file.next();
		System.out.println(name);
		conf = file.next();
		System.out.println(conf);

		wins = file.nextInt();
		System.out.println(rank);
		losses = file.nextInt();
		System.out.println(rank);

		adjEM 	= file.nextDouble();
		adjO 	= file.nextDouble();
		adjO_rank = file.nextInt();
		adjD 	= file.nextDouble();
		adjD_rank = file.nextInt();
		adjT 	= file.nextDouble();
		adjT_rank = file.nextInt();
		luck 	= file.nextDouble();
		luck_rank = file.nextInt();

		sos_adjEM 	= file.nextDouble();
		sos_adjEM_rank 	= file.nextInt();
		sos_oppO 	= file.nextDouble();
		sos_oppO_rank 	= file.nextInt();
		sos_oppD 	= file.nextDouble();
		sos_oppD_rank 	= file.nextInt();
	
		ncsos_adjEM 	= file.nextDouble();
		ncsos_adjEM_rank = file.nextInt();

		return new Team (rank, name, conf,
			wins, losses,
			adjEM, adjO, adjO_rank, adjD, adjD_rank, 
			adjT, adjT_rank, luck, luck_rank,
			sos_adjEM, sos_adjEM_rank, sos_oppO, sos_oppO_rank, sos_oppD, sos_oppD_rank,
			ncsos_adjEM, ncsos_adjEM_rank
			);
	}//Team readTeam()
}//Team class








