public class Exemplu4 {

    public static void main(String [] args) {
        
        try {
            int x = 10 / 0;
            System.out.println("1");
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("2");
        } 
        
    }
}