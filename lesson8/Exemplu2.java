public class Exemplu2 {

    public static void main(String [] args) {
        calculate(x -> 2 * x, 10);
        calculate(x -> 3 * x, 10);
        
        Functie f = new Functie() {
        
            public int apply(int x) {
                return x * x;
            }
            
        };
        calculate(f, 10);
    }
    
    static void calculate(Functie f, int x) {
        System.out.println(f.apply(10));
    }
}