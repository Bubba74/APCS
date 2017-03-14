
public class Recursion {

	public static void main(String[] args){
		
		System.out.println(fib(10));
		System.out.println();

		System.out.println(multiply(3,5));
		System.out.println();

		printString("HELLOWORLD");
		System.out.println();

		printStringReverse("HELLOWORLD");
		System.out.println();

		ackWrapper(0,0);
		ackWrapper(0,1);
		ackWrapper(1,1);
		ackWrapper(1,2);

		ackWrapper(1,3);
		ackWrapper(2,2);
		ackWrapper(3,2);
		ackWrapper(4,0);

		int[] arr = {0,3,5,9,3,7,9,6};
		System.out.println(max(arr));

		int[] array = {0,1,2,4,8,10,25};
		int target = 250;
		System.out.printf("\n\nBinary Search for %d in: [0 1 2 4 8 10 25]\n",target);
		System.out.println(target + " found at index: "+binarySearch (array, target));

	}
	
	public static int binarySearch (int[] arr, int target, int low, int high){
		int mid = (low+high)/2;

		if (high - low < 2) {
			if (arr[high] == target) return high;
			if (arr[low] == target) return low;
			return -1;
		}

		if (arr[mid] == target) return mid;
		else if (arr[mid] < target) return binarySearch (arr, target, mid, high);
		else return binarySearch (arr, target, low, mid);

	}
	public static int binarySearch (int [] arr, int target){
		return binarySearch (arr, target, 0, arr.length-1);
	}


	public static int fib (int num){
		if (num == 0) return 0;
		if (num == 1) return 1;


		return fib(num-1)+fib(num-2);
	}

	public static int multiply (int a, int b){
		if (b==1) return a;
		return a + multiply (a , b-1);
	}

	public static void printString (String str){
		if (str.length()==1) {
			System.out.println(str);
			return;
		}
		System.out.println(str.charAt(0));
		printString(str.substring(1));
	}

	public static void printStringReverse (String str){
		if (str.length()==1) {
			System.out.println(str);
			return;
		}
		printStringReverse(str.substring(1));
		System.out.println(str.charAt(0));
	}

	public static int ack (int m, int n){
		if (m==0) return n+1;
		if (n==0) return ack(m-1,1);
		
		return ack(m-1,ack(m,n-1));
	}
	public static void ackWrapper (int m, int n){
		System.out.printf("Ack(%d , %d): \n",m,n);
		System.out.println(ack(m,n));
		System.out.println();
	}

	public static int max (int[] arr){
		if (arr.length==1) return arr[0];
		if (arr.length==2) return (arr[0]>arr[1]?arr[0]:arr[1]);

		int[] rest = new int[arr.length-1];
		for (int i=0;i<rest.length;i++)
			rest[i] = arr[i+1];

		int maxOfRest = max(rest);
		return (arr[0] > maxOfRest?arr[0]:maxOfRest);
	}

}//Recursion class
