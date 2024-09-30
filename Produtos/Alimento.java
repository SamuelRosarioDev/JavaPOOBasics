package src.Produtos;

public class Alimento extends Produto{
    private String dataDeValidade;

    @Override
    public double calcularPrecoComDesconto() {
        return 0;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
    @Override
    public double getPreco() {
        return super.getPreco();
    }
    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

}
