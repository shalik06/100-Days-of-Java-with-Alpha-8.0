public class UpdateithBit {
     public static int clerarithbit(int n, int i){
        int bitMarks = ~(1<<i);
        return n & bitMarks;
    }
    //   public static int setithbit(int n , int i){
    //     int bitMarks = 1<<i;
    //     return n|  bitMarks;
    // }

    public static int updateithbit(int n, int i, int newBit){
        // if (newBit == 0) {
        //     return clerarithbit(n, newBit)
        // }else{
        //     return setithbit(n, newBit)
        // }
         n = clerarithbit(n, i);
        int bitMarks = newBit<<i;
        return n | bitMarks;
    }
    public static void main(String[] args) {
        System.out.println(updateithbit(10, 2, 1));
    }
    
}
