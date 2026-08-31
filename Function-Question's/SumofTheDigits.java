// Write a Java method to compute the sum of the digits in an integer.
// (Hint: Approach this question in the following way:
// a. Take a variable sum = 0
// b. Find the last digit of the number
// c. Add it to the sum
// d. Repeat a & b until the number becomes 0 
import java.util.*;
public class SumofTheDigits {

    public static int sumofDigits(int n){
        int sum = 0;
        while (n >0) {
            int lastDigits = n % 10;
            sum += lastDigits;
            n /= 10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " Enter a Number ");
        int num = sc.nextInt();
        System.out.println("The sum is: " + sumofDigits(num));

        sc.close();
    }
    
}