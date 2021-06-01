package tad_arranjo;

import java.util.Scanner;
import interfaces.*;
import tad_arranjo.classes.ArrayIndexList;

import static interfaces.Interface.titulo2;

public class Interface_Arranjo {
    Interface opcoes = new Interface();
    ArrayIndexList<Integer> arranjo = new ArrayIndexList<Integer>();
    public void arranjo() {

        String[] funcionalidadesArranjo = {
                "Sair",
                "Inserir",
                "Remover",
                "printar lista",
                "consultar número"
        };

        // Exibe titulo
        titulo2("██      ██ ███████ ████████  █████       █████  ██████  ██████   █████  ███    ██      ██  ██████  \n" +
                "██      ██ ██         ██    ██   ██     ██   ██ ██   ██ ██   ██ ██   ██ ████   ██      ██ ██    ██ \n" +
                "██      ██ ███████    ██    ███████     ███████ ██████  ██████  ███████ ██ ██  ██      ██ ██    ██ \n" +
                "██      ██      ██    ██    ██   ██     ██   ██ ██   ██ ██   ██ ██   ██ ██  ██ ██ ██   ██ ██    ██ \n" +
                "███████ ██ ███████    ██    ██   ██     ██   ██ ██   ██ ██   ██ ██   ██ ██   ████  █████   ██████  ");


        // Explicação da estrutura
        System.out.println("O que é:\n" +
                            "Uma lista arranjo (também chamado de vetor) como seu nome já sugere, é o “casamento” entre listas e\n" +
                            "arranjos, trazendo os diferentes benefícios de ambos em um único TAD. Esta é uma estrutura de dados\n" +
                            "que permite que seja armazenado em uma coleção, n elementos, de tal modo a preservar principalmente\n" +
                            "a flexibilidade de seu tamanho de armazenamento, mantendo uma contagem dinâmica que auxilia em seu\n" +
                            "indexamento.");
        System.out.println();
        System.out.println("Como funciona?\n" +
                            "O acesso, remoção e modificação dos elementos é feito a partir de seu índice, no qual utiliza-se um\n" +
                            "inteiro par,a determiná-lo em uma contagem linear de números naturais, devendo estar no intervalo\n" +
                            "entre 0 e n-1, sendo n a quantidade de itens armazenados na coleção. É importante ressaltar que os\n" +
                            "índices começam no valor zero, tal que, seu primeiro elemento será referenciado pelo índice zero, e\n" +
                            "não um; é justamente por esse motivo que utiliza-se n-1 como índice para o último elemento da lista\n" +
                            "arranjo. ");
        System.out.println();
        System.out.println("O que pode fazer?\n" +
                            "Este tipo abstrato de dado lhe permite: pegar o valor armazenado em um elemento da coleção, alterar\n" +
                            "este valor, removê-lo, tanto como adicionar um novo.");

        //abertura do menu
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
                        System.out.println("add:\n" +
                                "esse método insere um elemento novo na coleção, na posição do índice informado. Caso o usuário" +
                                "\nqueira inserir um elemento em uma posição já ocupada, o novo elemento assume a posição desejada e" +
                                "\nempurra seus posteriores para uma posição adiante.");
                        System.out.println("Digite o numero que será inserido: ");
                        inserir = entrada.nextInt();
                        System.out.println("Digite a posição que será inserido:  ");
                        indice = entrada.nextInt()-1;
                        try{
                            arranjo.add(indice, inserir);
                        }catch (Exception e) {
                            System.out.println("ERRO: Índice digitado menor ou igual a 0 ou é maior que 16.");

                        }
                        //chamar metodo do TAD para inserção com o parametro a variavel 'inserir'
                        break;
                    case 2: //remover

                        System.out.println("remove:\n" +
                                "esse método remove da coleção o elemento pertencente ao índice informado. Caso o usuário remova um\n" +
                                "elemento diferente do último, os elementos anteriores são deslocados para ocupar a posição vazia, puxando-os para uma posição anterior.\n");
                        System.out.println("Digite a posição do numero que será removido");
                        indice = entrada.nextInt()-1;
                        try {
                            arranjo.remove(indice);
                        }catch (Exception e){
                            System.out.println("ERRO: Índice digitado menor ou igual a 0 ou é maior que 16.");
                        }
                        //chamar metodo do TAD para inserção com o parametro a variavel 'remover'
                        break;
                    case 3: //imprimir
                        System.out.println(arranjo.toString());
                        // chamar metodo para imprimir importado do TAD
                        break;
                    case 4:
                        System.out.println("qual número deseja procura na lista de nodo");
                        int procurar = entrada.nextInt();
                        boolean achado = false;
                        int posicao = 0;
                        for (int i = 0; i < arranjo.size(); i++) {
                            if (arranjo.get(i) == procurar) {
                               achado = true;
                               posicao =i;
                            }
                        }
                        if(achado = true) {
                            System.out.println("O número " + procurar + " está na posição " + (posicao+1)+ " no arranjo");

                        }else{
                        System.out.println("O número não foi encontrado no arranjo");
                        }
                }
        }
    }
}
