public class Setithbit {
    public static int setithbit(int n , int i){
        int bitMarks = 1<<i;
        return n|  bitMarks;
    }
    public static void main(String[] args) {
        System.out.println(setithbit(10, 2));
    }
}
