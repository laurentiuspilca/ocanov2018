public class Exemplu4 {

    public static void main(String [] args) {
        
        Season s1 = Season.SPRING;
        
        int o = Season.SPRING.ordinal();
        String name = Season.SPRING.name();
        String toString = Season.SPRING.toString();
        
        
        System.out.println(o);
        System.out.println(name);
        System.out.println(toString);
        
        for (Season x : Season.values()) {
            System.out.println(x);
        }
    }
}