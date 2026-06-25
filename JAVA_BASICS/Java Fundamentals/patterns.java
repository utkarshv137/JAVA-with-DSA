public class patterns {
    public static void main(String args[]){
        int  n = 9 ;
        char ch = 'A' ;

        //invverted half pyramid  
        for(int i = 1 ; i <= n; i++){
            for(int j =n ; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        //half-pyramid of numbers
        for(int i = 1 ;i <=n;i++){
            for(int j = 1 ; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();

        }

        //half character pyramid 
         for(int i = 1 ;i <=n;i++){
            for(int j = 1 ; j<=i; j++){
                System.out.print(ch);
                ch++ ;
            }
            System.out.println();

        }
    }
}