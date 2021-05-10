package principal;
import interfaces.Interface;
import  tad_arranjo.Interface_Arranjo;
import tad_pilha_array.Interface_pilha_array;
import tad_pilha_LSE.Interface_pilha_LSE;

public class Main {
    public static void main(String[] args) {
	    escolheEstrutura();
    }
    public static void escolheEstrutura(){
        // Cria lista de estruturas para selecionar no menu
    	String[] estruturas = {
                "Sair",
                "TAD-Lista Arranjo",
                "TAD-Pilha-Array",
                "TAD-Pilha-LSE",
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

        Interface opcoes = new Interface();
        Interface_Arranjo IArranjo = new Interface_Arranjo();
        Interface_pilha_array IPilhaArray = new Interface_pilha_array();
        Interface_pilha_LSE IPilhaLSE = new Interface_pilha_LSE();
        while (true) {
            int opcaoEscolhida = opcoes.menu(estruturas);
            switch (opcaoEscolhida) {
                case 0:
                    System.exit(-1);
                    break;
                case 1: // TAD-Lista Arranjo
                    IArranjo.arranjo();
                    break;
                case 2: // TAD - Pilha - Array
                    IPilhaArray.pilha();
                    break;
                case 3:  // TAD - Pilha - LSE
                    IPilhaLSE.pilha();
                    break;
                case 4:  // TAD-Fila
                    break;
                case 5: // TAD-Lista de Nodos
                    break;
                case 6: // TAD-Árvore Genérica
                    break;
                case 7: // TAD-Árvore Binária
                    break;
                case 8: // TAD-Fila de Prioridade
                    break;
                case 9: // TAD-Mapa
                    break;
                case 10:  // TAD-Dicionário
                    break;
                case 11:// TAD-Mapa Ordenado – ABB
                    break;
                case 12: // TAD-Mapa Ordenado – AVL
                    break;
                case 13: // TAD-Grafos
                    break;
            }
        }
    }
}
