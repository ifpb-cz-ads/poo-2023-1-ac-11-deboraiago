public class Bicicleta implements PegadaDeCarbono {
    private double kmAno;
    private final int caloriaPorKM = 34;

    public Bicicleta (double km){
        kmAno = km;
    }

    public double getKmAno() {
        return kmAno;
    }

    public void setKmAno(double kmAno) {
        this.kmAno = kmAno;
    }

    public int getCaloriaPorKM() {
        return caloriaPorKM;
    }

    @Override
    public String toString() {
        return "Bicicleta [kmAno=" + getKmAno() + "]";
    }

    public double getPegaDeCarbono() {
        return kmAno * caloriaPorKM;

    }

    
    
}
