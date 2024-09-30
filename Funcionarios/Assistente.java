package src.Funcionarios;

public class Assistente extends Funcionario{

    @Override
    public double calcularSalario(){
        return super.calcularSalario();
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
    public double getSalarioBase() {
        return super.getSalarioBase();
    }

    @Override
    public void setSalarioBase(double salarioBase) {
        super.setSalarioBase(salarioBase);
    }

}
