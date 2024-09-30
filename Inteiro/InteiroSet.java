package src.Inteiro;

public class InteiroSet {

    private boolean[] set;

    public InteiroSet() {
        set = new boolean[101];
    }

    public InteiroSet union(InteiroSet outroConjunto) {
        InteiroSet uniao = new InteiroSet();
        for (int i = 0; i <= 100; i++) {
            if (this.set[i] || outroConjunto.set[i]) {
                uniao.set[i] = true;
            }
        }
        return uniao;
    }

    public InteiroSet intersecao(InteiroSet outroConjunto) {
        InteiroSet intersecao = new InteiroSet();
        for (int i = 0; i <= 100; i++) {
            if (this.set[i] && outroConjunto.set[i]) {
                intersecao.set[i] = true;
            }
        }
        return intersecao;
    }

    public void adicionar(int valor) {
        if (valor >= 0 && valor <= 100) {
            set[valor] = true;
        } else {
            System.out.println("O valor: "+valor+" está fora do intervalo permitido (0 a 100).");
        }
    }

    public void remover(int valor) {
        if (valor >= 0 && valor <= 100) {
            set[valor] = false;
        } else {
            System.out.println("O valor: "+valor+" está fora do intervalo permitido (0 a 100).");
        }
    }

    public void mostrarConjunto() {
        StringBuilder resultado = new StringBuilder();

        boolean vazio = true;
        for (int i = 0; i <= 100; i++) {
            if (set[i]) {
                resultado.append(i).append(" ");
                vazio = false;
            }
        }
        if (vazio) {
            System.out.println("-");
        } else {
            System.out.println("{ "+resultado.toString().trim() + " }");
        }
    }

    public boolean verificaIgualdade(InteiroSet outroConjunto) {
        for (int i = 0; i <= 100; i++) {
            if (this.set[i] != outroConjunto.set[i]) {
                return false;
            }
        }
        return true;
    }
}
