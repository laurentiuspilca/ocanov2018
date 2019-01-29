public enum Coffee {
    SMALL, MEDIUM(10.5), BIG;
    
    double qty;
    
    Coffee() {
    }
    
    Coffee(double qty) {
        this.qty = qty;
    }
    
    public void drink(double q) {
        this.qty -= q;
    }
}

/*
public final class Coffee {
    
    public static final Coffee SMALL = new Coffee();
    public static final Coffee MEDIUM = new Coffee();
    public static final Coffee BIG = new Coffee();
    
    private Coffee() {
    }
}
*/