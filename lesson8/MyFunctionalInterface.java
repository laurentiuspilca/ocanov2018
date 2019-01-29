@FunctionalInterface
public interface MyFunctionalInterface {
    
    void m();
    
    default void m2() {
    }
}