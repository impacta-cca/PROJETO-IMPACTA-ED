package tad_lista_de_nodos;

import interfaces.Interface;
import tad_lista_de_nodos.classes.NodePositionList;
import tad_lista_de_nodos.interfaces.Position;
import tad_lista_de_nodos.interfaces.PositionList;

import java.util.Iterator;
import java.util.Scanner;

import static interfaces.Interface.titulo2;

public class Interface_lista_de_nodos {
    Interface opcoes = new Interface();

    public void listaNodos(){
        NodePositionList<Integer> listaNodos = new NodePositionList<Integer>();

        String[] funcionalidadesArranjo = {
                "Sair",
                "Inserir",
                "Remover",
                "Consultar",

        };

        // Exibe titulo
        titulo2("██      ██ ███████ ████████  █████      ██████  ███████     ███    ██  ██████  ██████   ██████  ███████ \n" +
                "██      ██ ██         ██    ██   ██     ██   ██ ██          ████   ██ ██    ██ ██   ██ ██    ██ ██      \n" +
                "██      ██ ███████    ██    ███████     ██   ██ █████       ██ ██  ██ ██    ██ ██   ██ ██    ██ ███████ \n" +
                "██      ██      ██    ██    ██   ██     ██   ██ ██          ██  ██ ██ ██    ██ ██   ██ ██    ██      ██ \n" +
                "███████ ██ ███████    ██    ██   ██     ██████  ███████     ██   ████  ██████  ██████   ██████  ███████ ");

        System.out.println("Apresentação:\n" +
                        "A lista de nodos é um TAD que lhe concede uma forma alternativa aos índices de se referenciar a\n" +
                        "posições de elementos em uma lista, possuindo duas maneiras de ser implementada: Lista simplesmente\n" +
                        "encadeada (LSE), lista duplamente encadeada (LDE). Sendo assim, podemos dizer que uma Lista de Nodos\n" +
                        "é basicamente uma lista de posições.\n" +
                        "\n" +
                        "Como funciona ?\n" +
                        "Suas posições são definidas de forma lógica, ou seja, são dinâmicas como variáveis. Os nodos não\n" +
                        "conhecem posição 0, 1, 2, 3, etc; nodos conhecem apenas quem são seus “vizinhos” aos quais estão\n" +
                        "ligados (quem está à esquerda, quem está à direita), por isso dizemos ser uma lista encadeada.\n" +
                        "Cada nodo armazena o endereço de posição do nodo anterior e/ou posterior a si, a partir de um\n" +
                        "indicador que chamamos de ponteiro, e é assim que se percorre esse tipo de lista.\n" +
                        "\n" +
                        "O que ela pode fazer ?\n" +
                        "Esse tipo de lista de permite: saber seu tamanho (quantidade de elementos armazenados), saber se\n" +
                        "está vazia, saber qual o primeiro e qual o último elemento da lista, saber qual é o elemento\n" +
                        "anterior e posterior de determinado nodo, mudar o valor contido em um nodo, remover e elemento,\n" +
                        "inserir elemento no: começo, final, antes de e elemento, depois de e elemento.\n" +
                        "\n" +
                        "Como faz cada função ?\n" +
                        "- first: retorna o valor armazenado do primeiro elemento da lista. Uma exceção é lançada se a lista estiver\n" +
                        "vazia.\n" +
                        "\n" +
                        "- last: retorna o valor armazenado do último elemento da lista. Uma exceção é lançada se a lista estiver\n" +
                        "vazia.\n" +
                        "\n" +
                        "- prev: retorna a posição do elemento que precede determinado nodo da lista. Uma exceção é lançada\n" +
                        "se o nodo informado for o elemento da primeira posição.\n" +
                        "\n" +
                        "- next: retorna a posição do elemento posterior a determinado nodo da lista. Uma exceção é lançada\n" +
                        "se o nodo informado for o elemento da última posição.\n" +
                        "\n" +
                        "- set: substitui o valor armazenado em determinada posição, retornando o valor antigo.\n" +
                        "\n" +
                        "- addFirst: insere um novo elemento na primeira posição da lista.\n" +
                        "\n" +
                        "- addLast: insere um novo elemento na última posição da lista.\n" +
                        "\n" +
                        "- addBefore: insere um novo elemento antes de determinada posição da lista.\n" +
                        "\n" +
                        "- addAfter: insere um novo elemento depois de determinada posição da lista.\n" +
                        "\n" +
                        "- remove: remove e retorna o elemento de determinada posição da lista, invalidando esta posição.\n");

        boolean alternador = true;
        while (alternador) {
            Scanner entrada = new Scanner(System.in);
            int op = opcoes.menu(funcionalidadesArranjo);
            int inserir = 0;
            switch (op) {
                case 0: // Sair
                    alternador = false;
                    break;
                case 1: // caso de inserção na lista de nodos
                    System.out.println("Digite o numero que será inserido");
                    inserir = entrada.nextInt();
                    // caso a lista esteja vazia, é inserido na primeira posição o número digitado pelo usuário
                    if(listaNodos.isEmpty()){
                        listaNodos.addFirst(inserir);
                        System.out.println("O primeiro item add a lista foi o "+inserir);
                    }
                    //caso a lista tenha pelo menos 1 item na lista,o item é inserido na ultima posição apos o ultimo item da lista(caso tenha 1, será inserido na posição 2)
                    else{
                        listaNodos.addLast(inserir);
                    }

                    break;
                case 2: // cria uma Position remover que recebera  a primeira posição da lista de nodos e caso o elemento dele seja igual a o numero
                        // digitado pelo usuario, ira usar o metodo de remoção do lista nodo com ele, senão, ele passará para a proxima posição
                    System.out.println("Digite o numero que será removido: ");
                    int remover = entrada.nextInt();
                    Position<Integer> posremover = listaNodos.find(listaNodos.first(), remover);
                    if(posremover.equals(null)){
                        System.out.println("numero não encontrado");
                    }
                    else {
                        System.out.println("numero removido: "+listaNodos.remove(posremover));

                    }

                    break;
                case 3: //imprimir
                    System.out.println(listaNodos.toString());
                    System.out.println("ultimo item da lista: "+listaNodos.last().element());
                    // chamar metodo para imprimir importado do TAD
                    break;
            }
        }
    }
}
