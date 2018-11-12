public class Exemplu4 {

    public static void main(String [] args) {
        int i = 1;
        
        while(true) {
            System.out.println(i);
            i = i + 1;
            if (i == 10) {
                break;
            }
        }
        
        System.out.println(":)");
    }
}