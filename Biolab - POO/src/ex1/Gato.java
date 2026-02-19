package ex1;

public class Gato {
    public String nome;
    public int idade;
    public String raca;
    public String sexo;
    public String cor;

    public Gato(String nome, int idade, String raca, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.sexo = sexo;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", raca='" + raca + '\'' +
                ", sexo='" + sexo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
