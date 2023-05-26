public class ContaEspecial extends Conta {

    private double limite;
   

    public ContaEspecial(Integer numero, String nome, Double saldo, double limite) {
        super(numero, nome, saldo);
        this.limite = limite;
    }

    public boolean sacar (double valor){
        if (valor <= this.limite + this.saldo){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }


    public ContaEspecial(Integer numero, String nome, double limite) {
        super(numero, nome);
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaEspecial [  numero:" + getNumero() + " nome: " + getNome() + " saldo: "  + getSaldo() +  " limite: " + limite + " ]";
    }

    
    
}
