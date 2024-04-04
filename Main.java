public class Main
{


  public static void main (String args[])
  {


	int array[] = { 3, 5, 4, 1, 8, 2, 9 };


	int maximum = array[0];

	for (int arr: array){
    	  if(maximum<arr){
        	  maximum = arr;
      		}
    	}
	System.out.println (maximum);

  }


}
