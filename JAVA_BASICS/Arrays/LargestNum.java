
import java.util.* ;
public class LargestNum {
    public static int LargeNum(int arr[]){
        int greatestNum = Integer.MIN_VALUE ;
        for (int i = 0 ; i <= arr.length - 1 ; i++){
            if(greatestNum < arr[i]){
                greatestNum = arr[i] ;
            }
        }
        return greatestNum ;
    }
    public static int SmallNum(int arr[]){
        int smallestNum = Integer.MAX_VALUE ;
        for (int i = 0 ; i <= arr.length - 1 ; i++){
            if(smallestNum > arr[i]){
                smallestNum = arr[i] ;
            }
        }
        return smallestNum ;
    }
    public static void main(String[] args) {
        int arr[] = {10,23,65,89,34,567,23,6,8} ;
        System.out.println("the Largest Number in the Array is : " + LargeNum(arr));
        System.out.println("the Largest Number in the Array is : " + SmallNum(arr));
        
    }
    
}
