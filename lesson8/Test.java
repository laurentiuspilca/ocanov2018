public interface Test {

    public static final int x = 10;
    
    void m1();
    
    default void m2() {
        
    }
    
    static void m3() {
    }
}