//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Conta PJ = new ContaPJ();
    Conta CC = new ContaCorrente();
    Conta CP = new ContaPoupanca();


    PJ.setSaldo(150);
    CC.setSaldo(3000);
    CP.setSaldo(5000);

    PJ.calcularTarifaMensal();
    PJ.sacar(200);
    PJ.exibirSaldo();
    //IO.println("\n");

    CC.calcularTarifaMensal();
    CC.sacar(1000);
    CC.exibirSaldo();

    CP.calcularTarifaMensal();
    CP.sacar(150);
    CP.exibirSaldo();
}
