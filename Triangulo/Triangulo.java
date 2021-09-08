package Triangulo;


public class Triangulo {
    
 // atributos de instancia
    private double base;
    private double altura,ladoA,ladoB,ladoC,anguloA,anguloB;
    
    // constructor por defecto
    public Triangulo(){
        this.ladoA=10;
        this.ladoB=10;
        this.ladoC=5;
        this.base = ladoC;
        this.altura=10;
        this.anguloA=14;
        this.anguloB=10;
    }
    
    // metodos getter
    public double getBase(){
        return this.base;
    }   
    
    public double getAltura(){
        return this.altura;
    }
    public double getladoA(){
        return this.ladoA;
    }
    public double getladoB(){
        return this.ladoB;
    }
    public double getladoC(){
        return this.ladoC;
    }
    
    public double getanguloA(){
        return this.anguloA;
    }
    public double getanguloB(){
        return this.anguloB;
    }
    //metodos setters
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public void setladoA(double lA){
        this.ladoA = lA;
    }
    
    public void setladoB(double lB){
        this.ladoB = lB;
    }
    public void setladoC(double lC){
        this.ladoC = lC;
    }
    
    public void setanguloA(double aA){
        this.ladoC = aA;
    }
    
    public void setanguloB(double aB){
        this.ladoC = aB;
    }
    
    
    // metodos miembros
    
    public double calcularArea(){
        return (this.ladoB*Math.sqrt(Math.pow(this.ladoA, 2)*(this.ladoB/4))/2);
    }
    
    public double calcularPerimetro(){
        return 2 * this.ladoA + this.ladoB;
    }
    public double longitud_lados_iguales(){
        return this.ladoA + this.ladoB;
    
    }
    
    public double Angulo_vertice(){
        return this.anguloA + this.anguloB;
    
    }
}