public class BionomialCoefficient {
     public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    } 

    public static int bioCoeff(int n, int r){
       int  nfact = factorial(n);
       int  rfact = factorial(r);
       int nmrfact = factorial(n-r);

       int bioCoeff = nfact / (rfact *nmrfact);
       return bioCoeff;

    }
    public static void main(String[] args) {
        System.out.println(bioCoeff(5, 2));
    }
}
