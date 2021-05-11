package tad_arvore_generica;

import interfaces.Interface;
import tad_arvore_generica.classes.LinkedTree;
import java.util.Scanner;

public class Interface_arvore_generica {
    Interface opcoes = new Interface();

    public void arvoreGenerica(){

        LinkedTree<Integer> ArvoreGenerica = new LinkedTree<Integer>();

        String[] funcionalidadesArranjo = {
                "Sair",
                "Inserir",
                "Remover",
                "desenhar arvore",

        };

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
                    if(ArvoreGenerica.isEmpty()){
                        ArvoreGenerica.addRoot(inserir);
                    }
                    else{

                    }
                    // caso a lista esteja vazia, é inserido na primeira posição o número digitado pelo usuário

                    break;
                case 2: // cria uma Position remover que recebera  a primeira posição da lista de nodos e caso o elemento dele seja igual a o numero
                    // digitado pelo usuario, ira usar o metodo de remoção do lista nodo com ele, senão, ele passará para a proxima posição
                    System.out.println("Digite o numero que será removido: ");
                    int remover = entrada.nextInt();

                    break;
                case 3: //imprimir
                    System.out.println(ArvoreGenerica.toString());
                    // chamar metodo para imprimir importado do TAD
                    break;
            }
        }

    }
}
