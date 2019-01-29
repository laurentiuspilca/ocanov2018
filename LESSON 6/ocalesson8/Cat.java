public class Cat {

    String name;
    int age;
    
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return name + " " + age;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        
        if (o instanceof Cat) {
            Cat p = (Cat) o;
            return this.age == p.age;
        }
        
        return false;
    }
}