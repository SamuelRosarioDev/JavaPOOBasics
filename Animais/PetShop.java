package src.Animais;

public class PetShop {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();

        cachorro1.setNome("pug");
        cachorro1.setIdade(12);

        System.out.println("Nome: " + cachorro1.getNome());
        System.out.println("Idade: " + cachorro1.getIdade());
        System.out.println("Som do animal: " + cachorro1.emitirSom());

        System.out.println("==============================================================");

        Gato gato1 = new Gato();

        gato1.setNome("Gafield");
        gato1.setIdade(16);

        System.out.println("Nome: " + gato1.getNome());
        System.out.println("Idade: " + gato1.getIdade());
        System.out.println("Som do animal: " + gato1.emitirSom());

    }
}
