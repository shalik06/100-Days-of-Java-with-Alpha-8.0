public class InsertionSort {
    public static void main(String[] args) {
        int arr[] ={2, 4, 7, 8, 9, 12, 14, 16, 20, 26};
        int n = 10;
        for(int i =1; i<n;i++){
            int j = i-1;
            int key = arr[i];
            while (j>=0 && arr[j]< key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;

        }
        for(int i= 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
