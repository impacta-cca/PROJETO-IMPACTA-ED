package tad_mapa_ordenado_abb;



import interfaces.Interface;
import tad_mapa_ordenado_abb.classes.BinarySearchTree;

import java.util.Scanner;

import static interfaces.Interface.titulo2;

public class Interface_mapa_ordenado_abb {

    public void mapaOrdenadoABB(){
        Interface opcoes = new Interface();
        BinarySearchTree<Integer,Integer> MapaABB = new BinarySearchTree<Integer,Integer>();

        String[] funcionalidades = {
                "Sair",
                "Inserir",
                "Remover",
                "imprimir",

        };

        //Exibe título
        titulo2("███    ███  █████  ██████   █████       ██████  ██████  ██████  ███████ ███    ██  █████  ██████   ██████       ██  █████  ██████  ██████  ██  \n" +
                "████  ████ ██   ██ ██   ██ ██   ██     ██    ██ ██   ██ ██   ██ ██      ████   ██ ██   ██ ██   ██ ██    ██     ██  ██   ██ ██   ██ ██   ██  ██ \n" +
                "██ ████ ██ ███████ ██████  ███████     ██    ██ ██████  ██   ██ █████   ██ ██  ██ ███████ ██   ██ ██    ██     ██  ███████ ██████  ██████   ██ \n" +
                "██  ██  ██ ██   ██ ██      ██   ██     ██    ██ ██   ██ ██   ██ ██      ██  ██ ██ ██   ██ ██   ██ ██    ██     ██  ██   ██ ██   ██ ██   ██  ██ \n" +
                "██      ██ ██   ██ ██      ██   ██      ██████  ██   ██ ██████  ███████ ██   ████ ██   ██ ██████   ██████       ██ ██   ██ ██████  ██████  ██  ");

        System.out.println("Apresentação:\n" +
                "Este tipo é baseado no TAD Mapa comum, seu diferencial é que é organizado estrategicamente a favor\n" +
                "de uma pesquisa mais eficiente por seus elementos. Esse tipo de árvore é binária completa, então cada\n" +
                "elemento terá de possuir estritamente 0 ou 2 filhos, utilizando um “placeholder” se necessário.\n" +
                "\n" +
                "Como funciona ?\n" +
                "As entradas são controladas de forma a organizar automaticamente a árvore: a partir da raiz (primeiro\n" +
                "elemento inserido), compara-se os elementos adicionados posteriormente utilizando a pergunta “é maior\n" +
                "ou menor?”. Se for maior, o elemento é alocado como filho à direita, se for menor, à esquerda. Caso se\n" +
                "depare com um elemento que já tem um filho onde deseja inserir, aplica-se a mesma pergunta, a partir\n" +
                "do valor desse filho existente, sucessivamente. Tendo a árvore organizada desta forma, para a pesquisa\n" +
                "utilizamos a mesma lógica: “o valor buscado é maior ou menor que [...]?” a partir dos valores percorridos\n" +
                "na árvore, desta forma dividimos pela metade o esforço para encontrar o elemento desejado.\n" +
                "\n" +
                "O que ela pode fazer ?\n" +
                "Este tipo lhe permite: inserir e remover elementos, saber o tamanho da árvore, obter uma lista de todos\n" +
                "os elementos existentes na árvore, obter uma lista de todas as entradas par chave-valor inseridas na\n" +
                "árvore, visualizar o desenho do andamento da árvore.\n" +
                "\n" +
                "Como faz cada função ?\n" +
                "- size : retorna o número de elementos na árvore.\n" +
                "\n" +
                "- put : insere um elemento na árvore aplicando a lógica > ou <.\n" +
                "\n" +
                "- remove : remove e retorna um elemento da árvore e realoca os elementos para preencher o espaço vazio.\n" +
                "\n" +
                "- keySet: retorna uma coleção iterável de todas as chaves existentes na árvore.\n" +
                "\n" +
                "- values: retorna uma coleção de todos os valores armazenados nas entradas existentes da árvore.\n" +
                "\n" +
                "- entrySets: retorna uma coleção de todas as entradas par chave-valor existentes na árvore.\n" +
                "\n" +
                "- printExpression : desenha de forma parentizada a expressão da árvore.\n" +
                "\n");

        boolean alternador = true;
        while (alternador) {
            Scanner entrada = new Scanner(System.in);
            int op = opcoes.menu(funcionalidades);
            int inserir = 0;
            int key;
            int remocao;
            switch (op) {
                case 0: // Sair
                    alternador = false;
                    break;
                case 1: // o caso de inserção pede para o usuario uma chave do tipo inteiro e um numero do tipo inteiro, e assim, usa o metodo pu
                    // do mapa para inseri-los na mapa.
                    System.out.println("Digite o numero que será inserido");
                    inserir = entrada.nextInt();
                    System.out.println("Digite uma chave para o número que será inserido");
                    key = entrada.nextInt();

                    MapaABB.put(key,inserir);
                    System.out.println("foi inserido no mapa é o número "+inserir+" que possui a chave "+key);
                    break;
                case 2:
                    System.out.println("Digite a chave do valor para remoção");
                    remocao = entrada.nextInt();
                    System.out.println("O numero "+ MapaABB.remove(remocao) + "foi removido com sucesso");

                    break;
                case 3: //imprimir
                    System.out.println("Chave: \t"+MapaABB.keySet().toString());
                    System.out.println("Valor: \t"+MapaABB.values().toString());
                    // chamar metodo para imprimir importado do TAD
                    break;
            }
        }

    }

}
