public class ContaCorrente extends Conta {


    public ContaCorrente(String agencia, String numero, String titular, double saldo) {
        super(agencia, numero, titular, saldo);
    }

    public ContaCorrente() {
    }

    @Override
    public void calcularTarifaMensal() {
        setSaldo(getSaldo() - 12);
        IO.println("\nseu saldo após a tarifa mensal é: " + exibirSaldo());
    }
}