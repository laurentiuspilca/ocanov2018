public class Exemplu8 {

    public static void main(String [] args) {
        int [][] x1 = {{2,5,6}, null, {}};
        
        System.out.println(x1[0][0]); // 2
        //System.out.println(x1[1][0]); NullPointerException
        //System.out.println(x1[2][0]); ArrayIndexOutOfBoundsException
        
        int [][] x2 = {null, new int[]{4,5}, {1,2,3}};
        
        int [][] x3 = new int[3][];
        x3[0] = new int[4];
        x3[1] = x3[0];
        x3[2] = x3[0];
        
        x3[0][1] = 10;
        x3[1][1] = 20;
        
        System.out.println(x3[0][1]); // 10 ????
    }
}