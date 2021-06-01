package tad_dicionario;

import interfaces.Interface;
import tad_dicionario.classes.HashTableMultiMap;
import tad_mapa.classes.HashTableMap;


import java.util.Scanner;

import static interfaces.Interface.titulo2;

public class Interface_dicionario {


    Interface opcoes = new Interface();

    public void dicionario(){

        HashTableMultiMap<Integer, Integer> Dicionario = new HashTableMultiMap<Integer,Integer>();
        String[] funcionalidades = {
                "Sair",
                "Inserir",
                "Remover",
                "imprimir",

        };

        //Exibe titulo
        titulo2("                                        ██████  ██  ██████ ██  ██████  ███    ██  █████  ██████  ██  ██████  \n" +
                "                                        ██   ██ ██ ██      ██ ██    ██ ████   ██ ██   ██ ██   ██ ██ ██    ██ \n" +
                "                                        ██   ██ ██ ██      ██ ██    ██ ██ ██  ██ ███████ ██████  ██ ██    ██ \n" +
                "                                        ██   ██ ██ ██      ██ ██    ██ ██  ██ ██ ██   ██ ██   ██ ██ ██    ██ \n" +
                "                                        ██████  ██  ██████ ██  ██████  ██   ████ ██   ██ ██   ██ ██  ██████  ");

        System.out.println("Apresentação:\n" +
                "Assemelhando-se à estrutura de dados Mapa, os dicionários formam uma coleção de itens, de qualquer\n" +
                "tipo, em pares (chave-elemento). Sua principal distinção em relação ao mapa é a possibilidade de uma\n" +
                "chave poder representar mais de um item, assim como num dicionário tradicional, que encontramos mais\n" +
                "de um significado para a mesma palavra. \t\n" +
                "\t\n" +
                "\n" +
                "Como funciona ?\n" +
                "O dicionário pode ter uma quantidade variada de elementos, que são adicionados e sempre relacionados\n" +
                "a suas chaves, ou seja, cada inserção requer (x,y) onde x é chave e y o valor atrelado a tal. São\n" +
                "adicionados em lista, um elemento após o outro.\n" +
                "\n" +
                "O que ela pode fazer ?\n" +
                "A estrutura nos permite adicionar valores, ter acesso aos mesmos (de acordo com suas chaves), saber\n" +
                "se o dicionário está vazio ou não, assim como a quantidade de elementos existentes.\n" +
                "\n" +
                "Como faz cada função ?\n" +
                "- size: retorna a quantidade de itens no dicionário.\n" +
                "\n" +
                "- isEmpty: testa se a estrutura está vazia (true) ou não (false), retornando um valor booleano.\n" +
                "\n" +
                "- get(k): retorna k caso faça parte do dicionário, quando não faz, retorna null.\n" +
                "\n" +
                "- getAll(k): retorna uma coleção iterável com todos os elementos que tem chave igual a k. \n" +
                "\n" +
                "- put(k,v): insere no dicionário um novo objeto com chave k e que guarda o valor v e o retorna.\n" +
                "\n" +
                "- remove(e): remove o elemento e do dicionário e o retorna, caso não exista, retorna null.\n" +
                "\n" +
                "- entrySet(): retorna uma coleção iterável dos pares chave-valor do dicionário.\n");

        boolean alternador = true;
        while (alternador) {
            Scanner entrada = new Scanner(System.in);
            int op = opcoes.menu(funcionalidades);
            int inserir = 0;
            int key=0;
            switch (op) {
                case 0: // Sair
                    alternador = false;
                    break;
                case 1: // caso de inserção na arvore binaria( ainda necessário definir como será feita a inserção)
                    System.out.println("Digite o numero que será inserido no dicionario? ");
                    inserir = entrada.nextInt();

                    System.out.println("Digite a chave do número que será inserido no dicionario? ");
                    key = entrada.nextInt();

                    Dicionario.put(key, inserir);

                    break;
                case 2:
                    System.out.println("Digite a chave do numero que será removido: ");
                    int remover = entrada.nextInt();
                    System.out.println("O número " + Dicionario.remove(Dicionario.get(remover)) + " foi removido com sucesso");
                    break;
                case 3: //imprimir
                    System.out.println(Dicionario.entrySet().toString());
                    // chamar metodo para imprimir importado do TAD
                    break;
            }
        }
    }
}
