package src.Empregado;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Samuel", "Rosário", 3584.25);
        System.out.println("Nome: " + empregado1.getNome());
        System.out.println("Sobrenome: " + empregado1.getSobrenome());
        System.out.println("Salario Mensal: " + empregado1.getSalarioMensal());
        System.out.println("Salario Anual: " + empregado1.getSalarioAnual());
        System.out.println("Salario Anual + 10%: " + empregado1.aumentoEmPorcentagem());

        System.out.println("================================================================================");

        Empregado empregado2 = new Empregado("Eduardo", "Gonçalves", 2594.25);
        System.out.println("Nome: " + empregado2.getNome());
        System.out.println("Sobrenome: " + empregado2.getSobrenome());
        System.out.println("Salario Mensal: " + empregado2.getSalarioMensal());
        System.out.println("Salario Anual: " + empregado2.getSalarioAnual());
        System.out.println("Salario Anual + 10%: " + empregado2.aumentoEmPorcentagem());
    }


}
