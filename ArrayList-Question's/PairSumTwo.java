import java.util.ArrayList;

public class PairSumTwo {   // 2 Pointer Approach

    public static boolean pairsumtwo(ArrayList<Integer> list, int target) {

        int bp = -1;
        int n = list.size();

        // Find break point
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        // If array is not rotated
        if (bp == -1) {
            bp = n - 1;
        }

        // Left pointer
        int lp = (bp + 1) % n;

        // Right pointer
        int rp = bp;

        while (lp != rp) {

            int sum = list.get(lp) + list.get(rp);

            if (sum == target) {
                return true;
            }

            if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (rp - 1 + n) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairsumtwo(list, target));
    }
}