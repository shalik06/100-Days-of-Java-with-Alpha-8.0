
// Write a Java method to compute the averageof three numbers.
import java.util.*;

public class Average {
    public static int Averages(int a, int b, int c) {

        return (a + b + c) / 3;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Scond Number");
        int b = sc.nextInt();
        System.out.println("Enter Third Number");
        int c = sc.nextInt();

        System.out.println("The Average Value is : " + Averages(a, b, c) + "\n");

        sc.close();
    }
    
}
