public class Exemplu5 {

    public static void main(String [] args) {
        int [][] x = new int[5][];
        
        x[0] = new int[3]; // [I@f321a
        
        x[0][0] = 10;
        x[0][1] = 5;
        
        x[1] = new int[5];
        
        x[1][0] = 9;
        x[1][1] = 6;
        x[1][2] = 3;
        //for (int [] a : x) {  //  a[][]  : x[][][]
        //    System.out.println(a);
        //}
        
        // 9 6 3
        for (int q : x[1]) {  // NullPointerException vs ArrayIndexOutOfBoundsException
            System.out.println(q);
        }
    }

}