package tad_pilha_LSE;

import interfaces.Interface;
import tad_pilha_LSE.classes.NodeStack;
import tad_pilha_LSE.exception.EmptyStackException;

import java.util.Scanner;

import static interfaces.Interface.titulo2;

public class Interface_pilha_LSE {
    Interface opcoes = new Interface();

    public void pilha() {
        NodeStack<Integer> pilha = new NodeStack<Integer>();
        String[] funcionalidadesArranjo = {
                "Sair",
                "Inserir",
                "Remover",
                "Imprimir",
                "consultar número no topo da pilha"
        };

        // Exibe título
        titulo2("██████  ██ ██      ██   ██  █████       ██ ██      ███████ ███████ ██  \n" +
                "██   ██ ██ ██      ██   ██ ██   ██     ██  ██      ██      ██       ██ \n" +
                "██████  ██ ██      ███████ ███████     ██  ██      ███████ █████    ██ \n" +
                "██      ██ ██      ██   ██ ██   ██     ██  ██           ██ ██       ██ \n" +
                "██      ██ ███████ ██   ██ ██   ██      ██ ███████ ███████ ███████ ██  ");

        // Explicação da estrutura
        System.out.println("Apresentação:\n" +
                "É uma lista linear que agrupa elementos, formando uma coleção dos mesmos, de forma empilhada. Pode\n" +
                "ser entendida como uma pilha de pratos, daí seu nome, onde cada prato é colocado acima de outro e,\n" +
                "convenientemente, a retirada acontece pelo último (anteriormente inserido), alternando quem está\n" +
                "no topo.");
        System.out.println();
        System.out.println("Como funciona ?\n" +
                "As inserções e retiradas dos elementos se dão de acordo com o princípio de LIFO (“last-in,\n" +
                "first-out”, em português “último a entrar, primeiro a sair”), ou seja, apenas temos acesso ao topo\n" +
                "da pilha, podendo inserir algo ou retirar algo através dos métodos que a acompanham.");
        System.out.println();
        System.out.println("O que ela pode fazer ?\n" +
                "Este tipo abstrato de dado lhe permite: pegar o valor armazenado em um elemento da coleção, alterar\n" +
                "este valor, removê-lo, tanto como adicionar um novo.\n");

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

                    System.out.println("push(x):\n" +
                            "Esse método faz a inserção do objeto x no topo da pilha. Se a pilha estiver vazia, esse será seu\n" +
                            "primeiro elemento (base).");


                    System.out.println("Digite o numero que será inserido");
                    inserir = entrada.nextInt();
                    pilha.push(inserir);

                    //chamar metodo push para adicionar na pilha o numero 'inserir'
                    break;
                case 2: //remover
                    System.out.println("pop:\n" +
                            "Esse método faz a remoção do último elemento da pilha (no topo) e o retorna. Se a pilha estiver\n" +
                            "vazia, ocorre erro.\n");
                    try {
                        System.out.println("numero removido da pilha: " + pilha.pop());
                    } catch (EmptyStackException e) {
                        System.out.println("Não é possivel remover da pilha porque a porque a pilha está vazia");

                    }

                    //desempilha o item do topo da pilha e retorna ele no print
                    break;
                case 3: //imprimir
                    try {
                        System.out.println(pilha.toString());
                    } catch (EmptyStackException e) {
                        System.out.println("não é possivel imprimir a pilha pq ela está vazia");
                    }
                    // chamar metodo para imprimir importado do TAD
                    break;
                case 4: //top
                    System.out.println("top:\n" +
                            "Esse método verifica qual elemento está no topo da pilha e o retorna. Assim como o pop, gera erro\n" +
                            "caso a lista esteja vazia.\n");
                    try {
                        System.out.println("número que está no topo da pilha: " + pilha.top());
                    } catch (EmptyStackException e) {

                        System.out.println("não é possivel consultar porque a pilha está vazia");
                    }

                    //printa o item que está no topo da pilha
                    break;

            }
        }
    }
}

