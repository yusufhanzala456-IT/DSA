import java.util.*;
public class Bitmanupulation {
    public static void EvenOrOdd(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.print("Evem number\n");
        }
        else{
            System.out.print("Odd number\n");
        }
    }
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }
        else {
            return 1;
        }
    }
    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return n|bitMask;
    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        return n&bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }
        
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n|bitMask;
    }
    public static int clearIBit(int n, int i){
        int bitMask = (~0) << i;
        return n & bitMask;
    }
    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0) << (j+1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static int countSetsBit(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count ++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static int fastPow(int a, int n){
        int ans = 1;
        while(n>0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        EvenOrOdd(3);
        EvenOrOdd(4);
        EvenOrOdd(11);
        EvenOrOdd(16);
        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearIBit(15, 2));
        System.out.println(clearBitsInRange(10, 2, 4));
        System.out.println(isPowerOfTwo(8));
        System.out.println(countSetsBit(15));
        System.out.println(fastPow(3, 5));
        
    }
}
