// Write a program to print the multiplication table of a number N, entered by the
// user.
import java.util.*;
public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number That's want to multiply");
        num = sc.nextInt();
        for(int i = 1; i <= 10; i++ ){
            System.out.println(num  + "*" + i + "=" + (num * i));
        }
        sc.close();
    }
}
