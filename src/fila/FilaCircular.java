package fila;

public class FilaCircular {
    public FilaCircular proximo;
    public int dado;
    public FilaCircular inicio = null;
    public FilaCircular fim = null;

    public FilaCircular(){}

    public FilaCircular(int dado) {
        this.proximo = null;
        this.dado = dado;
    }

    public boolean vazia() {
        return inicio == null && fim == null;
    }

    public void adicionarFila(int dado) {
        FilaCircular novo = new FilaCircular(dado);

        if (vazia()) {
            inicio = novo;
            fim = novo;
            fim.proximo = inicio;
        } else {
            novo.proximo = inicio;
            fim.proximo = novo;
            fim = novo;
        }
    }
    public int removerFila() {
        int removido;

        if (vazia()) {
            removido = -1;
        } else if (inicio == fim) {
            removido = inicio.dado;
            inicio = null;
            fim = null;
        } else {
            removido = inicio.dado;
            inicio = inicio.proximo;
            fim.proximo = inicio;
        }

        return removido;
    }
    public int tamanhoFila(){
        int tamanho = 0;
        if (!vazia()){
            FilaCircular aux = inicio;
            if (aux == fim.proximo) {
                aux = aux.proximo;
                tamanho++;
            }
            while (aux != fim.proximo) {
                aux = aux.proximo;
                tamanho++;
            }
        }
        return tamanho;
    }

    public String toString() {
        String listados = "Numeros" + "\n";
        int numero = 1;

        if (vazia()) {
            return listados = "Não foi possivel encontrar valores cadastrados";
        } else if (inicio == fim) {
            listados = listados + numero + " - " + inicio.dado;
        } else {
            FilaCircular aux = inicio;
            if (aux == fim.proximo) {
                listados = listados + numero + " - " +aux.dado+"\n";
                aux = aux.proximo;
                numero++;
            }
            while (aux != fim.proximo) {
                listados = listados + numero + " - " + aux.dado+"\n";
                aux = aux.proximo;
                numero++;
            }
        }

        return listados;
    }

}
