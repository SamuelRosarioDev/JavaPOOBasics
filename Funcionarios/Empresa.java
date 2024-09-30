package src.Funcionarios;

public class Empresa {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        gerente1.setNome("Samuel");
        gerente1.setSalarioBase(4600);
        gerente1.setBonus(25);
        System.out.println("Nome: " + gerente1.getNome());
        System.out.println("Salario base: " + gerente1.getSalarioBase());
        System.out.println("Salario calculado: " + gerente1.calcularSalario());

        System.out.println("=============================================================");

        Assistente assistente1 =  new Assistente();
        assistente1.setNome("Willis");
        assistente1.setSalarioBase(3500);
        System.out.println("Nome: " + assistente1.getNome());
        System.out.println("Salario base: " + assistente1.getSalarioBase());
        System.out.println("Salario calculado: " + assistente1.calcularSalario());

    }
}
