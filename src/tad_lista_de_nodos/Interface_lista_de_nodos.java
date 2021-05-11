package tad_lista_de_nodos;

import interfaces.Interface;
import tad_lista_de_nodos.classes.NodePositionList;
import tad_lista_de_nodos.interfaces.Position;
import tad_lista_de_nodos.interfaces.PositionList;

import java.util.Iterator;
import java.util.Scanner;

public class Interface_lista_de_nodos {
    Interface opcoes = new Interface();

    public void listaNodos(){
        NodePositionList<Integer> listaNodos = new NodePositionList<Integer>();

        String[] funcionalidadesArranjo = {
                "Sair",
                "Inserir",
                "Remover",
                "Consultar",

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
                    // caso a lista esteja vazia, é inserido na primeira posição o número digitado pelo usuário
                    if(listaNodos.isEmpty()){
                        listaNodos.addFirst(inserir);
                        System.out.println("O primeiro item add a lista foi o "+inserir);
                    }
                    //caso a lista tenha pelo menos 1 item na lista,o item é inserido na ultima posição apos o ultimo item da lista(caso tenha 1, será inserido na posição 2)
                    else{
                        listaNodos.addLast(inserir);
                    }

                    break;
                case 2: // cria uma Position remover que recebera  a primeira posição da lista de nodos e caso o elemento dele seja igual a o numero
                        // digitado pelo usuario, ira usar o metodo de remoção do lista nodo com ele, senão, ele passará para a proxima posição
                    System.out.println("Digite o numero que será removido: ");
                    int remover = entrada.nextInt();
                    Position<Integer> posremover = listaNodos.find(remover);
                    if(posremover.equals(null)){
                        System.out.println("numero não encontrado");
                    }
                    else {
                        System.out.println("numero removido: "+listaNodos.remove(posremover));

                    }

                    break;
                case 3: //imprimir
                    System.out.println(listaNodos.toString());
                    System.out.println("ultimo item da lista: "+listaNodos.last().element());
                    // chamar metodo para imprimir importado do TAD
                    break;
            }
        }
    }
}
