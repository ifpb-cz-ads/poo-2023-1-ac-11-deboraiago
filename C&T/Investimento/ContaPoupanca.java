public class ContaPoupanca extends Conta implements Investimento{

    public ContaPoupanca (Integer numero, String nome, Double saldo){
        super(numero, nome, saldo);
    }

   public boolean sacar (double valor){
    if (this.getSaldo() >= valor){
        this.saldo -= valor;
        return true;
    }else {
        return false;
    }
   } 


   public void reajustar(double rejuste){
    this.saldo += rejuste;
   }

@Override
public String toString() {
    return "ContaPoupanca[ numero: "  + getNumero() + " nome: " + getNome() + " saldo: "  + getSaldo() + " ]";
}

   

}
