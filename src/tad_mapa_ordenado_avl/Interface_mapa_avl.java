package tad_mapa_ordenado_avl;

import interfaces.Interface;
import tad_mapa_ordenado_avl.classes.AVLTreeMap;


import java.util.Scanner;

import static interfaces.Interface.titulo2;

public class Interface_mapa_avl {

    public void mapaOrdenadoAVL(){
        Interface opcoes = new Interface();
        AVLTreeMap<Integer,Integer> MapaAVL = new AVLTreeMap<Integer, Integer>();

        String[] funcionalidades = {
                "Sair",
                "Inserir",
                "Remover",
                "imprimir",

        };


        //Exibe titulo
        titulo2("███    ███  █████  ██████   █████       ██████  ██████  ██████  ███████ ███    ██  █████  ██████   ██████       ██  █████  ██    ██ ██      ██  \n" +
                "████  ████ ██   ██ ██   ██ ██   ██     ██    ██ ██   ██ ██   ██ ██      ████   ██ ██   ██ ██   ██ ██    ██     ██  ██   ██ ██    ██ ██       ██ \n" +
                "██ ████ ██ ███████ ██████  ███████     ██    ██ ██████  ██   ██ █████   ██ ██  ██ ███████ ██   ██ ██    ██     ██  ███████ ██    ██ ██       ██ \n" +
                "██  ██  ██ ██   ██ ██      ██   ██     ██    ██ ██   ██ ██   ██ ██      ██  ██ ██ ██   ██ ██   ██ ██    ██     ██  ██   ██  ██  ██  ██       ██ \n" +
                "██      ██ ██   ██ ██      ██   ██      ██████  ██   ██ ██████  ███████ ██   ████ ██   ██ ██████   ██████       ██ ██   ██   ████   ███████ ██ ");
        System.out.println("Apresentação: \n" +
                "Este TAD é semelhante ao TAD Mapa ABB, contém o mesmo critério de organização e pesquisa, sendo também\n" +
                "estritamente uma árvore binária completa. No entanto, este tipo acrescenta uma regra a mais para\n" +
                "manter o equilíbrio da árvore, isto é, que previne a árvore de se estender excessivamente em um único\n" +
                "ramo. \n" +
                "\n" +
                "Como funciona ?\n" +
                "Com o mesmo formato de inserção “é maior ou menor?” da árvore ABB, adiciona-se uma verificação a mais\n" +
                "para manter o equilíbrio da árvore: checamos a altura dos ramos adjacentes e, quando comparados, caso\n" +
                "houver uma diferença maior que 1, dizemos que a árvore está desbalanceada, sendo assim, reorganizamos\n" +
                "a árvore para restabelecer seu equilíbrio. Obs: a altura é dada pelo tamanho do ramo que mais se estende\n" +
                "em uma determinada árvore ou sub-árvore.\n" +
                "\n" +
                "O que ela pode fazer ?\n" +
                "Este tipo de dado lhe permite: inserir um elemento, remover um elemento, exibir um desenho da árvore\n" +
                "em andamento. \n" +
                "\n" +
                "Como faz cada função ?\n" +
                "- put : insere um elemento na árvore, buscando pela posição ideal de inserção e fazendo a verificação\n" +
                "de balanceamento de altura. Caso a inserção ocasione um desbalanceamento na árvore, este método deverá\n" +
                "automaticamente fazer a chamada de outro método, que reestruturará a árvore de tal maneira a manter\n" +
                "seu equilíbrio, mudando as posições dos elementos.\n" +
                "\n" +
                "- remove : remove um elemento da árvore. Novamente, caso a inserção ocasione um desbalanceamento na\n" +
                "árvore, este método deverá automaticamente fazer a chamada de outro método, que reestruturará a árvore\n" +
                "de tal maneira a manter seu equilíbrio, mudando as posições dos elementos. Este método pode lançar\n" +
                "uma exceção caso o usuário tente remover um elemento inexistente na árvore.\n" +
                "\n" +
                "- printExpression : mostra ao usuário um “desenho” de como a árvore se encontra naquele momento.\n");

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

                    MapaAVL.put(key,inserir);
                    System.out.println("foi inserido no mapa é o número "+inserir+" que possui a chave "+key);
                    break;
                case 2:
                    System.out.println("Digite a chave do valor para remoção");
                    remocao = entrada.nextInt();
                    System.out.println("O numero "+ MapaAVL.remove(remocao) + "foi removido com sucesso");

                    break;
                case 3: //imprimir
                    System.out.println("Chave: \t" + MapaAVL.keySet().toString());
                    System.out.println("Valor: \t" + MapaAVL.values().toString());
                    // chamar metodo para imprimir importado do TAD
                    break;
            }
        }

    }


}


