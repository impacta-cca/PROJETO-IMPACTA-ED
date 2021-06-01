package tad_fila_array;

import interfaces.Interface;
import tad_fila_array.classes.ArrayQueue;
import tad_fila_array.exception.EmptyQueueException;

import java.util.Scanner;

import static interfaces.Interface.titulo2;

public class Interface_fila_array {
    Interface opcoes = new Interface();

    public void fila(){
        // Exibe título
        titulo2("███████ ██ ██       █████       ██  █████  ██████  ██████   █████  ██    ██ ██  \n" +
                "██      ██ ██      ██   ██     ██  ██   ██ ██   ██ ██   ██ ██   ██  ██  ██   ██ \n" +
                "█████   ██ ██      ███████     ██  ███████ ██████  ██████  ███████   ████    ██ \n" +
                "██      ██ ██      ██   ██     ██  ██   ██ ██   ██ ██   ██ ██   ██    ██     ██ \n" +
                "██      ██ ███████ ██   ██      ██ ██   ██ ██   ██ ██   ██ ██   ██    ██    ██  ");

        // Pede tamanho da fila para iniciar
        System.out.println("Digite o tamanho da fila: ");
        Scanner entrada1 = new Scanner(System.in);
        int tamanho = entrada1.nextInt();
        ArrayQueue<Integer> fila = new ArrayQueue<Integer>(tamanho);

        String[] funcionalidadesArranjo = {
                "Sair",
                "Inserir",
                "Remover",
                "Imprimir fila",
        };

        // Exibe informações da estrutura
        System.out.println("Apresentação:\n" +
                           "A fila é um tipo abstrato de dados em que define-se uma coleção de elementos em sequência, como o\n" +
                           "nome sugere, porém seu acesso, assim como inserção e remoção de objetos é dada de forma restrita.");
        System.out.println();

        System.out.println("Como funciona ?\n" +
                           "As inserções e remoções dos elementos se dão de acordo com o princípio de FIFO (“first-in,\n" +
                           "first-out”, em português “primeiro a entrar, primeiro a sair”), ou seja, toda inserção é feita no\n" +
                           "fim da fila e toda remoção, pelo começo. Seu acesso, assim como a retirada, restringe-se ao início\n" +
                           "da sequência. ");
        System.out.println();

        System.out.println("O que ela pode fazer ?\n" +
                "Este tipo abstrato de dado permite: adicionar novos valores ao fim da fila e removê-los ou\n" +
                "acessá-los através do começo da sequência. Também é possível consultar seu tamanho ou saber se a\n" +
                "fila está vazia.");

        System.out.println("Como faz cada função ?\n" +
                "- enqueue(x): faz a inserção do objeto x ao final da fila. \n" +
                "\n" +
                "- dequeue: faz a remoção do primeiro elemento da fila e o retorna. Se a fila estiver vazia,\n" +
                "ocorre erro.\n" +
                "\n" +
                "- size: retorna a quantidade de elementos na sequência.\n" +
                "\n" +
                "- isEmpty: retorna um valor booleano que diz se a fila está vazia (true) ou não (false).\n" +
                "\n" +
                "- front: verifica qual elemento está no começo da fila e o retorna. Assim como o dequeue, gera \n" +
                "erro caso a lista esteja vazia.\n");

        boolean alternador = true;
        while (alternador) {
            Scanner entrada = new Scanner(System.in);
            int op = opcoes.menu(funcionalidadesArranjo);
            int indice = 0;
            int inserir = 0;
            switch (op) {
                case 0: // Sair
                    alternador = false;
                    break;
                case 1: // Inserir
                    System.out.println("enqueue():\n" +
                                       "faz a inserção do objeto x ao final da fila.\n");
                    System.out.println("Digite o numero que será inserido");
                    inserir = entrada.nextInt();
                    fila.enqueue(inserir);
                    // chama o metodo enqueue para enfileirar dentro da fila
                    break;
                case 2: //remover
                    System.out.println("dequeue():\n" +
                                       "faz a remoção do primeiro elemento da fila e o retorna. Se a fila estiver vazia, ocorre erro.");
                    System.out.println();
                    try {
                        System.out.println("o número que foi removido da fila é o " + fila.dequeue());
                        System.out.println();
                    }catch (EmptyQueueException e){
                        System.out.println("ERRO: Não é possivel remover, fila está vazia.");
                        System.out.println();
                    }
                   //chama o metodo dequeue para retirar o primeiro numero da fila
                    break;
                case 3: //imprimir
                    System.out.println(fila.toString());
                    // chamar metodo para imprimir importado do TAD
                    break;
            }
        }

    }
}
