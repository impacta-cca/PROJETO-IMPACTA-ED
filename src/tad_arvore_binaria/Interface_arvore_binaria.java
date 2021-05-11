package tad_arvore_binaria;

import interfaces.Interface;
import tad_arvore_binaria.classes.LinkedBinaryTree;

import java.util.Scanner;

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
                    System.out.println("Digite o numero que será inserido");
                    inserir = entrada.nextInt();
                    if(ArvoreBinaria.isEmpty()){
                        ArvoreBinaria.addRoot(inserir);
                    }
                    else{

                    }

                    break;
                case 2:
                    System.out.println("Digite o numero que será removido: ");
                    int remover = entrada.nextInt();

                    break;
                case 3: //imprimir
                    System.out.println(ArvoreBinaria.toString());
                    // chamar metodo para imprimir importado do TAD
                    break;
            }
        }

    }

}
