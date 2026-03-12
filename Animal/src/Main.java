public class Main {

    static void main() {

        Vaca vaca = new Vaca();
        vaca.fazerSom();

        vaca.setCor("Preta");
        vaca.setPeso(50);
        vaca.setNome("Mimosa");

        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();

        cachorro.setCor("Caramelo");
        cachorro.setPeso(4);
        cachorro.setNome("Thor");

        Gato gato = new Gato();
        gato.fazerSom();

        gato.setCor("Preto");
        gato.setPeso(2);
        gato.setNome("Pelézinho");
    }
}

