public abstract class  Conta {
    private Integer numero;
    private String nome;
    protected Double saldo;
    public Conta(Integer numero, String nome, Double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    public Conta(Integer numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        saldo = 0.0;
    }

    public abstract boolean sacar(double sacar);
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    

    
}
