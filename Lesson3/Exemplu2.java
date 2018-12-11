public class Exemplu2 {

    public static void main(String [] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        
        c1.name = "Tom";
        c2.name = "Leo";
        Cat.name = "Mitzy";
        
        System.out.println(c1.name);
        System.out.println(c2.name);
    }
}