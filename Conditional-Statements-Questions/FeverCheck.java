// Finish the following code so that it prints You have a fever if your temperature
// is above 100 and otherwise prints You don't have a fever
import java.util.*;
public class FeverCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if (temp <= 100) {
            System.out.println("You don't have Fever");
        }else{
            System.out.println("Fever");
        }
        sc.close();
    }
    
}
