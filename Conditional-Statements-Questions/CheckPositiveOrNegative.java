// Write a Java program to get a number from the user and print whether it is
// positive or negative.
import java.util.*;
public class CheckPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if (num1 > 0) {
            System.out.println("Positive Number");
        }else{
            System.out.println("Negative Number");
        }
        sc.close();
    }
}