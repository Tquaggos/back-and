public abstract class Conta {
    private String agencia;
    private String numero;
    private String titular;
    private double saldo;

    public Conta(String agencia, String numero, String titular, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(){

    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        IO.println("seu saldo atual é: " + saldo);
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double deposito){
        return deposito += saldo = saldo;
    }
    public double sacar(double valor){
        if (saldo < valor){
            IO.println("saldo insuficiente!");
            return saldo;
        }
        else {
            IO.println("\nseu saldo após o saque é: " + (saldo - valor));
            return saldo -= valor;
        }
    }
    public double exibirSaldo(){
        return saldo;
    }

    public abstract void calcularTarifaMensal();
}
