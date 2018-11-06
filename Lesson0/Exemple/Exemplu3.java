package Exemple;

public class Exemplu3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        if (y / x > 5)  {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

        //tips and tricks (C nu este in else)
        if (y / x > 5)
            System.out.println("A");
        else
            System.out.println("B");
            System.out.println("C");

    }
}
