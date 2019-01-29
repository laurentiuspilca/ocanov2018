public abstract interface Eatable {
    
    public static final int x = 10;

    void eatMe();
    
    default void m1() {
    }
    
    static void m2() {
    }
}