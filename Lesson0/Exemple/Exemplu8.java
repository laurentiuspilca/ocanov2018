package Exemple;

public class Exemplu8 {
    public static void main(String[] args) {
       final int anotimp = 1;  // int, char, String, enum

        switch (anotimp) {
            case 1: //nu puteam folosi direct anotimp intr-un case
                System.out.println("Primavara");
                System.out.println("Primavara");
                System.out.println("Primavara");
                System.out.println("Primavara");
                break; //fara break continua | dupa break urmeaza doar un alt case sau default sau inchiderea switch-ului
            case 2:
                System.out.println("Vara");
                break;
            case 3:
                System.out.println("Toamna");
                break;
            case 4:
                System.out.println("Iarna");
                break;
            default:
                System.out.println(":)");
        }
    }
}
