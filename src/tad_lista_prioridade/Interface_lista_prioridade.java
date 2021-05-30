package tad_lista_prioridade;

import interfaces.Interface;
import tad_lista_prioridade.classes.SortedListPriorityQueue;


import java.util.Scanner;

import static interfaces.Interface.titulo2;

public class Interface_lista_prioridade {
    Interface opcoes = new Interface();
    public void listaPrioridade(){
        SortedListPriorityQueue<Integer,Integer> ListaPrioridade = new SortedListPriorityQueue<Integer, Integer>();

        String[] funcionalidades = {
                "Sair",
                "Inserir",
                "Remover",
                "imprimir",
        };

        // Exibe título
        titulo2("███████ ██ ██       █████      ██████  ███████     ██████  ██████  ██  ██████  ██████  ██ ██████   █████  ██████  ███████ \n" +
                "██      ██ ██      ██   ██     ██   ██ ██          ██   ██ ██   ██ ██ ██    ██ ██   ██ ██ ██   ██ ██   ██ ██   ██ ██      \n" +
                "█████   ██ ██      ███████     ██   ██ █████       ██████  ██████  ██ ██    ██ ██████  ██ ██   ██ ███████ ██   ██ █████   \n" +
                "██      ██ ██      ██   ██     ██   ██ ██          ██      ██   ██ ██ ██    ██ ██   ██ ██ ██   ██ ██   ██ ██   ██ ██      \n" +
                "██      ██ ███████ ██   ██     ██████  ███████     ██      ██   ██ ██  ██████  ██   ██ ██ ██████  ██   ██ ██████  ███████ ");


        // Exibe explicação da estrutura
        System.out.println("Apresentação:\n" +
                "Este tipo é uma especialização do TAD fila, que assim como tal, armazena uma coleção de elementos,\n" +
                "porém sua sequencialidade dá-se através não por ordem de inserção, mas sim pelo nível de preferência\n" +
                "que o usuário irá definir junto ao elemento que quer inserir, o que será um tipo de “chave” para\n" +
                "obter o elemento. Quanto menor for o número, mais prioridade na fila o elemento terá. A fila de\n" +
                "prioridades, portanto, também não conhece posições, apenas níveis prioritários.\n" +
                "\n" +
                "Como funciona ?\n" +
                "As posições desse TAD são organizadas crescentemente de forma automática entre as inserções, de\n" +
                "acordo com suas prioridades. Para a remoção, retiramos o elemento com a menor chave, isto é, quem\n" +
                "tiver a maior prioridade, é quem sairá primeiro. \n" +
                "\n" +
                "O que ela pode fazer ?\n" +
                "Esta estrutura lhe permite: inserir elementos na fila, remover, verificar: qual é o tamanho\n" +
                "(quantidade de elementos) da fila, se a fila está vazia e quem é o elemento com menor chave (maior\n" +
                "prioridade).\n" +
                "\n" +
                "Como faz cada função ?\n" +
                "- size: retorna a quantidade de elementos armazenados na fila.\n" +
                "\n" +
                "- isEmpty: indica se a fila está ou não está vazia.\n" +
                "\n" +
                "- min: informa ao usuário qual é o elemento pertencente à chave com menor valor.\n" +
                "Uma exceção é lançada se a fila estiver vazia.\n" +
                "\n" +
                "- insert: insere na lista um par chave + valor e retorna a entrada armazenada. Uma é lançada se a\n" +
                "chave informada for inválida (se ela não for comparável com outras chaves).\n" +
                "\n" +
                "- removeMin: remove e retorna da lista a entrada que possuir a menor chave. Uma exceção é lançada se\n" +
                "a fila estiver vazia.\n");


        boolean alternador = true;
        while (alternador) {
            Scanner entrada = new Scanner(System.in);
            int op = opcoes.menu(funcionalidades);
            int inserir = 0;
            int key;
            switch (op) {
                case 0: // Sair
                    alternador = false;
                    break;
                case 1: // o caso de inserção pede para o usuario uma chave do tipo inteiro e um numero do tipo inteiro, e assim, usa o metodo insert
                        // da ListaPrioridade para inseri-los na lista.
                    System.out.println("Digite o numero que será inserido");
                    inserir = entrada.nextInt();
                    System.out.println("Digite uma chave para o número que será inserido");
                    key = entrada.nextInt();

                    ListaPrioridade.insert(key,inserir);
                    System.out.println("foi inserido na lista de prioridades o número "+inserir+" que possui a chave "+key);
                    break;
                case 2:
                    System.out.println("item com menor chave removido da lista: "+ListaPrioridade.removeMin().getValue());
                    break;
                case 3: //imprimir
                    System.out.println(ListaPrioridade.toString());
                    // chamar metodo para imprimir importado do TAD
                    break;
            }
        }
    }
}
