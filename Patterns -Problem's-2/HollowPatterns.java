public class HollowPatterns {
    public static void Hollow_Rectangle(int tatRows, int totCols){
        for(int i =1; i<=tatRows; i++){
            for(int j = 1; j<= totCols; j++){
                if (i == 1 || i == tatRows || j == 1 || j == totCols) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    

    public static void main(String[] args) {
        Hollow_Rectangle(4, 5);
    }
}
