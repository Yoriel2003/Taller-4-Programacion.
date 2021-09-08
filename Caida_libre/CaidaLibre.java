package CaidaLibre;

public class CaidaLibre {
    
    private int VelocidadInicial;
    private double Gravedad;
    private int tiempo;
    
    // constructor por defecto
    public CaidaLibre(){
      
    }
    
    // constructor sobrecragado 1

    public int getVelocidadInicial() {
        return VelocidadInicial;
    }

    public Double getGravedad() {
        return Gravedad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setVelocidadInicial(int VelocidadInicial) {
        this.VelocidadInicial = VelocidadInicial;
    }

    public void setGravedad(Double Gravedad) {
        this.Gravedad = Gravedad;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public double Calculardistancia(){
        double distancia = 0.5 * Gravedad * Math.pow(tiempo,2);
        return distancia;
    }
  
    public double evaluar(){
        
        double VelocidadFinal = this.VelocidadInicial + Gravedad * tiempo;
        return VelocidadFinal;
    }
}
