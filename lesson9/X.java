import java.io.*;

public class X {

    public void m() throws BException {
    }
    
    public void q() throws IOException {
    }
    
    public static void main(String [] args) {
        try {
            throw new AException();
        } catch (BException e) {
            
        } catch (AException e) {
            
        }
    }
}