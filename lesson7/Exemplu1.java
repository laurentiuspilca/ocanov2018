public class Exemplu1 {

    public static void main(String [] args) {
        Tricycle t1 = new Tricycle();
        t1.front = new Wheel();
        t1.back = new Wheel();
        t1.third = new Wheel();
        
        Bicycle b1 = new Tricycle();
        Tricycle t2 = (Tricycle) b1;
        
        Object o1 = new Tricycle();
    }
    
}
