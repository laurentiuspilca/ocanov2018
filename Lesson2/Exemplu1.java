class Exemplu1 {

    public static void main(String [] args) {
        Masina m1; // int x;
        
        m1 = new Masina(); // instantiere  x = 10;
        
        // int x = 10;
        
        Masina m2 = new Masina();
        
        m1.culoare = "Rosu";
        m2.culoare = "Verde";
        
        System.out.println(m1.culoare);
        System.out.println(m2.culoare);
    }
}