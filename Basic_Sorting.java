import java.util.*;
public class Basic_Sorting {
    public static void Bubble_Sort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void Selection_Sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void Insertion_Sort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int previous = i-1;
            while(previous>= 0 && arr[previous] > current){
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = current;
        }
    }
    public static void printarr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Integer arr[] = {1, 3, 2, 5, 4};
       // Insertion_Sort(arr);
        Arrays.sort(arr, 0, 5, Collections.reverseOrder());
        printarr(arr);
    }
}
