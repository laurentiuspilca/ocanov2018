package Exemple;

public class Exemplu9 {
    public static void main(String[] args) {

        String anotimp = "primavara";

        switch (anotimp) {
            case "primavara":
            case "toamna":
                System.out.println("Ploua");
                break;
            case "vara":
                System.out.println("Poate este cald");
                break;
            case "iarna":
                System.out.println("Poate este frig");
        }
    }
}
