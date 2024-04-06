import java.util.Arrays;

public class Main{
  public static void main (String args[]){
	  findLargerNumber();
		countChar();
		findSumOfMinMax();
	  public void findLargerNumber(){
	    int array[] = { 3, 5, 4, 1, 8, 2, 9 };
	    int maximum = array[0];
	    for (int arr: array){
    	   if(maximum<arr){
          	  maximum = arr;
      		}  
    	}
    	System.out.println (maximum);
	  } 

		public void countChar(){
			 String string = "this the string valueee";
        char chr = 'v';
        int count = 0;
        for (char c : string.toCharArray()){
            if (c == 'v'){
                count++;
            } 
        }
        System.out.println(count);
   }

		public void findSumOfMinMax(){

			 int[] numbers = {1, 3, 5, 7, 9};
        Arrays.sort(numbers); // Sort the array in ascending order
        long min = 0;
        long max = 0;
        // Calculate the minimum value by summing the first four elements
        for (int i = 0; i < 4; i++) {
            min += numbers[i];
        }
        // Calculate the maximum value by summing the last four elements
        for (int i = 1; i < 5; i++) {
            max += numbers[i];
        }
        System.out.println(min + " " + max);
		}
}
