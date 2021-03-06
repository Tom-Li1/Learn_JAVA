public class LogicOperator {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        System.out.println("( 1 > 2 ) & ( 1 < 0 ) : " + (( 1 > 2 ) & ( 1 < 0 )));
        System.out.println("( 1 > 0 ) | ( 1 < 0 ) : " + (( 1 > 0 ) | ( 1 < 0 )));
        System.out.println("( 1 > 0 ) ^ ( 1 < 0 ) : " + (( 1 > 0 ) ^ ( 1 < 0 )));
        System.out.println("( 1 > 2 ) && ( 1 < 0 ) : " + (( 1 > 2 ) & ( 1 < 0 )));
        System.out.println("( 1 > 0 ) || ( 1 < 0 ) : " + (( 1 > 0 ) | ( 1 < 0 )));
        System.out.println("!( 1 > 1 ) : " + !( 1 > 1 ));
    }
}
