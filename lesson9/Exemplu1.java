public class Exemplu1 {

    public static void main(String [] args) {
        //m2();
    }
    
    private static void m1() throws MyRuntimeException, NullPointerException {
        MyRuntimeException r = new MyRuntimeException();
        
        throw r;
    }
    
    private static void m2() throws MyCheckedException {
        MyCheckedException r = new MyCheckedException();
        
        throw r;
    }
}