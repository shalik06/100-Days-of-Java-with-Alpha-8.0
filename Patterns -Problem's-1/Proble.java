import java.util.*;;
public class Proble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of line");
        int n = sc.nextInt();
        System.out.println("Enter number of Star");
         int m = sc.nextInt(); 
        for(int i = 0; i<n; i++){
            for(int j = 0; j <m; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
    
}
