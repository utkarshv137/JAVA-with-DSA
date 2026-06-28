public class subArrays {
    public static void Subarr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j = i ; j<arr.length; j++){
                System.out.print("["+arr[j]+"]");
            }
            System.out.println();   
        }
    }
    public static void main(String[] args) {
        int ar[] = {2,4,6,8} ;
        Subarr(ar);
    }
}
