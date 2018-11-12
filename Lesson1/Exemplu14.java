// 12344321  12321  85658

public class Exemplu14 {

    public static void main(String [] args) {
        int n = 12321;
        
        int x = n;
        int reversed = 0;
        
        while (n > 0) {
            int d = n % 10; // 1
            n /= 10; // 1232
            
            reversed = reversed * 10 + d; // 0 + 1
        }
        
        System.out.println(reversed == x);
    }
}