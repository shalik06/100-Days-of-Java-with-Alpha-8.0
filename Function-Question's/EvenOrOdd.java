// Write a method named isEven that accepts an int argument. The method
// should return trueiftheargumentiseven,orfalseotherwise.Alsowriteaprogramtotestyour
// method.
import java.util.*;
public class EvenOrOdd {

    public static boolean isEven(int num){
        if (num % 2 == 0) {
            return true;
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        if (isEven(num)) {
            System.out.println("number is Even");
        }else{
            System.out.println("Number is odd");
        }
        sc.close();

        
    }
}
