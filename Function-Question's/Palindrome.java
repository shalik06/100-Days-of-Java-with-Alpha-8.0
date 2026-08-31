// Write a Java program tocheckifanumberisapalindromeinJava?(121isa
// palindrome, 321 is not)
// Anumberiscalledapalindromeifthenumberisequaltothereverseofanumbere.g.,121isa
// palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321
import java.util.*;

public class Palindrome {
    public static boolean isPaindrome(int num){
        int originalnumber = num;
        int reverse = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }

        return originalnumber == reverse;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (isPaindrome(num)) {
            System.out.println(num + ":Number is Palindrome");
        }else{
            System.out.println(num + ": Number is not Palindrome");
        }
        sc.close();

    }
    
}
