package tad_mapa;

import interfaces.Interface;

import tad_mapa.classes.HashTableMap;

import java.util.Scanner;

import static interfaces.Interface.titulo2;

public class Interface_mapa {
    Interface opcoes = new Interface();
    public void mapa(){
        HashTableMap<Integer,Integer> Mapa = new HashTableMap<Integer, Integer>();

        String[] funcionalidades = {
                "Sair",
                "Inserir",
                "Remover",
                "imprimir",

        };

        //Exibe titulo
        titulo2("                                                        ███    ███  █████  ██████   █████                                                          \n" +
                "                                                        ████  ████ ██   ██ ██   ██ ██   ██                                                         \n" +
                "                                                        ██ ████ ██ ███████ ██████  ███████                                                         \n" +
                "                                                        ██  ██  ██ ██   ██ ██      ██   ██                                                         \n" +
                "                                                        ██      ██ ██   ██ ██      ██   ██                                                         ");


        // Exibe explicação da estrutura
        System.out.println("\n" +
                "Apresentação:\n" +
                "O TAD Mapa é uma estrutura de lista, onde os elementos serão compostos por chaves que permitirão que\n" +
                "encontremos seus elementos com mais facilidade, pode-se pensar nela como etiquetas que lhe dizem o\n" +
                "que é o quê. Por isso o chamamos de mapa, pois podemos “mapear” os valores a partir de suas chaves. \n" +
                "\n" +
                "Como funciona ?\n" +
                "Cada valor inserido no mapa será um par chave-valor, chamado de entrada. Para o acesso dos elementos,\n" +
                "não procuraremos mais pelo valor desejado em si, mas sim por sua chave, por isso estabelecemos uma\n" +
                "regra: as chaves devem ser únicas. Sua organização é similar ao TAD fila padrão, cada novo elemento é\n" +
                "adicionado no final da lista, independente do valor do elemento ou do valor de sua chave.\n" +
                "\n" +
                "O que ela pode fazer ?\n" +
                "Este tipo de dado lhe permite: remover uma entrada, adicionar ou alterar uma entrada, obter o valor\n" +
                "de um par chave-valor, obter uma coleção de todas as chaves no conjunto, obter uma coleção de todos\n" +
                "os valores no conjunto, obter uma coleção de todas as entradas par chave-valor no conjunto, saber o\n" +
                "tamanho da lista, saber se a lista está vazia.\n" +
                "\n" +
                "Como faz cada função ?\n" +
                "- size: retorna quantas entradas foram inseridas na lista.\n" +
                "\n" +
                "- isEmpty: indica se a lista está ou não está vazia.\n" +
                "\n" +
                "- get: retorna o valor contido na entrada com a chave equivalente a que o usuário informar, se a\n" +
                "chave informada não existir na lista, retorna null.\n" +
                "\n" +
                "- put: recebe uma entrada chave-valor. Se a chave informada já existir na lista, apenas substitui o\n" +
                "valor, retornando o valor antigo; se a chave não existir ainda na lista, cria e adiciona uma entrada\n" +
                "nova com o par informado, retornando null. \n" +
                "\n" +
                "- remove: remove a entrada da lista que possua a chave informada pelo usuário, e retorna o valor\n" +
                "armazenado nele; se a chave informada não existir na lista, retorna null.\n" +
                "\n" +
                "- keySet: retorna uma coleção iterável de todas as chaves existentes na lista.\n" +
                "\n" +
                "- values: retorna uma coleção de todos os valores armazenados nas entradas existentes da lista.\n" +
                "\n" +
                "- entrySets: retorna uma coleção de todas as entradas par chave-valor existentes na lista.\n" +
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

                    Mapa.put(key,inserir);
                    System.out.println("foi inserido no mapa é o número "+inserir+" que possui a chave "+key);
                    break;
                case 2:
                    System.out.println("Digite a chave do valor para remoção");
                    remocao = entrada.nextInt();
                    System.out.println("O numero "+ Mapa.remove(remocao) + "foi removido com sucesso");

                    break;
                case 3: //imprimir
                    if(Mapa.isEmpty()){
                        System.out.println("ERRO: O mapa está vazio.");
                    }else {
                        System.out.println(Mapa.toString());
                        // chamar metodo para imprimir importado do TAD
                    }
                    break;
            }
        }
    }
}
