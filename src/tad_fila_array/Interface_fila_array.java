package tad_fila_array;

import interfaces.Interface;
import tad_fila_array.classes.ArrayQueue;

import java.util.Scanner;

public class Interface_fila_array {
    Interface opcoes = new Interface();

    public void fila(){
        System.out.println("Digite o tamanho da fila: ");
        Scanner entrada1 = new Scanner(System.in);
        int tamanho = entrada1.nextInt();
        ArrayQueue<Integer> fila = new ArrayQueue<Integer>(tamanho);

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
            int indice = 0;
            int inserir = 0;
            switch (op) {
                case 0: // Sair
                    alternador = false;
                    break;
                case 1: // Inserir
                    System.out.println("Digite o numero que será inserido");
                    inserir = entrada.nextInt();
                    fila.enqueue(inserir);
                    // chama o metodo enqueue para enfileirar dentro da fila
                    break;
                case 2: //remover
                    System.out.println("o número que foi removido da fila é o "+fila.dequeue());

                   //chama o metodo dequeue para retirar o primeiro numero da fila
                    break;
                case 3: //imprimir
                    System.out.println(fila.toString());
                    // chamar metodo para imprimir importado do TAD
                    break;
            }
        }

    }
}
