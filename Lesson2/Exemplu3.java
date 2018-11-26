public class Exemplu3 {

    public static void main(String [] args) {
        Pisica p1 = new Pisica("Tom", "negru");
        Pisica p2 = new Pisica("Leo", "gri");
        
        System.out.println(p1.nume);
        System.out.println(p2.nume);
        
        p1.spuneMiau();
        p2.spuneMiau();
    }
}