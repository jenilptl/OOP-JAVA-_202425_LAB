public class OperatorPrecedenceA{
    public static void main(String[] args){
 
        int result1 = 10 + 20 * 30;
        System.out.println("10 + 20 * 30 = " + result1);

        int result2 = 100 / 10 * 100;
        System.out.println("100 / 10 * 100 = " + result2);

        int result3 = 5 * 4 / 4 % 3;
        System.out.println("5 * 4 / 4 % 3 = " + result3);

        int result4 = 100 + 200 / 10 - 3 * 10;
        System.out.println("100 + 200 / 10 - 3 * 10 =" + result4)  ;
    }
}