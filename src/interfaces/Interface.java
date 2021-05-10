package interfaces;

import java.util.Scanner;


public class Interface {
    public int menu(String[] itens) {
        for (int i = 0; i < itens.length; i++) {
            System.out.println(i + " - " + itens[i]);
        }
        System.out.println("Escolha o número entre as opções: ");
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

    public void titulo(String frase) {
        System.out.println("===========" + frase + "===========");
    }  
}