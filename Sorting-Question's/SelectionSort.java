public class SelectionSort {
    public static void main(String[] args) {
        int arr[] ={2,5,7,8,9,12,25,35};
        int n =8;

        for(int i =0; i<n-1; i++){
        int max =i;
        for(int j = i+1; j<n; j++){
            if (arr[j]> arr[max]) {
            max = j;
        }
    }
        int temp = arr[i];
        arr[i]= arr[max];
        arr[max] = temp;    
    }
    for(int i=0; i<n; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    
}
    }
