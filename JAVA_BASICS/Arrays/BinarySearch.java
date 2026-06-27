public class BinarySearch {

    public static int Bsearch(int arr[] , int key){
        int start = 0 ;
        int end = arr.length - 1 ; 
        int mid; ;
        
        while(start<=end){
           mid = (start+end)/2 ;
           if(arr[mid]==key){
             return mid  ;
           }
           else if(arr[mid] < key){
               start = mid + 1 ;
            }
            else if(arr[mid] > key){
               end = mid - 1 ;
           }
        } 
        return -1 ;
    }
    public static void main(String[] args) {
        int xyz[] = {10,29,38,47,56};
        System.out.println("the index for the key is : " + Bsearch(xyz, 89));
    }
}
