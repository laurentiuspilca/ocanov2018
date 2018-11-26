class Pisica {

    String nume;
    String culoare;
    
    Pisica(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }
    
    void spuneMiau() {
        System.out.println("Miau! Numele meu este " + this.nume);
    }
}