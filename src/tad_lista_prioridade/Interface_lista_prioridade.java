package tad_lista_prioridade;

import interfaces.Interface;
import tad_lista_prioridade.classes.SortedListPriorityQueue;


import java.util.Scanner;

public class Interface_lista_prioridade {
    Interface opcoes = new Interface();

    public void listaPrioridade(){

        SortedListPriorityQueue<Integer,Integer> ListaPrioridade = new SortedListPriorityQueue<Integer, Integer>();

        String[] funcionalidades = {
                "Sair",
                "Inserir",
                "Remover",
                "imprimir",

        };

        boolean alternador = true;
        while (alternador) {
            Scanner entrada = new Scanner(System.in);
            int op = opcoes.menu(funcionalidades);
            int inserir = 0;
            int key;
            switch (op) {
                case 0: // Sair
                    alternador = false;
                    break;
                case 1: // o caso de inserção pede para o usuario uma chave do tipo inteiro e um numero do tipo inteiro, e assim, usa o metodo insert
                        // da ListaPrioridade para inseri-los na lista.
                    System.out.println("Digite o numero que será inserido");
                    inserir = entrada.nextInt();
                    System.out.println("Digite uma chave para o número que será inserido");
                    key = entrada.nextInt();

                    ListaPrioridade.insert(key,inserir);
                    System.out.println("foi inserido na lista de prioridades o número "+inserir+" que possui a chave "+key);
                    break;
                case 2:
                    System.out.println("item com menor chave removido da lista: "+ListaPrioridade.removeMin().getValue());



                    break;
                case 3: //imprimir
                    System.out.println(ListaPrioridade.toString());
                    // chamar metodo para imprimir importado do TAD
                    break;
            }
        }

    }


}
