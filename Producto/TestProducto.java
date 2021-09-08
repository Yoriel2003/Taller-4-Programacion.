package Producto;


public class TestProducto {
    public static void main(String[] args) {
        
        Producto miProducto=new Producto();
        miProducto.setCodigo(5978);
        miProducto.setpCompra(50.00);
        miProducto.setpUtilidad(0.5);
        imprimirInfoProducto(miProducto);
    }
    
    
        public static void imprimirInfoProducto(Producto r){
        System.out.println("Codigo de producto: "+ r.getCodigo());
        System.out.println("Precio de compra: "+ r.getpCompra());
        System.out.println("Precio de utilidad: "+ r.getpUtilidad());
        System.out.println("Precio de venta: "+ r.calcularpVenta());
        System.out.println("-----------------------------------");
    }
    
}
