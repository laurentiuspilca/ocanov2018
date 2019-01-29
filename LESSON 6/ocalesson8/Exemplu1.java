public class Exemplu1 {

    public static void main(String [] args) {
        
        MyFunctionalInterface f1 = () -> System.out.println("Hello");
        
        f1.m();
        
        
        MyFunctionalInterface f2 = new MyFunctionalInterfaceImpl();
        
        f2.m();
        
    }
    
    static class MyFunctionalInterfaceImpl implements MyFunctionalInterface {
        
        public void m() {
            System.out.println("Hello");
        }
    }
}