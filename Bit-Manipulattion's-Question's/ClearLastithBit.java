public class ClearLastithBit {
    public static int clearlastithbit(int n, int i){
        int bitMars = (~0)<<i;
        return n & bitMars;
    }
    public static void main(String[] args) {
        System.out.println(clearlastithbit(15, 2));
    }    
}
