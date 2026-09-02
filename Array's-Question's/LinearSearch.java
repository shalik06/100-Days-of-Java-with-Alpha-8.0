public class LinearSearch{
    public static int linearsearch(int number[], int key){
        for(int i =0; i <number.length; i++){
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] ={2, 4, 6, 8, 10, 12, 14, 16};
        int kye =10;

        System.out.println("kye found at index: " +linearsearch(number, kye));
    }
}