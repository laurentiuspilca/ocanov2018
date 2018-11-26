public class Exemplu2 {


    public static void main(String [] args) {
        Masina m1 = new Masina();
        Masina m2 = m1;
        Masina m3 = m1;
        
        boolean b1 = m1 == m2;
        boolean b2 = m1 == m3;
        
        System.out.println(b1 + " " + b2);
        
        Masina m4 = new Masina();
        
        boolean b3 = m1 == m4;
        
        System.out.println(b3);
    }
}