package Triangulo;

public class TestTriangulo {
    
    public static void main(String[] args) {
        
        Triangulo a = new Triangulo();
        a.setAltura(20);
        a.setBase(10);
        a.setladoA(10);
        a.setladoB(10);
        a.setladoC(5);
        a.setBase(5);
        a.setAltura(10);
        a.setanguloA(14);
        a.setanguloB(10);
        imprimirInfoTriangulo(a);
        
        
    }
    
    public static void imprimirInfoTriangulo(Triangulo r){
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Longitud lados iguales: "+ r.longitud_lados_iguales());
        System.out.println("Perimetro: " + r.calcularPerimetro());
        System.out.println("Angulo vertice: " + r.Angulo_vertice());
        System.out.println("-----------------------------------");
    }
}
