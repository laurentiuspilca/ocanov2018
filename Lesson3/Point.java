public class Point {
    
    int x,y;
    static int z;
    
    Point(int x, int y) {
        System.out.println(":|");
        this.x = x;
        this.y = y;
    }
    
    {
        System.out.println(":)");
    }
    
    static {
        System.out.println(":(");
    }
    
    void showCoord() {
        System.out.println(this.x + " " + this.y);
    }
}