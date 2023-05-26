public abstract class Quadrilatero implements Geometrica {
        private double ladoA;
        private double ladoB;
        private double ladoC;
        private double ladoD;
    
        public Quadrilatero(double ladoA,double ladoB,double ladoC,double ladoD) {
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.ladoC = ladoC;
            this.ladoD = ladoD;
        }
        public double calculaPerimetro(double lado01) {
            return this.ladoA+this.ladoB+this.ladoC+this.ladoD;
        }
    
}
