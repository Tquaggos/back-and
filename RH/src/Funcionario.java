public abstract class Funcionario {

    private String nome;
    private double salario;
    private String rg;

    public void trabalhar(){

    }

    public Funcionario(){

    }

    public Funcionario(String nome, double salario, String RG) {
        this.nome = nome;
        this.salario = salario;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double calcularSalario(double valor);


    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRG() {
        return rg;
    }

    public void setRG(String RG) {
        this.rg = RG;
    }
}
