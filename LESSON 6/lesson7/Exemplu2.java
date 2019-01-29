public class Exemplu2 {

    public static void main(String [] args) {
        //Shape s1 = new Shape();
        
        Shape s1 = new Rectangle(10, 20);
        Rectangle r1 = new Rectangle();
        
        r1.name = "R1";
        r1.w = 10; r1.h = 20;
        double area1 = r1.computeArea();
        
        s1.name = "R2";
        double area2 = s1.computeArea();
        
        System.out.println(area2);
    }
}