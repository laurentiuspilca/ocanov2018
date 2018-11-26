public class Exemplu4 {

    public static void main(String [] args) {
        NumarComplex c1 = new NumarComplex();
        c1.a = 10;
        c1.b = 5;
        
        NumarComplex c2 = new NumarComplex();
        c2.a = 4;
        c2.b = 7;
        
        NumarComplex rez = c1.suma(c2);
        
        System.out.println(rez.a + " " + rez.b);
    }
}