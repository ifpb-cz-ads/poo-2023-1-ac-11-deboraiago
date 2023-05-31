public class Quadrado implements Geometrica{
    private double lado;
    public Quadrado(double lado) {
        this.lado = lado;
     }
     
     public double calculaArea() {
        return (lado*lado); 
    }

    public double calculaPerimetro() {
        return (lado*4); 
    }
   
}