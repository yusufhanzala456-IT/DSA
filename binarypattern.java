public class binarypattern {
    public static void bin_patt(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                sum = i + j;
                if(sum % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        bin_patt(5);
    }
}
