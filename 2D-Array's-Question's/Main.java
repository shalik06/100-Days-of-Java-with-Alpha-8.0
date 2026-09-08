public class Main {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 },
        };
        int numRows = arr.length;
        int sum = 0;
        int numCols = arr[0].length;
        for (int j = 0; j < numCols; j++) {
            sum += arr[1][j];
        }
        System.out.println(sum);
    }

}
