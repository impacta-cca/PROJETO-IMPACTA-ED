package tad_dicionario;

import interfaces.Interface;
import tad_mapa.classes.HashTableMap;


import java.util.Scanner;

public class Interface_dicionario {


    Interface opcoes = new Interface();

    public void dicionario(){

        HashTableMap<Integer, Integer> Dicionario = new HashTableMap<Integer,Integer>();
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
                    System.out.println("O número "+Dicionario.remove(remover)+" foi removido com sucesso");
                    break;
                case 3: //imprimir
                    System.out.println(Dicionario.toString());
                    // chamar metodo para imprimir importado do TAD
                    break;
            }
        }

    }
}
