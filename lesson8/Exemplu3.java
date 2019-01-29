public class Exemplu3 {

    public static void main(String [] args) {
        
        Functie f1 = x -> 4;
        Functie f2 = (x) -> 4;
        Functie f3 = (int x) -> 4;
        
        Functie f4 = x -> {
            
            return 4;
        };
        
        BiFunctie b1 = (x,y) -> 4;
        BiFunctie b2 = (int x, int y) -> 4;
        
    }
}