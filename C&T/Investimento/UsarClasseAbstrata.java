public class UsarClasseAbstrata {
    public static void main(String[] args) {
        ContaEspecial c1 = new ContaEspecial(123, "iris", 500.0, 200.0);
        Conta c2 = new ContaPoupanca(12345, "iara", 250.00);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
