// Question1:Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)
import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int average = (A+B+C)/3;
        System.out.println("Average is: " + average);
        sc.close();
    }
}
