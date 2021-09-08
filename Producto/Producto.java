package Producto;

public class Producto {
    private int codigo ;
    private double pCompra, pVenta;
    private double pUtilidad;
    
    public Producto(){
    
    
    }

    public Producto(int codigo, double pCompra, int pUtilidad) {
        this.codigo = codigo;
        this.pCompra = pCompra;
        this.pUtilidad = pUtilidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setpCompra(double pCompra) {
        this.pCompra = pCompra;
    }

    public void setpVenta(double pVenta) {
        this.pVenta = pVenta;
    }

    public void setpUtilidad(double pUtilidad) {
        this.pUtilidad = pUtilidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getpCompra() {
        return pCompra;
    }

    public double getpVenta() {
        return pVenta;
    }

    public double getpUtilidad() {
        return pUtilidad;
    }
    
    
    public double calcularpVenta(){
        return  this.pCompra * pUtilidad;
    }
    
    
    
    
}
