public class Product {

    private String name;
    private boolean expired;
    
    // mutator / setter
    public void setName(String name) {
        this.name = name;
    }
    
    // accessor / getter
    public String getName() {
        return this.name;
    }
    
    public void setExpired(boolean expired) {
        this.expired = expired;
    }
    
    public boolean isExpired() {
        return this.expired;
    }
}

/*
 * private
 * default
 * protected
 * public
 */