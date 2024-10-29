**Java Programming Questions and Answers**

## 1.Reverse String
Explanation: This solution uses two pointers (left and right) to swap characters from both ends towards the middle. We create a character array for in-place modifications and convert it back to a string for output.
```java
 // create a class
public class Reverse{
  // create a main method
  public static void main(String args[]){
  String string = "Hellojava";
  String _reverse = reverser(string);
  System.out.println(_reverse);
}
  // methods to reverse the string
  public static String reverser(String string){
	// create a char variable and change the string to char array
	char[] charater = string.toCharArray();
	int left = 0;
        // variable of length of the string
	  int right = string.length() -1;
		while (left < right){
		char temp = charater[left];
		charater[left] = charater[right];
		charater[right] = temp;
		left++;
		right--;
		}

//using for loop
 char[] chr = string.toCharArray();
	    int n = chr.length;
	    for (int i =0; i< n/2; i++){
	        char temp = chr[i];
	        chr[i] = chr[n - i -1];
	        chr[n - i - 1] = temp;
	        
	    }
return new String(charater);
  }
}
```

## 2.3rd largest number 
- We maintain three variables (first, second, third) representing the largest, second-largest, and third-largest values. As we iterate, we update these variables to capture the top three values.
```java
public class Largest {
    public static void main(String[] args){
        int[] array = {3, 5, 7, 2, 8, 6};
        System.out.println(largestNumber(array));
    }
    public static int largestNumber(int[] number){
        if(number.length < 3) return -1;
        int first = Integer.MIN_VALUE;
        int secound = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int array: number){
            if ( array > first){
                third = secound;
                secound = first;
                first = array;
            }else if(array > secound && array < first){
                third = secound;
                secound = array;
            } else if(array > third && array < secound){
                third = array;
            }
        }
        return third == Integer.MIN_VALUE ? -1: third;
    }
}
```
3.sort without in-build using bubble sorting
```java
class Main{
    public static void main(String args[]){     
        int[] arr = {25,11,7,4,8,3};
        sortArray(arr);
        for(int num: arr){
          System.out.println(num + "");  
        } 
    }
    public static void sortArray(int[] array){
        int n = array.length;
        for (int i=0; i< n - 1; i++){
            for (int j=0; j< n - i - 1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                } 
            }   
        }     
    }
}
```
4.check palindrom in the string 
```java
public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println("Is Palindrome: " + isPalindrome(str));
    }
}
```
**Count the occurrence of a given character in string**
``` kotlin
fun main() {
    val string = "Andriod program pm"
    val result = countChar('m',string)
    println(result)
}
fun countChar(letter: Char, string : String): Int{
    return string.count { it==letter}
}
```

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
```kotlin

fun main() {
 
    val array = intArrayOf(2,12,4,5 ,77)
    
    val result = findLargest(array)
    
    println(result)
    
}

fun findLargest(array: IntArray): Int?{
    
    return array.maxOrNull()
}
```

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
