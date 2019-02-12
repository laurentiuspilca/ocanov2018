public class Exemplu5 {

    public static void main(String [] args) {
        
        try {
            int x = 10 / 2;
            System.out.println("1");
        } catch (ArithmeticException e) {
            System.out.println("3");
        } catch (Exception e) {
            System.out.println("2");
        } finally {
            System.out.println("4");
        }
        
    }
}