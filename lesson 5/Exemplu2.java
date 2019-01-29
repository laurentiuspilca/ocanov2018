public class Exemplu2 {

    public static void main(String [] args) {
        int [] x1 = {1,2,3,4,5};
        
        System.out.println(x1.length);
        
        int [] x2 = new int[]{1,2,3,4,5};
        
        System.out.println(x2.length);
        
        int [] x3 = new int[5];
        
        x3[5] = 10; // ArrayIndexOutOfBoundsException
    }
}