public class Pessoa {

    public String nome;
    public int idade;
    protected String sexo;

    public Pessoa(String nome, String sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
