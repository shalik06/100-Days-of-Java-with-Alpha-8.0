// Question 2 : Print out the sum of the numbers inthe second row of the “nums” array.
// Example :
// Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18
public class SecondQuestion {

    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 } };

        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[1][j];
            
        }
        System.out.println("Sum is " + sum);

    }
}
