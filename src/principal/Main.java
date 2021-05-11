package principal;
import interfaces.Interface;
import  tad_arranjo.Interface_Arranjo;
import tad_mapa.Interface_mapa;
import tad_pilha_array.Interface_pilha_array;
import tad_pilha_LSE.Interface_pilha_LSE;
import tad_fila_array.Interface_fila_array;
import tad_fila_LSE.Interface_fila_LSE;
import tad_lista_de_nodos.Interface_lista_de_nodos;
import tad_arvore_generica.Interface_arvore_generica;
import tad_arvore_binaria.Interface_arvore_binaria;
import tad_lista_prioridade.Interface_lista_prioridade;

public class Main {
    public static void main(String[] args) {
	    escolheEstrutura();
    }
    public static void escolheEstrutura(){
        // Cria lista de estruturas para selecionar no menu
    	String[] estruturas = {
                "Sair",
                "TAD-Lista Arranjo", //OK
                "TAD-Pilha-Array", //OK
                "TAD-Pilha-LSE", //OK
                "TAD-Fila - Array", //OK
                "TAD-Fila - LSE", //OK
                "TAD-Lista de Nodos", // falta corrigir a remoção por busca
                "TAD-Árvore Genérica", // OK , necessario definir como será inserido
                "TAD-Árvore Binária", // OK, necessario inserir como será inserido
                "TAD-Fila de Prioridade", //OK
                "TAD-Mapa", //OK
                "TAD-Dicionário",
                "TAD-Mapa Ordenado – ABB",
                "TAD-Mapa Ordenado – AVL",
                "TAD-Grafos"
        };

        Interface opcoes = new Interface();
        Interface_Arranjo IArranjo = new Interface_Arranjo();
        Interface_pilha_array IPilhaArray = new Interface_pilha_array();
        Interface_pilha_LSE IPilhaLSE = new Interface_pilha_LSE();
        Interface_fila_array IFilaArray = new Interface_fila_array();
        Interface_fila_LSE IFilaLSE= new Interface_fila_LSE();
        Interface_lista_de_nodos IlistadeNodos = new Interface_lista_de_nodos();
        Interface_arvore_generica IArvoreGenerica = new Interface_arvore_generica();
        Interface_arvore_binaria IArvoreBinaria = new Interface_arvore_binaria();
        Interface_lista_prioridade IListaPrioridade = new Interface_lista_prioridade();
        Interface_mapa Imapa = new Interface_mapa();
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
                case 4:  // TAD-Fila - Array
                    IFilaArray.fila();
                    break;
                case 5: // TAD-Fila - LSE
                    IFilaLSE.fila();
                    break;
                case 6: // TAD-Lista de Nodos
                    IlistadeNodos.listaNodos();
                    break;
                case 7: // TAD-Árvore Genérica
                    IArvoreGenerica.arvoreGenerica();
                    break;
                case 8: // TAD-Árvore Binária
                    IArvoreBinaria.arvoreBinaria();
                    break;
                case 9: // TAD-Fila de Prioridade
                    IListaPrioridade.listaPrioridade();
                    break;
                case 10:   // TAD-Mapa
                    Imapa.mapa();
                    break;
                case 11: // TAD-Dicionário
                    break;
                case 12: // TAD-Mapa Ordenado – ABB
                    break;
                case 13: // TAD-Mapa Ordenado – AVL

                    break;
                case 14: // TAD-Grafos
                    break;
            }
        }
    }
}
