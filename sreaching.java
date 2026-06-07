import java.util.*;
public class sreaching {
    public static int Bin_Search(int number[], int key){
        int start = 0, end = number.length-1;
        while(start <= end){
            int mid = (start + end )/2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] > key){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] = {2, 4, 6, 8, 10 ,12, 14};
        int key = 10;
        System.out.println("Index of the key is :" + Bin_Search(number, key));
    }
    
}
