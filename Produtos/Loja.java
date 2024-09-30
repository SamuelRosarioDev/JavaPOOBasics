package src.Produtos;

public class Loja {
    public static void main(String[] args) {
        Alimento alimento1 = new Alimento();
        alimento1.setNome("Banana");
        alimento1.setPreco(6);
        alimento1.setDataDeValidade("10/10/2024");

        System.out.println("Nome: " + alimento1.getNome());
        System.out.println("Preço: R$" + alimento1.getPreco());
        System.out.println("Validade: " + alimento1.getDataDeValidade());

        System.out.println("===========================================================");

        Eletronico eletronico1 = new Eletronico();
        eletronico1.setNome("Monitor");
        eletronico1.setPreco(230);
        eletronico1.setGarantia(3);

        System.out.println("Nome: " + eletronico1.getNome());
        System.out.println("Preço: R$" + eletronico1.getPreco());
        System.out.println("Garantia: " + eletronico1.getGarantia() + " anos");
    }
}
