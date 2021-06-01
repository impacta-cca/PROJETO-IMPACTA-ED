package tad_arvore_generica;

import interfaces.Interface;
import tad_arvore_generica.classes.LinkedTree;
import java.util.Scanner;
import tad_arvore_generica.classes.NodePositionList;

import tad_arvore_generica.classes.TreeNode;
import tad_arvore_generica.interfaces.*;

import static interfaces.Interface.titulo2;

public class  Interface_arvore_generica {
    Interface opcoes = new Interface();
    public void arvoreGenerica(){
        LinkedTree<Integer> ArvoreGenerica = new LinkedTree<Integer>();

        String[] funcionalidadesArranjo = {
                "Sair",
                "Criar árvore",
                "Desenhar árvore"
        };

        // Exibe título
        titulo2(" █████  ██████  ██    ██  ██████  ██████  ███████      ██████  ███████ ███    ██ ███████ ██████  ██  ██████  █████  \n" +
                "██   ██ ██   ██ ██    ██ ██    ██ ██   ██ ██          ██       ██      ████   ██ ██      ██   ██ ██ ██      ██   ██ \n" +
                "███████ ██████  ██    ██ ██    ██ ██████  █████       ██   ███ █████   ██ ██  ██ █████   ██████  ██ ██      ███████ \n" +
                "██   ██ ██   ██  ██  ██  ██    ██ ██   ██ ██          ██    ██ ██      ██  ██ ██ ██      ██   ██ ██ ██      ██   ██ \n" +
                "██   ██ ██   ██   ████    ██████  ██   ██ ███████      ██████  ███████ ██   ████ ███████ ██   ██ ██  ██████ ██   ██ ");

        System.out.println("Apresentação:\n" +
                "É o tipo mais genérico quando se trata da gama de TAD árvore, pois permite mais controle e\n" +
                "flexibilidade ao usuário em sua utilização. O nome que lhe foi dado está de acordo tanto com sua\n" +
                "aparência (pois quando desenhado á mão, pode-se notar que esta estrutura parece de fato uma árvore,\n" +
                "porém, de ponta-cabeça, sendo o topo a raiz, suas bifurcações os galhos, e os elementos mais\n" +
                "externos as folhas da árvore), quanto por seu modo de organização (que tem como grande\n" +
                "referência uma árvore genealógica).\n" +
                "\n" +
                "Como funciona ?\n" +
                "Diferente das listas, este é um tipo não linear e possui uma forma mais natural de organizar os\n" +
                "dados, indo além de “antes” e “depois”; ele possui relacionamentos hierárquicos, pois é definido em\n" +
                "nodos que ganham título de “pai”, “filho” e/ou “irmão (da esquerda ou da direita)” como metáfora,\n" +
                "deixando mais fácil de entender e visualizar sua estrutura. À título de informação, a raiz é o\n" +
                "elemento que estará no topo da hierarquia, pois será o “pai de todos”, e suas sub-árvores seguem\n" +
                "este mesmo padrão, em níveis mais baixos.\n" +
                "\n" +
                "O que ela pode fazer ?\n" +
                "O tipo árvore nos permite: armazenar elementos em posições como as de uma\n" +
                "lista, saber o valor armazenado em uma posição da árvore, retornar um iterador e um iterável de\n" +
                "nodos da árvore, substituir o valor armazenado em determinado elemento, retornando o valor antigo.\n" +
                "Saber: quem é sua raiz; quem é o pai de um elemento; quem é(são) o(s) filho(s) de um elemento; se\n" +
                "determinado elemento é interno, externo ou raíz; a quantidade de elementos armazenados na árvore;\n" +
                "se está vazia.\n" +
                "\n" +
                "Como faz cada função ?\n" +
                "- element: retorna o elemento armazenado nesta posição.\n" +
                "\n" +
                "- root: retorna a raiz da árvore; uma exceção é lançada se a árvore estiver vazia.\n" +
                "\n" +
                "- parent: retorna o nodo pai de um elemento; uma exceção é lançada se este elemento for a raiz.\n" +
                "\n" +
                "- children: retorna uma coleção iterável contendo os filhos de um nodo.\n" +
                "\n" +
                "- isInternal: indica se um nodo é ou não é interno.\n" +
                "\n" +
                "- isExternal: indica se um nodo é ou não é externo.\n" +
                "\n" +
                "- isRoot: indica se um nodo é ou não é a raiz.\n" +
                "\n" +
                "- size: retorna o número de nodos na árvore.\n" +
                "\n" +
                "- isEmpty: indica se a árvore está ou não está vazia.\n" +
                "\n" +
                "- iterator: retorna um iterador de todos os elementos armazenados nos nodos da árvore.\n" +
                "\n" +
                "- positions: retorna uma coleção iterável com todos os nodos da árvore.\n" +
                "\n" +
                "- replace: substitui o valor de um determinado elemento e retorna o valor antigo.\n");


        boolean alternador = true;
        while (alternador) {
            Scanner entrada = new Scanner(System.in);
            int op = opcoes.menu(funcionalidadesArranjo);
            int inserir = 0;
            String []lista;
            switch (op) {
                case 0: // Sair
                    alternador = false;
                    break;
                case 1: // caso de inserção na lista de nodos
                    System.out.println("Digite uma sequencia de 10 números separados por espaço: ");
                    String[] arvore = entrada.nextLine().split(" ");
                    ArvoreGenerica = criarArvoreExemplo(arvore);
                    System.out.println(ArvoreGenerica.parentheticRepresentation(ArvoreGenerica, ArvoreGenerica.root()));
                    break;
                case 2: //imprimir
                    System.out.println(ArvoreGenerica.parentheticRepresentation(ArvoreGenerica, ArvoreGenerica.root()));
                    // chamar metodo para imprimir importado do TAD
                    break;

            }
        }

    }


    private TreeNode<Integer> criarFilho(TreeNode<Integer> p, int n) {

        PositionList<Position<Integer>> filhos = p.getChildren();

        TreeNode<Integer> aux;

        // Obt�m os Filhos de p
        

        // Cria um novo filho

        aux = new TreeNode<Integer>();

        aux.setElement(n);

        aux.setParent(p);

        aux.setChildren(new NodePositionList<Position<Integer>>());

        filhos.addLast(aux);

        return aux;

    }

    private LinkedTree<Integer> criarArvoreExemplo(String[] num){

        LinkedTree<Integer> TreeExemplo = new LinkedTree<Integer>();
        TreeNode<Integer> raiz,feraiz,fdraiz, fferaiz,ffdraiz;
        TreeExemplo.addRoot(Integer.parseInt(num[0]));
        raiz =(TreeNode<Integer>) TreeExemplo.root();
        raiz.setChildren(new NodePositionList<Position<Integer>>());
        feraiz = criarFilho(raiz , Integer.parseInt(num[1]));
        fdraiz = criarFilho(raiz,Integer.parseInt(num[2]));
        fferaiz = criarFilho(feraiz,Integer.parseInt(num[3]));
        ffdraiz= criarFilho(feraiz,Integer.parseInt(num[4]));
        criarFilho(fdraiz,Integer.parseInt(num[5]));
        criarFilho(fdraiz,Integer.parseInt(num[6]));
        criarFilho(fferaiz,Integer.parseInt(num[7]));
        criarFilho(fferaiz,Integer.parseInt(num[8]));
        criarFilho(ffdraiz,Integer.parseInt(num[9]));
        return  TreeExemplo;
    }
}
