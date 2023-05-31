import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList< PegadaDeCarbono> categoria = new ArrayList<>();
        categoria.add( new Bicicleta(250.0));
        categoria.add( new Edificil(12000.47));
        categoria.add(new Carro(5000, 17.0));

        for (PegadaDeCarbono imprimi : categoria){
            System.out.println(" Detalhes sobre" + imprimi.getClass() +
            imprimi.toString() + "\n Pegada de carbono: " + imprimi.getPegaDeCarbono());
        }
    }
}
