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
