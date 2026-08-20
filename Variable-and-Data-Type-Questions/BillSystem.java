// Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
import java.util.*;
public class BillSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pencil Price : ");
        float Pencil = sc.nextFloat();
        System.out.println("Enter a Pen Price: ");
        float Pen = sc.nextFloat();
        System.out.println("Enter a Eraser Price: ");
        float Eraser = sc.nextFloat();
        float costoftotalitem = Pencil + Pen + Eraser;


         System.out.println("================= Your Bill=======================");
        System.out.println("Enter pencil Price : " + Pencil);
        System.out.println("Enter a Pen Price: " + Pen);
        System.out.println("Enter a Eraser Price: " + Eraser);
        System.out.println("Cost Of Total Items: " + costoftotalitem);
        
        sc.close();
         
        
    }
}
