package tad_mapa_ordenado_abb;



import interfaces.Interface;
import tad_mapa_ordenado_abb.classes.BinarySearchTree;

import java.util.Scanner;

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
                    System.out.println(MapaABB.keySet().toString());
                    System.out.println(MapaABB.values().toString());
                    // chamar metodo para imprimir importado do TAD
                    break;
            }
        }

    }

}
