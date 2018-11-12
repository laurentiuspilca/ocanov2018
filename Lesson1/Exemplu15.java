public class Exemplu15 {

    public static void main(String [] args) {
        int n = 12321;
        
        boolean res = new StringBuilder(""+n).reverse().toString().equals(""+n);
        System.out.println(res);
    }
}