package tad_arvore_generica;

import interfaces.Interface;
import tad_arvore_binaria.interfaces.TreePosition;
import tad_arvore_generica.classes.LinkedTree;
import java.util.Scanner;
import tad_arvore_generica.classes.NodePositionList;

import tad_arvore_generica.classes.TreeNode;
import tad_arvore_generica.interfaces.*;

public class Interface_arvore_generica {
    Interface opcoes = new Interface();

    public void arvoreGenerica(){

        LinkedTree<Integer> ArvoreGenerica = new LinkedTree<Integer>();

        String[] funcionalidadesArranjo = {
                "Sair",
                "Inserir",
                "Remover",
                "desenhar arvore",
                "Consultar nodo"

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

                    if(ArvoreGenerica.isEmpty()){
                        System.out.println("Digite o numero que será inserido");
                        inserir = entrada.nextInt();
                        ArvoreGenerica.addRoot(inserir);
                        ArvoreGenerica.root().setChildren(new NodePositionList<Position<Integer>>());
                        Iterable<Position<Integer>> filhos = ArvoreGenerica.children(ArvoreGenerica.root());

                        System.out.println("Qual será o filho da esquerda?");
                        int filho_esquerda = entrada.nextInt();
                        criarFilho((TreeNode<Integer>) ArvoreGenerica.root(),filho_esquerda);

                        System.out.println("Qual será o filho da direita?");
                        int filho_direita = entrada.nextInt();
                        criarFilho((TreeNode<Integer>) ArvoreGenerica.root(),filho_direita);

                        System.out.println("Root: "+ArvoreGenerica.root().getElement());
                        System.out.println("filho da esquerda: "+ArvoreGenerica.root().getChildren().first().element().element());
                        System.out.println("Filho da direita: "+ArvoreGenerica.root().getChildren().last().element().element());
                    }
                    else{
                        System.out.println("Qual o número que você procura na árvore? ");
                        inserir = entrada.nextInt();
                        TreeNode<Integer> aux = (TreeNode<Integer>) ArvoreGenerica.find(inserir, ArvoreGenerica.root());



                        System.out.println("Qual será o filho da esquerda?");
                        int filho_esquerda = entrada.nextInt();
                        criarFilho(aux,filho_esquerda);

                        System.out.println("Qual será o filho da direita?");
                        int filho_direita = entrada.nextInt();
                        criarFilho(aux,filho_direita);

                        System.out.println(ArvoreGenerica.parentheticRepresentation(ArvoreGenerica, ArvoreGenerica.root()));

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
                    ArvoreGenerica.postorder(ArvoreGenerica, ArvoreGenerica.root());
                    // chamar metodo para imprimir importado do TAD
                    break;

                case 4:
                    System.out.println("Qual o número que você procura na árvore? ");
                    inserir = entrada.nextInt();
                    TreeNode<Integer> aux = (TreeNode<Integer>) ArvoreGenerica.find(inserir, ArvoreGenerica.root());
                    System.out.println("O nodo encontrado "+aux.element()+"\nfilho da esquerda "+aux.getChildren().first().element().element()+
                                        "\nfilho da direita "+aux.getChildren().last().element().element());
                    break;
            }
        }

    }


    private TreeNode<Integer> criarFilho(TreeNode<Integer> p, int n) {

        PositionList<Position<Integer>> filhos;

        TreeNode<Integer> aux;

        // Obt�m os Filhos de p

        filhos = p.getChildren();

        // Cria um novo filho

        aux = new TreeNode<Integer>();

        aux.setElement(n);

        aux.setParent(p);

        aux.setChildren(new NodePositionList<Position<Integer>>());

        filhos.addLast(aux);

        return aux;

    }

}
