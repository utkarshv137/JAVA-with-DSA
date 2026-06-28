

// time complexcity O(n^2)
public class Pairs {
    public static void PrintPairs(int[] arr){
        int current = 0 ;
        for (int i = 0; i < arr.length; i++) {
            current = arr[i] ;
            for(int j = i+1 ; j < arr.length ; j ++){
                System.out.print("(" + current + " , " + arr[j]+ ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10} ;
        PrintPairs(arr);
        
    }
}
