public class Rectangle extends Shape {
    
    double w, h;
    
    public Rectangle() {
    }
    
    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }
    
    double computeArea() { // overriding
        return w * h;
    }
    
    
}