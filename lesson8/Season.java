public enum Season {
    SPRING {
        int getTemperature() {return 1;}
    }, SUMMER{
        int getTemperature() {return 1;}
    }, FALL{
        int getTemperature() {return 1;}
    }, WINTER{
        int getTemperature() {return 1;}
        
        boolean isSunny() { return false; }
    };
    
    abstract int getTemperature();
    
    boolean isSunny() {
        return true;
    }
}