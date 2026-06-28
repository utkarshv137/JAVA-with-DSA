public class reverseArray{
    public static int[] rArray(int arr[]){
        int first = 0 , last = arr.length-1 ;
        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last] ;
            arr[last] = temp ;
            first ++ ;
            last -- ; 
        }
        return arr ;
        
    }
    public static void main(String[] args) {
       int xyz[] = {23,45,78,34,23,90} ;
       rArray(xyz) ;
       for (int i = 0; i < xyz.length; i++) {
        System.out.print(xyz[i]);
       } 
    }
}