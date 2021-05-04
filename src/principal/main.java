package principal;
import interfaces.Interface;

import java.util.Scanner;

public class main {
	Interface opcoes = new Interface();

	String[] estruturas = {
            "Sair",
            "TAD-Lista Arranjo",
            "TAD-Pilha",
            "TAD-Fila",
            "TAD-Lista de Nodos",
            "TAD-Árvore Genérica",
            "TAD-Árvore Binária",
            "TAD-Fila de Prioridade",
            "TAD-Mapa",
            "TAD-Dicionário",
            "TAD-Mapa Ordenado – ABB",
            "TAD-Mapa Ordenado – AVL",
            "TAD-Grafos"
    };

    String[] funcionalidades = {
            "Sair",
            "Inserir",
            "Remover",
            "Imprimir"
    };

    public static void main(String[] args) {
	//escolheEstrutura();
    }

    public void escolheEstrutura(){
		Scanner entrada = new Scanner(System.in);
	    int opcaoEscolhida = opcoes.menu(estruturas);
        switch (opcaoEscolhida){
		    case 0:
				System.exit(-1);
                break;
            case 1: // TAD-Lista Arranjo
                break;
            case 2: // TAD - Pilha
			boolean alternador = true;
				while(alternador){
					int op = opcoes.menu(funcionalidades);
					switch (op){
						case 0: // Sair
						alternador = false;
						break;
						case 1: // Inserir
						int inserir = entrada.nextInt();
						   //chamar metodo do TAD para inserção com o parametro a variavel 'inserir'
						break;
						case 2: //remover
						int remover = entrada.nextInt();
                            //chamar metodo do TAD para inserção com o parametro a variavel 'remover'
						break;
						case 3: //imprimir
						 // chamar metodo para imprimir importado do TAD
						break;
                    }
				}
                break;
            case 3: // TAD-Fila
                break;
            case 4: // TAD-Lista de Nodos
                break;
            case 5: // TAD-Árvore Genérica
                break;
            case 6: // TAD-Árvore Binária
                break;
            case 7: // TAD-Fila de Prioridade
                break;
            case 8: // TAD-Mapa
                break;
			case 9: // TAD-Dicionário
                break;
            case 10: // TAD-Mapa Ordenado – ABB
                break;
            case 11: // TAD-Mapa Ordenado – AVL
                break;
            case 12: // TAD-Grafos
                break;
          }





    }

}
