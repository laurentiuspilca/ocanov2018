public class Exemplu7 {

    public static void main(String [] args) {
        /*
         * x++      x = x + 1       x+=1
         * ++x
         * 
         * x--      x = x - 1       x-=1
         * --x
         */
        
        int x = 10;
        
        x = ++x;
        
        System.out.println(x);
    }
}