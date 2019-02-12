public class Exemplu3 {

    public static void main(String [] args) {
        
        try {
            int x = 10 / 0;
            System.out.println("1");
        } catch (NullPointerException e) {
            System.out.println("2");
        } catch (ArithmeticException e) {
            System.out.println("3");
        }
        
    }
}