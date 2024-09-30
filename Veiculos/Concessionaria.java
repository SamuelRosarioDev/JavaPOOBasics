package src.Veiculos;

public class Concessionaria {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setMarca("Honda");
        carro1.setModelo("Civic");
        carro1.setAno(1999);
        carro1.setNumeroDePortas(4);

        carro1.exibirDetalhes();

        System.out.println("=================================================================");

        Moto moto1 = new Moto();
        moto1.setMarca("Yamaha");
        moto1.setModelo("PW50");
        moto1.setAno(2001);
        moto1.setTipoDeGuidon("Xadrez");

        moto1.exibirDetalhes();
    }
}
