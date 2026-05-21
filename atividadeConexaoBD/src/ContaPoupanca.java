public class ContaPoupanca extends Conta {

    public ContaPoupanca(String agencia, String numero, String titular, double saldo) {
        super(agencia, numero, titular, saldo);
    }

    public ContaPoupanca() {
    }

    @Override
    public void calcularTarifaMensal() {
        setSaldo(getSaldo() - 0);
        IO.println("seu saldo após a tarifa mensal é: " + exibirSaldo());

    }
}
