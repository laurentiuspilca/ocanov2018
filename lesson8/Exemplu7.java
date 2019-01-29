public class Exemplu7 {

    
    public static void main(String [] args) {
        Cat c1 = new Cat("Tom", 4);
        Cat c2 = new Cat("Leo", 4);
        Cat c3 = c1;
        
        
        boolean b1 = c1 == c2;
        boolean b2 = c1 == c3;
        
        System.out.println(b1);
        System.out.println(b2);
        
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
    }
}