public class Exemplu7 {
    
    public static void main(String [] args) {
        try (MyDumbResource r = new MyDumbResource()) {
            //....
            throw new RuntimeException("Try exception");
        } catch (RuntimeException e) {
            System.out.println(e);
            Throwable [] t = e.getSuppressed();
            for (Throwable x : t) {
                System.out.println(x);
            }
        } finally {
            System.out.println("The end");
        }
    }
}

class MyDumbResource implements AutoCloseable {
    
    public void close() {
        System.out.println("Closing...");
        throw new RuntimeException("Closing exception");
    }
}