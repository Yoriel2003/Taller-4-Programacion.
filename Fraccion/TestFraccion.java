package Fraccion;

public class TestFraccion {
  static public void main(String[] args) {
     Fraccion x=new Fraccion(2,3);
     Fraccion y=new Fraccion(4,3);
     Fraccion z=new Fraccion(1,2);
     System.out.println("x ----->  "+x);
     System.out.println("y ----->  "+y);
     System.out.println("z------>  "+z);
     System.out.println("Suma ---------->  "+Fraccion.sumar(x, y));
     System.out.println("Resta --------->  "+Fraccion.restar(x, y));
     System.out.println("Multiplicacion->  "+Fraccion.multiplicar(x,y));
     System.out.println("Divicion ------>  "+Fraccion.dividir(x, y));
//primero suma x e y y luego hace el producto con z
    Fraccion resultado=Fraccion.multiplicar(Fraccion.sumar(x,y),z);
    System.out.println("(x+y)*z--------> "+resultado);
    System.out.println("Simplificado---> "+resultado.simplificar());

     try  {
//espera la pulsación de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}
