public class bin_coefficient {
    public static int fact(int n){
        int f = 1;
        for (int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }
    public static int bin_coefficient(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int bin_coefficient = fact_n / (fact_r * fact_nmr);
        return bin_coefficient;
    }
    
    public static void main(String args[]){
        System.out.print(bin_coefficient(5 , 2));
    }
}
