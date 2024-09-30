package src.Fatura;

public class Fatura {
    private String codigoProduto;
    private String descricaoProduto;
    private int quantidadeComprada;
    private double precoPorItem;
    private double totalFatura;

    public double getTotalFatura() {

        double preco = precoPorItem;
        int quantidade = quantidadeComprada;

        totalFatura = preco * quantidade;

        if (totalFatura <= 0){
            precoPorItem = 0;
            totalFatura = 0;
        }

        return totalFatura;

    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }



    public void setTotalFatura(double totalFatura) {
        this.totalFatura = totalFatura;
    }
}
