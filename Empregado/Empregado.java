package src.Empregado;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    private double salarioAnual;

    public Empregado(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public double aumentoEmPorcentagem(){
        int porcentagem = 10;
        double rusltadoDaPorcentagem = ((getSalarioAnual() / 100) * porcentagem) + getSalarioAnual();

        return rusltadoDaPorcentagem;
    }

    public String getNome() { return  nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getSobrenome() {return sobrenome;}
    public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}

    public double getSalarioMensal() {return salarioMensal;}
    public void setSalarioMensal(double salarioMensal) {this.salarioMensal = salarioMensal;}

    public double getSalarioAnual() {
        salarioAnual = salarioMensal * 12;
        return salarioAnual;
    }
    public void setSalarioAnual(double salarioAnual) {this.salarioAnual = salarioAnual;}
}
