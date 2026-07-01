public class Recursion  {
    public static void DecNum(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+ " ");
        DecNum(n-1);

    }
    public static void IncNum(int n){
        if(n == 1){
            System.out.print(n+ " ");
            return;
        }
        IncNum(n-1);
        System.out.print(n+ " ");
    }
    public static int fact(int n){
         if (n == 0) {
            return 1;
        }
        int fact = fact(n-1);
        fact = n * fact;
        return fact;
       
    }
    public static int PrntNNatural(int n){
        if(n == 1){
            return 1;
        }
        int m = n + PrntNNatural(n-1);
        
        return m;
    } 
     public static int Fibbo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = Fibbo(n-1);

        int fnm2 = Fibbo(n-2);
        int fn = fnm1 + fnm2;
        return fn;
     }
    public static void main(String args[]){
        // int n = 10;
        // DecNum(n);
        // IncNum(n);
        //System.out.println(fact(5));
        //System.out.println(PrntNNatural(5));
        System.out.println(Fibbo(10));
    }
    
}
