public class Exemplu3 {

    public static void main(String [] args) {
        int i = 0;
        
        while (i < 20) {
            i = i + 1;
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }
}