public class Carro implements PegadaDeCarbono {

    private double kmAno;
    private double mediaPorLitro;
    private final int kgporKm = 2;
    public Carro(double kmAno, double mediaPorLitro) {
        this.kmAno = kmAno;
        this.mediaPorLitro = mediaPorLitro;
    }
    public double getKmAno() {
        return kmAno;
    }
    public void setKmAno(double kmAno) {
        this.kmAno = kmAno;
    }
    public double getMediaPorLitro() {
        return mediaPorLitro;
    }
    public void setMediaPorLitro(double mediaPorLitro) {
        this.mediaPorLitro = mediaPorLitro;
    }
    @Override
    public String toString() {
        return "Carro [kmAno=" + kmAno + ", mediaPorLitro=" + mediaPorLitro + "]";
    }

    public double getPegaDeCarbono(){
        return ((getKmAno() * getMediaPorLitro()) * kgporKm);
    }

    
    
    
    

}
