import java.util.* ;

public class odd_even_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            int e ;
            int o ;
            System.out.println("enter num1");
            e = input.nextInt();
            System.out.println("enter num2");
            o = input.nextInt();
            // if(e == 0 || o == 0 ){

            // }
            if((e % 2 == 0)&&(o % 2 != 0)){
                int sum = e + o ;
                System.out.println("the sum of odd and even is :" + sum );

            }else if ((o % 2 == 0)&&(e % 2 != 0)){
                 int sum = e + o ;
                System.out.println("the sum of odd and even is :" + sum );

            }else if((e == 0) && (o % 2 != 0) ){
                int sum = e+o ;
                System.out.println("the sum of odd and even is :" + sum );

            }
            else if((o == 0) && (e % 2 != 0) ){
                int sum = e + o ;
                System.out.println("the sum of odd and even is :" + sum );

            }
          
        }
    }
}
