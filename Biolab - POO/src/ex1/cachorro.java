package ex1;

public class cachorro {

    public String nome;
    public int idade;
    public String raca;
    public String sexo;
    public String cor;

    public cachorro(String nome, int idade, String raca, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.sexo = sexo;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "cachorro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", raca='" + raca + '\'' +
                ", sexo='" + sexo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
