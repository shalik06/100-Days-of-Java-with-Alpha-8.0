public class ClerithBit {
    public static int clerarithbit(int n, int i){
        int bitMarks = ~(1<<i);
        return n & bitMarks;
    }
    public static void main(String[] args) {
        System.out.println(clerarithbit(10, 1));
    }
    
}
