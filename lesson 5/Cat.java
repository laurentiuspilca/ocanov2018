public class Cat {

    String name;
    
    Cat() {
    }
    
    Cat(String name) {
        this.name = name;
    }
    
    /**
     * paramteri diferiti
     *  - numar
     *  - tipul unuia dintre ei
     *  - ordinea parametrilor
     */
    void sayMeow() {
        System.out.println("Meow! My name is " + this.name);
    }
    
    static void sayMeow(String name) {
        System.out.println("Meow! My name is " + name);
    }
}