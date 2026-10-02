import java.util.ArrayList;
public class CreateArrayList{
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        ArrayList<Boolean>list3 = new ArrayList<>();


        list.add(1);  // O(1)
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1, 10);

        System.out.println(list);

        System.out.println(list.size());

        //print the arraylist
         for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
         }
         System.out.println();

        // // Get Operations   O(1)

        // int elemrnt = list.get(3);
        // System.out.println(elemrnt);

        // // Remove Operations   O(n)

        // list.remove(2);
        // System.out.println(list);

        // // Set Operations  O(n)
        // list.set(1, 10);
        // System.out.println(list);

        // //Contains Operations   O(n)
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));



    }
}