public class Exemplu13 {

    public static void main(String [] args) {
        int x = 10;
        int y;
        
        /*
        if (x < 20) {
            y = 100;
        } else {
            y = 200;
        }
        */
       
        y = x < 20 ? 100 : x > 40 ? 500 : 400; // ?:
        System.out.println(y);
    }
}