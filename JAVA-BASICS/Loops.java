public class Loops {
    public static void main(String[] args) {
        // while loop 
        int a = 0;
        while (a<=3){
            System.out.println(a);
            a++ ;
        } 

        // for loop 
        for(int i = 0 ; i<=2 ; i++){
            System.out.println("for loop");
        }

        // do while loop
        int c = 3 ;
        do{
            System.out.println("i am do-while");
            c-- ;
        }while(c>1) ;
    }
}
