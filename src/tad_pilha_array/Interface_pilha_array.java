package tad_pilha_array;

import interfaces.Interface;
import tad_pilha_array.classes.ArrayStack;

import java.util.Scanner;

public class Interface_pilha_array {
    Interface opcoes = new Interface();

    public  void pilha(){
        ArrayStack<Integer> pilha = new ArrayStack<Integer>();
        String[] funcionalidadesArranjo = {
                "Sair",
                "Inserir",
                "Remover",
                "imprimir",
                "consultar número no topo da pilha"

        };
        boolean alternador = true;
        while (alternador) {
            Scanner entrada = new Scanner(System.in);
            int op = opcoes.menu(funcionalidadesArranjo);
            int indice = 0;
            int inserir = 0;
            switch (op) {
                case 0: // Sair
                    alternador = false;
                    break;
                case 1: // Inserir
                    System.out.println("Digite o numero que será inserido");
                    inserir = entrada.nextInt();
                    pilha.push(inserir);

                    //chamar metodo push para adicionar na pilha o numero 'inserir'
                    break;
                case 2: //remover
                    System.out.println("numero removido da pilha: "+pilha.pop());

                    //desempilha o item do topo da pilha e retorna ele no print
                    break;
                case 3: //imprimir
                    System.out.println(pilha.toString());
                    // chamar metodo para imprimir importado do TAD
                    break;
                case 4: //top
                    System.out.println("número que está no topo da pilha: "+pilha.top());
                    //printa o item que está no topo da pilha
                    break;
            }
        }

    }



}
