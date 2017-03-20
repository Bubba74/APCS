
public class Mult3_5 {

	public static void main (String[] args){

		int len = 1000;
		int sum = 0;

		for (int i=0;i<len;i++){
			if (i%3 == 0 || i%5 == 0) sum += i;
		}

		System.out.printf("The sum of the natural numbers below %d that are divisible by 3 and 5 is: %d\n", len, sum);		

	}
}
