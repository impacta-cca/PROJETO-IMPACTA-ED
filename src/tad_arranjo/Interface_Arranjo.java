package tad_arranjo;

import java.util.Scanner;
import interfaces.*;

public class Interface_Arranjo {
    Interface opcoes = new Interface();

    public void arranjo() {
        ArrayIndexList<Integer> arranjo = new ArrayIndexList<Integer>();
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
                    System.out.println("Digite a posição que será inserido");
                     indice = entrada.nextInt();
                    arranjo.add(indice,inserir);
                    //chamar metodo do TAD para inserção com o parametro a variavel 'inserir'
                    break;
                case 2: //remover
                    System.out.println("Digite a posição do numero que será removido");
                     indice = entrada.nextInt();
                    arranjo.remove(indice);
                    //chamar metodo do TAD para inserção com o parametro a variavel 'remover'
                    break;
                case 3: //imprimir
                    System.out.println(arranjo.toString());
                    // chamar metodo para imprimir importado do TAD
                    break;
            }
        }

    }
}
