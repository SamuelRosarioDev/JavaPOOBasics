package src.Funcionarios;

public class Gerente extends Funcionario{
    private double bonus;

    @Override
    public double calcularSalario(){
        double resultadoComBonus = ((super.calcularSalario() / 100) * bonus) + super.calcularSalario();
        return resultadoComBonus;
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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
