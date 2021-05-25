package tad_pilha_array;

import interfaces.Interface;
import tad_pilha_array.classes.ArrayStack;

import java.util.Scanner;

public class Interface_pilha_array {
    Interface opcoes = new Interface();

    public  void pilha(){
        ArrayStack<Integer> pilha = new ArrayStack<Integer>();
        String[] funcionalidadesArranjo = {
                "Sair",
                "Inserir",
                "Remover",
                "imprimir",
                "consultar número no topo da pilha"

        };

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

                    System.out.println("numero removido da pilha: "+pilha.pop());

                    //desempilha o item do topo da pilha e retorna ele no print
                    break;
                case 3: //imprimir
                    System.out.println(pilha.toString());
                    // chamar metodo para imprimir importado do TAD
                    break;
                case 4: //top
                    System.out.println("top:\n" +
                            "Esse método verifica qual elemento está no topo da pilha e o retorna. Assim como o pop, gera erro\n" +
                            "caso a lista esteja vazia.\n");

                    System.out.println("número que está no topo da pilha: "+pilha.top());
                    //printa o item que está no topo da pilha
                    break;
            }
        }

    }



}
