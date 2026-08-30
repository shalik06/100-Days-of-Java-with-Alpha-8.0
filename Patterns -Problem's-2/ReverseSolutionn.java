import java.util.*;
public class ReverseSolutionn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i >=1; i--){
    for(int j = n; j>=i; j--){
        System.out.print(j);
    }
    for(int k = i+1; k<=n; k++ ){
        System.out.print(k);
    }
    System.out.println();

    sc.close();
}
    }
}
