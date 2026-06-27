# Linear Search

- time comeplexity O(n)

```java
    public static int LinearSch(int k, int arr[]){
       int indexVal = 0 ;
       for(int i  = 0 ; i <= arr.length - 1 ; i++){
           if(arr[i] == k ){
               indexVal = i ;
           }
       }
       return indexVal ;
   }
```

# Biinary Search

- works on sorted array

- time complexity O(log n)

```java

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
```
