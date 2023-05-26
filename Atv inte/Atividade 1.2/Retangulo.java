public class Retangulo implements Geometrica{

    private double base;
    private double altura;    
    public Retangulo(double base,double altura) {
        this.base = base;
        this.altura = altura;
     }
    public double calculaPerimetro() {
        return (base*2)+(altura*2); 
    }
    public double calculaArea() {
        return (base*altura); 
    }

}
