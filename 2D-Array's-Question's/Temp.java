public class Temp{
    public static void main(String[] args) {
        int arr[][] ={{4,7,8}, {8, 8, 7}};
        int numrows = arr.length;
        int count =0;
        int numCols =arr[0].length;
        for(int i =0; i<numrows;i++ ){
            for(int j=0; j<numCols; j++){
                if (arr[i][j] == 7) {
                    System.out.println(i + " " + j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}