class NumarComplex {

    int a;
    int b;
    
    NumarComplex suma(NumarComplex c) {
        NumarComplex rez = new NumarComplex();
        
        rez.a = this.a + c.a;
        rez.b = this.b + c.b;
        
        return rez;
    }
}