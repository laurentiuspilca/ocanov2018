public class Exemplu4 {

    public static void main(String [] args) {
        //m({1,2,3,4,5}); not ok
        
        int [] x1 = {1,2,3,4,5};
        m(x1); // 5
        
        m(new int[]{1,2,3,4,5}); // 5
        
        m(new int[5]); // 5
        
        String [] q1 = new String[10]; // 10
    }
    
    static void m(int [] x) {
        System.out.println(x.length);
    }
}