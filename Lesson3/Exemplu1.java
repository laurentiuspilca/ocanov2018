public class Exemplu1 {

    public static void main(String [] args) {
        int i = 1, j = 1;
        A:
        while(true) {
            i++;
            B: while (true) {
                j++;
                if (j >= 5) break B;
            }
            if (i == 5) break;
        }
        
        System.out.println(i);
    }
}