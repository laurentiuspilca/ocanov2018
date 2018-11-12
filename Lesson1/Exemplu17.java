public class Exemplu17 {

    public static void main(String [] args) {
        int x = 10;
        int y = 4;
        
        int z = 5 + ++x -y-- + ++y;
        
        System.out.println(z);
    }
}