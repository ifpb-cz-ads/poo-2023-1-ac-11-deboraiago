public class Circulo implements Geometrica{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
     }

    public double calculaArea() {
        return (raio*raio)*3.14; 
    }


    public double calculaPerimetro() {
        return raio*3.14*2; 
    }
    
}