public class ContaPJ extends Conta {

    public ContaPJ(String agencia, String numero, String titular, double saldo) {
        super(agencia, numero, titular, saldo);
    }

    public ContaPJ() {
    }

    @Override
    public void calcularTarifaMensal() {
        setSaldo(getSaldo() - 20);
        IO.println("seu saldo após a tarifa mensal é: " + exibirSaldo());

    }

    @Override
    public double sacar(double valor) {
        IO.println("\nvocê teve uma taxa adicional de saque no valor de: R$1,50");
        return super.sacar(valor + 1.5) ;
    }
}