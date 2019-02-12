public class Exemplu6 {

    public static void main(String [] args) {
        try (MyResource r1 = new MyResource("R1");
             MyResource r2 = new MyResource("R2")) {
            // .....
        } catch (Exception e) {
            
        } finally {
            System.out.println("Hello");
        }
        
    }
}

class MyResource implements AutoCloseable {
    
    private String name;
    
    public MyResource(String name) {
        this.name = name;
    }
    
    @Override
    public void close() {
        System.out.println("Closing... " + name);
    }
}