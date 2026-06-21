import java.util.Scanner ;
// import java.util.* ;

public class input {
    public static void main(String[] args) {

        Scanner st = new Scanner(System.in) ;

        String x = st.next() ;// will read input till first space
        String y = st.nextLine(); // read whole inut string 

     //   boolean bul = st.nextBoolean();
        
        double du = st.nextDouble();
        System.out.println(du);
    }
}
