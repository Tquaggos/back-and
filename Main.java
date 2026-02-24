

public class Main{
    static void main(){
        Funcionario funcionario = new Funcionario();

        funcionario.nome = ("Arthur");
        IO.println(funcionario.getNome());

        funcionario.setSalario(850);
        IO.println(funcionario.getSalario());

        funcionario.setCargo("TI");
        IO.println(funcionario.getCargo());
    }
}


