package src.Veiculos;

public class Moto extends Veiculo{
    private String tipoDeGuidon;

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de guidon: "+tipoDeGuidon);
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public int getAno() {
        return super.getAno();
    }

    @Override
    public void setAno(int ano) {
        super.setAno(ano);
    }

    public String getTipoDeGuidon() {
        return tipoDeGuidon;
    }

    public void setTipoDeGuidon(String tipoDeGuidon) {
        this.tipoDeGuidon = tipoDeGuidon;
    }
}
