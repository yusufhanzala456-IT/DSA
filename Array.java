import java.util.*;
public class Array {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static int linear_search(int number[], int key){
        for(int i = 0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int largest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest<number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
       // int marks[] = {97, 98, 99};
        //System.out.println(marks);
        //update(marks);
        //for(int i=0; i<marks.length; i++){
         //   System.out.print(marks[i]+" ");
       // }
        //System.out.println();
    //}
        // int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // int key = 10;
        // int index = linear_search(number, key);
        // if(index == -1){
        //     System.out.print("Key is not found");
        // }
        // else{
        //     System.out.print("Key is at index :" + index);
        // }
        int number[] = {1, 2, 6, 5, 4};
        System.out.print("Largest value is : "+ largest(number));
    }
}
  