public class LinearSearch {
    public static int LinearSch(int k, int arr[]){
        int indexVal = 0 ;
        for(int i  = 0 ; i <= arr.length - 1 ; i++){
            if(arr[i] == k ){
                indexVal = i ;  
            }
        }
        return indexVal ;
    }
    public static void main(String[] args) {
        int arr[] = {12,34,56,89,56,07,234,56};
        System.out.println("the key is at index no. : " + LinearSch(56,arr));  ;
        
    }
}
