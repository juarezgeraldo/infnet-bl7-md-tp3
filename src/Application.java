import java.io.IOException;
import java.util.Scanner;

import fila.FilaCircular;
import pilha.Pilha;

public class Application {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner in = new Scanner(System.in);

        String opcao = null;
        do {
            limpaTela();
            System.out.println("Menu principal");
            System.out.println("==============");
            System.out.println("[F] Fila");
            System.out.println("[P] Pilha");
            System.out.println("[S] Sair da aplicação");
            System.out.println("");
            System.out.print("Informe a opcao desejada: ");
            opcao = in.next();


            switch (opcao) {
                case "F":
                    fila();
                    break;
                case "P":
                    pilha();
                    break;
                default:
                    System.out.println("Opcao invalida!!!");
                    break;
            }
        } while (!opcao.equals("S"));

        in.close();
    }

    private static void fila() {

        FilaCircular filaCircular = new FilaCircular();

        limpaTela();
        Scanner in = new Scanner(System.in);
        String opcao = null;
        do {
            System.out.println("Menu FILA");
            System.out.println("=========");
            System.out.println("[E] Enqueue");
            System.out.println("[D] Dequeue");
            System.out.println("[M] Mostrar fila");
            System.out.println("[T] Tamanho fila");
            System.out.println("[S] Sair");

            System.out.print("Informe a opcao desejada: ");
            opcao = in.next();

            switch (opcao) {
                case "E":
                    int enqueue;
                    do {
                        limpaTela();
                        System.out.println("Informe o próximo número inteiro positivo a inserir na fila:");
                        try {
                            enqueue = in.nextInt();
                            if (enqueue < 0) {
                                System.out.println("É necessário inserir um número inteiro positivo");
                            } else {
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println("É necessário inserir um número inteiro positivo");
                        }
                    } while (true);

                    filaCircular.adicionarFila(enqueue);

                    System.out.println("'Enqueue' realizado com sucesso");
                    System.out.println(filaCircular.toString());
                    break;
                case "D":
                    if (filaCircular.removerFila() < 0) {
                        System.out.println("Fila está vazia.");
                    } else {
                        System.out.println("'Dequeue' realizado com sucesso");
                    }
                    System.out.println(filaCircular.toString());
                    break;
                case "M":
                    System.out.println(filaCircular.toString());
                    break;
                case "T":
                    System.out.println("O tamanho da fila é de: " + filaCircular.tamanhoFila() + " elemento(s)");
                    break;
                case "S":
                    System.out.println("Finalizou!!!");
                    break;
                default:
                    System.out.println("Opcao invalida!!!");
                    break;
            }

        } while (!opcao.equals("S"));

    }

    private static void pilha(){

        Pilha pilha = new Pilha();

        limpaTela();
        Scanner in = new Scanner(System.in);
        String opcao = null;
        do {
            System.out.println("Menu PILHA");
            System.out.println("==========");
            System.out.println("[I] Inserir");
            System.out.println("[R] Remover");
            System.out.println("[T] retornar o elemento do Topo");
            System.out.println("[P] tamanho Pilha");
            System.out.println("[S] Sair");

            System.out.print("Informe a opcao desejada: ");
            opcao = in.next();

            switch (opcao) {
                case "I":
                    int empilhar;
                    do {
                        limpaTela();
                        System.out.println("Informe o próximo número inteiro positivo a inserir na pilha:");
                        try {
                            empilhar = in.nextInt();
                            if (empilhar < 0) {
                                System.out.println("É necessário inserir um número inteiro positivo");
                            } else {
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println("É necessário inserir um número inteiro positivo");
                        }
                    } while (true);

                    pilha.empilhar(empilhar);

                    System.out.println("'push' realizado com sucesso");
                    System.out.println(pilha.toString());
                    break;
                case "R":
                    pilha.desempilhar();
                    System.out.println("'pop' realizado com sucesso");
                    System.out.println(pilha.toString());
                    break;
                case "T":
                    System.out.println("O elemento do topo é: " + pilha.exibeUltimoValor());
                    break;
                case "P":
                    System.out.println("O tamanho da fila é de: " + pilha.tamanho() + " elemento(s)");
                    break;
                case "S":
                    break;
                default:
                    System.out.println("Opcao invalida!!!");
                    break;
            }

        } while (!opcao.equals("S"));

    }

    private static void limpaTela(){
        for (int i = 0; i < 50; i++) System.out.println ("\n");
    }
}
