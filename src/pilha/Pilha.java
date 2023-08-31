package pilha;

import fila.FilaCircular;

public class Pilha {

    public Object[] pilha;
    public int posicaoPilha;

    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new Object[1000];
    }

    public boolean pilhaVazia() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public Object exibeUltimoValor() {
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public Object desempilhar() {
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void empilhar(Object valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }
    public String toString() {
        String listados = "Numeros" + "\n";

        if (pilhaVazia()) {
            return listados = "Não foi possivel encontrar valores cadastrados";
        } else {
            for (int i=0; i<tamanho(); i++)
                listados = listados + i + " - " + this.pilha[i] + "\n";
        }

        return listados;
    }

}
