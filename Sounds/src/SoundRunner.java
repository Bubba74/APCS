public class SoundRunner
{
    public static void main(String[] args) 
    {
    	int[] vals = {40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223};
		Sound fun = new Sound( vals );
		System.out.print("Original array:  ");
		System.out.println( fun );     		//outs   40 2532 17 -2300 -17 -4000 2000 1048 -420 33 15 -32 2030 3223
		
		int count = fun.limitAmplitude(2000);
		System.out.println("Number of changes:  " + count );		//outs 5
		System.out.print("Modified array:  ");
		System.out.println( fun );		// 40  2000  17  -2000  -17  -2000  2000  1048  -420  33  15  -32  2000  2000 
		
		
		int[] val2 = {0, 0, 0, 0, -14, 0, -35, -39, 0 -7, 16, 32, 37, 29, 0, 0};
		fun = new Sound( val2 );
		System.out.print("\n\n\nNew array:  ");
		System.out.println( fun );
		fun.trimSilenceFromBeginning();
		System.out.print("Modified array:  ");
		System.out.println( fun ); 			//outs   40 2000 17 -2000 -17 -2000 2000 1048 -420 33 15 -32 2000 2000
    }	
}


