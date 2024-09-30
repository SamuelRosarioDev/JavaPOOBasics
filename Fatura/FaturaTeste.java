package src.Fatura;

public class FaturaTeste {

    public static void main(String[] args) {
        Fatura fatura = new Fatura();

        fatura.setCodigoProduto("#01");
        fatura.setDescricaoProduto("Whey Protein");
        fatura.setQuantidadeComprada(5);
        fatura.setPrecoPorItem(124);



        System.out.println("Codigo: " + fatura.getCodigoProduto());
        System.out.println("Descrição: " + fatura.getDescricaoProduto());

        System.out.println("Quantidade: " + fatura.getQuantidadeComprada());
        System.out.println("Preço por unidade: R$" + fatura.getPrecoPorItem());
        System.out.println("Fatura Total: " + fatura.getTotalFatura());

    }

}
