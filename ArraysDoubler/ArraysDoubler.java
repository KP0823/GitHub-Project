import java.util.Arrays;
//learning more arrays
public class ArraysDoubler
{

	public static int[] thedoubler(int[] arrays)
	{	
		int[]thearrays = new int[arrays.length *2];
		for(int i = 0;i < arrays.length; i++)
		{
			thearrays[i] = arrays[i];

		} 		
	
	return thearrays;
	}

	public static void main(String[] args)
	{
		int[] bigarrays = {9,6,7,5,4};		
		System.out.println("the old array is "+ Arrays.toString(bigarrays));	
		System.out.println("the new array is " + Arrays.toString(thedoubler(bigarrays)));	

		

	} 
}
