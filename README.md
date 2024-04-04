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
}```
