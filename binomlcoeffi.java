import java.util.*;
public class binomlcoeffi{
    public static int fact(int n){
        int f = 1;
        for(int i = 1; i<=n ; i++){
        f = f * i;
        }
        return f;
    }
    public static void main(String[] args){
    
    int n = 5, r=2;
       int n_fact = fact(n);
       int r_fact = fact(r);
       int nmr_fact = fact(n-r);

       int  binomial_coefficient = (n_fact) / (r_fact * nmr_fact);
       System.out.println(binomial_coefficient);
    }
}