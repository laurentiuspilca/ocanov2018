public class Exemplu6 {

    public static void main(String [] args) {
        int [][] x = new int[3][4];
        
        for (int [] q : x) {
            System.out.println(q); // [I@.....
            for (int w : q) {
                System.out.print(w + " ");
            }
        }
    }
}