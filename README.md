**Java Programming Questions and Answers**

**Count the occurrence of a given character in string**

```java
public class Main{
	 public static void main (String args[]){
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
  }
```
**Find the largest number in an integer array**

```java
public class Main {
  public static void main(String args[]) {
    int array[] = { 3, 5, 4, 1, 8, 2, 9 };
    int maximum = array[0];
    for (int arr: array){
      if(maximum<arr){
          maximum = arr;
      }
    }
    System.out.println(maximum);
  }
}
```
### To find the minimum and maximum values that can be calculated by summing exactly four of the five integers from the input set {1, 3, 5, 7, 9}
```java
 public static void main(String[] args) {
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
```
**Write a program to reverse a string in Java**
```java
   public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder StringBuilder = new StringBuilder(s);
        System.out.println(StringBuilder.reverse().toString());
    }
```
**Write a program to check if a given number is prime in Java**
```java
public static void main(String[] args){
     Scanner Scanner = new Scanner(System.in);
     int number = Scanner.nextInt();
     boolean isPrime = true;
     if (number<=1){
            isPrime = false;
            } else{
         for (int i=2;i<number; i++ ){
             if(number % i ==0){
                isPrime = false;
                 break;
             }
         } 
     }
     if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
```
**Write a program to find the factorial of a given number in Java**
``` java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);
        
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
```
**write a program to print prime odd numbers from 1 to 100**
```java
public class Main{
  public static void main (String[]args){
	int result;
	for (int i = 2; i <= 100; i++){
		if (prime(i)){
			System.out.println (" " + i);
		  }
	  }
  }

  public static boolean prime(int value){
	if (value <= 1){
		return false;
	}
	for (int i = 2; i <= Math.sqrt(value); i++){
		if (value % i == 0){
			return false;
		  }
	  }
	return true;
  }
}
```
**Write a program to remove duplicate elements from an array in Java**
```java
  public static void main(String args[]){
    
        
        Integer[] array = {1,2,3,4,5,6,1,2,2,1,3,5};
        
        Set<Integer> set = new LinkedHashSet<>();
        
        for (int i: array){
            
            set.add(i);
        } 
        
        System.out.println("removed duplicates"+ set);
    }
```
