public class Teste {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(8, 9);
        Circulo circulo = new Circulo(5.5);
        Quadrado quadrado = new Quadrado(10);

        System.out.println("perimentro do circulo: " + circulo.calculaPerimetro());
        System.out.println( "Area circulo: " + circulo.calculaArea());
        System.out.println("Perimentro restagulo: " + retangulo.calculaPerimetro());
        System.out.println("Area do retangulo" + retangulo.calculaArea());
        System.out.println( "perimentro do Quadarado: " + quadrado.calculaPerimetro());
        System.out.println("Area do Quadarado: " + quadrado.calculaArea());
    }
}
