public class FunctionOverloading {
    
    // Function Overloading
    public static int sum(int a, int b){
        int ans = a + b ; 
        return ans ; 
    }

    public static int sum(float a, float b){
        int ans = (int)(a + b) ; 
        return ans ; 
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 8));
        System.out.println(sum(7.5f, 9.8f));
    }
}
