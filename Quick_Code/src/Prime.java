
public class Prime {
	public static void main (String[] args){
		int[] nums = new int[100];
		for (int i=0; i<100; i++) nums[i] = i+1;

		for (int num: nums){
			if (isPrime(num)){
				System.out.println(num);
			}
		}
	}//main

	public static boolean isPrime(int num){
		for (int i=2; i <= (int)Math.sqrt(num); i++){
			if (num % i == 0) return false;
		}
		return true;
	}//isPrime
}//Prime class
