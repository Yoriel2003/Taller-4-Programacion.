package Rectangulo;

public class TestRectangulo {
    
    public static void main(String[] args) {
        
        Rectangulo a = new Rectangulo();
        a.setAltura(20);
        a.setBase(10);
        imprimirInfoRectangulo(a);
        
        Rectangulo b = new Rectangulo();
        imprimirInfoRectangulo(b);
        
    }
    
    public static void imprimirInfoRectangulo(Rectangulo r){
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: "+ r.getAltura());
        System.out.println("Color: " + Rectangulo.COLOR);
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro"+r.calcularPerimetro());
        System.out.println("-----------------------------------");
    }
}
