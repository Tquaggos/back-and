
import java.time.LocalDate;

public class Funcionario {
    public String nome;
    private String setor;
    private String cargo;
    private LocalDate nasc;
    private double salario;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario - 150;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo(){
        return cargo;
    }

}

