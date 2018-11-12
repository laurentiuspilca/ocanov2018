public class Exemplu16 {

    public static void main(String [] args) {
        // SI, SAU, NOT
        
        /*
         * &&   &   ||    |   !
         */
        
        boolean b1 = true;
        boolean b2 = !b1;
        
        System.out.println(b2);
        
        
        boolean b3 = b1 && b2;  //  b1 & b2
        boolean b4 = b1 || b2; // b1 | b2
    }
}