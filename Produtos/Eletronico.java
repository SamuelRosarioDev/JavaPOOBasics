package src.Produtos;

public class Eletronico extends Produto{
    private int garantia;

    @Override
    public double calcularPrecoComDesconto(){
        int desconto = 10;
        double resultadoDoCalculoComDesconto = ((calcularPrecoComDesconto() / 100) * desconto) + calcularPrecoComDesconto();
        return resultadoDoCalculoComDesconto;
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

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
}
