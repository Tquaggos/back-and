//package aula3;
//
//public class ifElse {
//    static void main() {
//
//        int idade = 18;
//
//        if(idade < 18){
//            IO.println("Foi barrado na porta");
//        }else{
//            IO.println("Liberado");
//        }
//
//
//
//
//    }
//}
static void main() {
  Scanner media =new Scanner(System.in);
    IO.println("Digite sua nota");
    double nota1 = media.nextDouble();

    IO.println("Digite sua nota");
    double nota2 = media.nextDouble();

    IO.println("Digite sua nota");
    double nota3 = media.nextDouble();

    double mediaGeral = (nota1 + nota2 + nota3) /3;

    if (mediaGeral < 4) {
        IO.println("Reprovado" + mediaGeral);
    } else if (mediaGeral <= 6) {
        IO.println("Recuperação" + mediaGeral);
    }else
        IO.println("Aprovado" + mediaGeral);
    }
