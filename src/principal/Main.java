package principal;
import interfaces.Interface;
import tad_arranjo.Interface_Arranjo;
import tad_dicionario.Interface_dicionario;
import tad_mapa.Interface_mapa;
import tad_mapa_ordenado_abb.Interface_mapa_ordenado_abb;
import tad_mapa_ordenado_avl.Interface_mapa_avl;
import tad_pilha_array.Interface_pilha_array;
import tad_pilha_LSE.Interface_pilha_LSE;
import tad_fila_array.Interface_fila_array;
import tad_fila_LSE.Interface_fila_LSE;
import tad_lista_de_nodos.Interface_lista_de_nodos;
import tad_arvore_generica.Interface_arvore_generica;
import tad_arvore_binaria.Interface_arvore_binaria;
import tad_lista_prioridade.Interface_lista_prioridade;

import static interfaces.Interface.titulo;
import static interfaces.Interface.titulo2;

public class Main {
    public static void main(String[] args) {
	    escolheEstrutura();
    }
    public static void escolheEstrutura(){
        // Cria lista de estruturas para selecionar no menu
    	String[] estruturas = {
                "Sair",
                "Lista Arranjo", //OK
                "Pilha (Array)", //OK
                "Pilha (LSE)", //OK
                "Fila (Array)", //OK
                "Fila (LSE)", //OK
                "Lista de Nodos", // falta corrigir a remoção por busca
                "Árvore Genérica", // OK , necessario definir como será inserido
                "Árvore Binária", // OK, necessario inserir como será inserido
                "Fila de Prioridade", //OK
                "Mapa", //OK
                "Dicionário", //OK
                "Mapa Ordenado (ABB)", //OK
                "Mapa Ordenado (AVL)", //OK
                "Grafos"
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
        Interface_dicionario IDict = new Interface_dicionario();
        Interface_mapa_ordenado_abb IMapaABB = new Interface_mapa_ordenado_abb();
        Interface_mapa_avl IMapaAVl = new Interface_mapa_avl();


        //Chama menu para escolher estrutura de dados para exibir informações
        while (true) {
            titulo2("███████ ███████ ████████ ██████  ██    ██ ████████ ██    ██ ██████   █████      ██████  ███████     ██████   █████  ██████   ██████  ███████ \n" +
                    "██      ██         ██    ██   ██ ██    ██    ██    ██    ██ ██   ██ ██   ██     ██   ██ ██          ██   ██ ██   ██ ██   ██ ██    ██ ██      \n" +
                    "█████   ███████    ██    ██████  ██    ██    ██    ██    ██ ██████  ███████     ██   ██ █████       ██   ██ ███████ ██   ██ ██    ██ ███████ \n" +
                    "██           ██    ██    ██   ██ ██    ██    ██    ██    ██ ██   ██ ██   ██     ██   ██ ██          ██   ██ ██   ██ ██   ██ ██    ██      ██ \n" +
                    "███████ ███████    ██    ██   ██  ██████     ██     ██████  ██   ██ ██   ██     ██████  ███████     ██████  ██   ██ ██████   ██████  ███████");
            int opcaoEscolhida = opcoes.menu(estruturas);
            switch (opcaoEscolhida) {
                case 0:
                    titulo2("            ███████ ██ ███    ███     ██████   ██████      ██████  ██████   ██████   ██████  ██████   █████  ███    ███  █████              \n" +
                            "            ██      ██ ████  ████     ██   ██ ██    ██     ██   ██ ██   ██ ██    ██ ██       ██   ██ ██   ██ ████  ████ ██   ██             \n" +
                            "            █████   ██ ██ ████ ██     ██   ██ ██    ██     ██████  ██████  ██    ██ ██   ███ ██████  ███████ ██ ████ ██ ███████             \n" +
                            "            ██      ██ ██  ██  ██     ██   ██ ██    ██     ██      ██   ██ ██    ██ ██    ██ ██   ██ ██   ██ ██  ██  ██ ██   ██             \n" +
                            "            ██      ██ ██      ██     ██████   ██████      ██      ██   ██  ██████   ██████  ██   ██ ██   ██ ██      ██ ██   ██             ");
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
                    IDict.dicionario();
                    break;
                case 12: // TAD-Mapa Ordenado – ABB
                    IMapaABB.mapaOrdenadoABB();
                    break;
                case 13: // TAD-Mapa Ordenado – AVL
                    IMapaAVl.mapaOrdenadoAVL();
                    break;
                case 14: // TAD-Grafos
                    break;
            }
        }
    }
}
