public class Sound

{

	/** the array of values in this sound; guaranteed not to be null */

	private int[] samples;

	public Sound( int[] vals )

	{
	
		samples = vals;

	}

	/** Changes those values in this sound that have an amplitude greater

	than limit.

	* Values greater than limit are changed to limit.

	* Values less than -limit are changed to -limit.

	* @param limit the amplitude limit

	* Precondition: limit = 0

	* @return the number of values in this sound that this method

	changed */

	//PART A

	public int limitAmplitude(int limit)

	{ // insert your code here for part a
		int count = 0;
		for (int i=0; i<samples.length; i++){
			if (samples[i] > limit) {
				samples[i] = limit;
				count++;
			} else if (samples[i] < -limit) {
				samples[i] = -limit;
				count++;
			}
		}
		return count;
	}

	/** Removes all silence from the beginning of this sound.

	* Silence is represented by a value of 0.

	* Precondition: samples contains at least one nonzero value

	* Postcondition: the length of samples reflects the removal of

	starting silence */

	//PART B

	public void trimSilenceFromBeginning()

	{ // insert your code here for part b
		int beginning = -1;
		int[] temp = samples;

		for (int i=0; i<samples.length; i++){
			if (beginning == -1){
				if (samples[i] != 0){
					beginning = i;
					temp = new int[samples.length-i];
				}
			}
			if (beginning > -1)
				temp[i-beginning] = samples[i];
		}
		
		samples = temp;

	}

	// Prints the array

	public String toString()

	{

		String s = "";
	
		for (int i = 0; i < samples.length; i++) {

		s += samples[i];

		s += "  ";

		}

		return s;

	}

}
