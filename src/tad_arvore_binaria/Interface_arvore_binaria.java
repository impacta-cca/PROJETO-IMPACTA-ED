package tad_arvore_binaria;

import interfaces.Interface;
import tad_arvore_binaria.classes.LinkedBinaryTree;
import tad_arvore_binaria.interfaces.Position;

import java.util.Scanner;

import static interfaces.Interface.titulo2;

public class Interface_arvore_binaria {

    Interface opcoes = new Interface();

    public void arvoreBinaria(){
        LinkedBinaryTree<Integer> ArvoreBinaria = new LinkedBinaryTree<Integer>();
        String[] funcionalidades = {
                "Sair",
                "Inserir",
                "Remover",
                "desenhar arvore",

        };

        //Exibe título
        titulo2(" █████  ██████  ██    ██  ██████  ██████  ███████     ██████  ██ ███    ██  █████  ██████  ██  █████  \n" +
                "██   ██ ██   ██ ██    ██ ██    ██ ██   ██ ██          ██   ██ ██ ████   ██ ██   ██ ██   ██ ██ ██   ██ \n" +
                "███████ ██████  ██    ██ ██    ██ ██████  █████       ██████  ██ ██ ██  ██ ███████ ██████  ██ ███████ \n" +
                "██   ██ ██   ██  ██  ██  ██    ██ ██   ██ ██          ██   ██ ██ ██  ██ ██ ██   ██ ██   ██ ██ ██   ██ \n" +
                "██   ██ ██   ██   ████    ██████  ██   ██ ███████     ██████  ██ ██   ████ ██   ██ ██   ██ ██ ██   ██ ");

        System.out.println("Apresentação:\n" +
                "Árvores são as estruturas ideais para representar hierarquias e sua implementação, geralmente, se\n" +
                "dá de maneira recursiva. A árvore binária é um pouco mais restrita em comparação a uma árvore\n" +
                "genérica (uma vez que cada nó tem até dois filhos), mas herda algumas de suas características e\n" +
                "operações.\n" +
                "\n" +
                "\n" +
                "Como funciona ?\n" +
                "Uma árvore binária pode ser: \n" +
                "- vazia\n" +
                "- com um nodo raiz + subárvore esquerda + subárvore direita \n" +
                "Cada filho recebe um nome, sendo um da esquerda e um da direita, onde o filho da esquerda precede o\n" +
                "da direita. Se um nodo x é a raíz da árvore, seu campo “parent”(pai) ficará nulo, seguindo a mesma\n" +
                "lógica, quando um nodo pai tiver um ou nenhum filho, os campos correspondentes a tal ficaram nulos\n" +
                "(representando sua inexistência, seja ele filho da direita, da esquerda ou ambos), em caso do nodo\n" +
                "não ter nenhum filho, recebe o nome de folha.\n" +
                "\n" +
                "O que ela pode fazer ?\n" +
                "O tipo árvore nos permite: armazenar elementos em posições como as de uma lista, saber o valor\n" +
                "armazenado em uma posição da árvore, retornar um iterador e um iterável de nodos da árvore,\n" +
                "substituir o valor armazenado em determinado elemento, retornando o valor antigo e adicionar\n" +
                "subárvores em um nodo externo.\n" +
                "Saber: quem é sua raiz; quem é o pai de um elemento; quem é o filho da direita ou da esquerda e se\n" +
                "os mesmos existem, podendo inseri-los, em ambos os lados, caso ainda não existam; se determinado\n" +
                "elemento é interno, externo ou raíz; a quantidade de elementos armazenados na árvore; se está vazia;\n" +
                "\n" +
                "Como faz cada função ?\n" +
                "\n" +
                "Métodos suportados além dos métodos herdados da Árvore Genérica:\n" +
                "- left(v): retorna quem é o filho da esquerda do nodo v. Dá erro caso v não tenha filho da esquerda.\n" +
                "\n" +
                "- right(v): retorna quem é o filho da direita do nodo v. Dá erro caso v não tenha filho da direita.\n" +
                "\n" +
                "- hasLeft(v): retorna um valor booleano que diz se v tem (true) ou não (false) filho da esquerda.\n" +
                "\n" +
                "- hasRight(v): retorna um valor booleano que diz se v tem (true) ou não (false) filho da direita.\n" +
                "\n" +
                "Métodos de LinkedBinaryTree:\n" +
                "- sibling(v): retorna qual nodo é irmão de v.\n" +
                "\n" +
                "- addRoot(e): cria um novo nodo que guarda o elemento e, sendo esse nodo a raíz da árvore e o\n" +
                "retorna. Só funciona quando a árvore está vazia, caso contrário gera um erro.\n" +
                "\n" +
                "- insertLeft(v,e): cria um novo nodo que guarda o elemento e, tal nodo é colocado como filho da\n" +
                "esquerda (left) do nodo v e retornado. Ocorre erro caso v já tenha filho da esquerda.\n" +
                "\n" +
                "- insertRight(v,e): cria um novo nodo que guarda o elemento e, tal nodo é colocado como filho da\n" +
                "direita (right) do nodo v e retornado. Ocorre erro caso v já tenha filho da direita.\n" +
                "\n" +
                "- remove(v): remove o nodo v e retorna o que estava armazenado. Se existir algum filho de v, esse\n" +
                "serve para substituí-lo. Ocorre erro caso v tenha dois filhos. \n" +
                "\n" +
                "- attach(v, T1, T2): faz com que T1 e T2 sejam adicionadas como subárvores de v (esquerda e\n" +
                "direita, respectivamente). Ocorre erro caso v não seja nodo externo.\n");

        boolean alternador = true;
        while (alternador) {
            Scanner entrada = new Scanner(System.in);
            int op = opcoes.menu(funcionalidades);
            int inserir = 0;
            switch (op) {
                case 0: // Sair
                    alternador = false;
                    break;
                case 1: // caso de inserção na arvore binaria( ainda necessário definir como será feita a inserção)
                    if(ArvoreBinaria.isEmpty()){
                        System.out.println("Digite o número para a raiz da árvore: ");
                        inserir = entrada.nextInt();
                        ArvoreBinaria.addRoot(inserir);
                        System.out.println("O número " + inserir + " é raiz da árvore");
                    }
                    else{
                        System.out.println("Digite o numero que será inserido na árvore: ");
                        inserir = entrada.nextInt();
                        ArvoreBinaria.inserirnaArvore(inserir, ArvoreBinaria.root(), ArvoreBinaria);
                    }
                    break;
                case 2:

                    System.out.println("Digite o numero que será removido: ");
                    int remover = entrada.nextInt();
                    Position<Integer> encontrado = ArvoreBinaria.findbinaria(remover, ArvoreBinaria.root(), ArvoreBinaria);
                    if(encontrado==null){
                        System.out.println("número não encontrado");
                    }
                    else {
                        System.out.println("Número: " + ArvoreBinaria.remove(encontrado) + " removido com sucesso");
                    }
                    break;
                case 3: //imprimir
                    ArvoreBinaria.desenhaArvore(ArvoreBinaria, ArvoreBinaria.root(), 0,0);
                    // chamar metodo para imprimir importado do TAD
                    break;
            }







        }

    }



}
