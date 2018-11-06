package Exemple;

public class Exemplu6 {

    public static void main(String[] args) {

        int x = 10 + 5;

        String y = "Hello " + "world";

        //println = new line
        System.out.println(x);
        System.out.println(y);

        String z = "Ana are " + 3 + 4 + " mere"; // are 34 mere | daca punem paranteza (3+4) rezulta ca are 7 mere
        System.out.println(z);

        String w = 3.1 + 4.3 + " mere are Ana";
        System.out.println(w); // are 7.4 mere

        //double problems
        System.out.println(1.03 - .42);

        double a = 0.02;
        double b = 0.03;
        double c = b - a;
        System.out.println(c);
    }
}
