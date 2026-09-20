public class Sortedarr {

    public static int search(int arr[], int tar, int si, int ei) {

        // Base case
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // Target found
        if (arr[mid] == tar) {
            return mid;
        }

        // Left half is sorted
        if (arr[si] <= arr[mid]) {

            // Target lies in left sorted half
            if (arr[si] <= tar && tar < arr[mid]) {
                return search(arr, tar, si, mid - 1);
            }

            // Target lies in right half
            else {
                return search(arr, tar, mid + 1, ei);
            }
        }

        // Right half is sorted
        else {

            // Target lies in right sorted half
            if (arr[mid] < tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            }

            // Target lies in left half
            else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {4, 5, 6, 7, 0, 1, 2};

        int target = 0;

        int taridx = search(arr, target, 0, arr.length - 1);

        System.out.println(taridx);
    }
}

