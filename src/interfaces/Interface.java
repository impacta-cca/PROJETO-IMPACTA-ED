package interfaces;

import java.util.Scanner;


public class Interface {
    public int menu(String[] itens) {
        System.out.println("Escolha entre as opções abaixo: ");
        for (int i = 0; i < itens.length; i++) {
            System.out.println("["+ i + "]" + " " + itens[i]);
        }
        Scanner entrada = new Scanner(System.in);
        int saida = -1;
        while (saida > itens.length || saida < 0) {
            saida = entrada.nextInt();
            if (saida > itens.length || saida < 0) {
                System.out.println("Escolha entre as opções apresentadas acima:");
            }
        }
        return saida;
    }

    public static void titulo(String frase) {
        System.out.println("===========" + frase + "===========");
    }


    public static void titulo2(String frase) {
        // Exibe titulo do menu
        System.out.println("============================================================================================================================================");
        System.out.println(frase);
        System.out.println("============================================================================================================================================");
    }
}