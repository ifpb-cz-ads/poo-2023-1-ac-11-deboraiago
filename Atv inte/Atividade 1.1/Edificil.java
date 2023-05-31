public class Edificil implements PegadaDeCarbono {
    private double mediaMesKwh;
    private final int meses = 12;
   
    public Edificil(double mediaMesKwh) {
        this.mediaMesKwh = mediaMesKwh;
    }

    public double getMediaMesKwh() {
        return mediaMesKwh;
    }

    public void setMediaMesKwh(double mediaMesKwh) {
        this.mediaMesKwh = mediaMesKwh;
    }

    public int getMeses() {
        return meses;
    }

    @Override
    public String toString() {
        return "Edificil [mediaMesKwh=" + mediaMesKwh + "]";
    }

    public double getPegaDeCarbono(){
        return getMediaMesKwh() * meses;
    }
    

    
}
