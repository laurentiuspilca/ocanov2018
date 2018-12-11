public class Exemplu8 {

    public static void main(String [] args) {
        int [] x;
        x = new int[10];
        
        x[0] = 10;
        
        for (int i=0; i<x.length; i++) {
            x[i] = i * 10;
        }
        
        for (int q : x) {
            System.out.println(q);
        }
    }
}