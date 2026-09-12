// The idea is to use XOR operators toswap two numbers by their propertyx ^ x = 0publiccl
public class SolutionSecond {
    public static void main(String[] args) {
        int x = 3, y = 4;
        System.out.println("Before swap: x = " + x + " and y = " + y);
        x =x^y;
        y =x^y;
        x = x ^y;
                System.out.println("Before swap: x = " + x + " and y = " + y);
    }
}
