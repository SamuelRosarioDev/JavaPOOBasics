package src.Inteiro;

public class InteiroTeste {
    public static void main(String[] args) {
        // Cria conjunto e set valores
        InteiroSet conjuntoA = new InteiroSet();
        conjuntoA.adicionar(10);
        conjuntoA.adicionar(69);
        conjuntoA.adicionar(58);
        System.out.print("ConjuntoA -> ");
        conjuntoA.mostrarConjunto();

        InteiroSet conjuntoB = new InteiroSet();
        conjuntoB.adicionar(10);
        conjuntoB.adicionar(69);
        conjuntoB.adicionar(58);
        System.out.print("ConjuntoB -> ");
        conjuntoB.mostrarConjunto();

        // Remove o valor do conjunto
        conjuntoA.remover(69);

        // União dos conjuntos
        InteiroSet uniao = conjuntoA.union(conjuntoB);
        System.out.print("Conjunto com união -> ");
        uniao.mostrarConjunto();

        // Interseção dos conjuntos
        InteiroSet intersecao = conjuntoA.intersecao(conjuntoB);
        System.out.print("Conjunto com interseção -> ");
        intersecao.mostrarConjunto();

        // Verifica se o conjunto tem os mesmo valores que o outro conjunto
        boolean verificaIgualdade = conjuntoA.verificaIgualdade(conjuntoB);
        System.out.println("Os conjuntos são iguais? -> " +verificaIgualdade);
    }
}
