public class ButterflyPattern {
    public static void Butter_fly(int n){
        for(int i = 1; i<=n; i++){
            //statrs - i
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            //space --- 2*(n-i)
            for(int j =1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half

         for(int i = n; i>=1; i--){
            //statrs - i
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            //space --- 2*(n-i)
            for(int j =1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Butter_fly(5);
    }
}
