import java.util.*;
public class factorialA{
    public static int fact(int n){
        int f = 1;
        for(int i = 1; i<=n ; i++){
        f = f * i;
        }
        return f;
    }
    public static void main(String[] args){
    
       int factorial = fact(5);
       System.out.println(factorial);
    }
}