import java.util.*;

//Fluxo principal do programa
public class Main {

    public static void main (String [] args) {
        System.out.println("My Game Library");
        System.out.println("===============");

        //Lista com jogos fisicos e digitais.
        List <JogoFisico> listaJogosFisicos = new ArrayList<>();
        List <JogoDigital> listaJogosDigitais = new ArrayList<>();

        //Variável condicional do loop
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        do {
            //MENU
            System.out.println("O que gostaria de fazer primeiro? " +
                    "\n1 - adicionar um jogo" +
                    "\n2 - ver biblioteca" +
                    "\n3 - sair");

            //verifica se o numero realmente é um inteiro, se sim, atribui nextInt() a opcao.
            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
                if (opcao == 0 || opcao > 3) {
                    System.out.println("Você digitou uma opção inválida. Digite o número de uma opção descrita.");
                }
                //ADICIONAR JOGO FISICO OU DIGITAL
                else if (opcao == 1) {
                    System.out.println("Você deseja adicionar um jogo de mídia (1) física, (2) digital?");
                    if (sc.hasNextInt()) {
                        int fisicoOuDigital = sc.nextInt();
                        if (fisicoOuDigital == 1) {
                            sc.nextLine();
                            System.out.println("Digite o Titulo: ");
                            String titulo = sc.nextLine();
                            System.out.println("Digite o genero: ");
                            String genero = sc.nextLine();
                            System.out.println("Digite a data de lancamento no seguinte formato dd/mm/yyyy: ");
                            String dataLancamento = sc.nextLine();
                            System.out.println("Quantas mídias ele possui?");
                            int numeroMidias = sc.nextInt();
                            JogoFisico jogo = new JogoFisico(titulo, genero, dataLancamento, numeroMidias);
                            listaJogosFisicos.add(jogo);
                            System.out.println("Jogo adicionado com sucesso!");
                        }
                        else if (fisicoOuDigital == 2) {
                            sc.nextLine();
                            System.out.println("Digite o Titulo: ");
                            String titulo = sc.nextLine();
                            System.out.println("Digite o genero: ");
                            String genero = sc.nextLine();
                            System.out.println("Digite a data de lancamento no seguinte formato dd/mm/yyyy: ");
                            String dataLancamento = sc.nextLine();
                            System.out.println("Insira o tamanho em GB:");
                            int tamanhoGB = sc.nextInt();
                            JogoDigital jogo = new JogoDigital(titulo, genero, dataLancamento, tamanhoGB);
                            listaJogosDigitais.add(jogo);
                            System.out.println("Jogo adicionado com sucesso!");
                        }
                        else {System.out.println("Você solicitou uma opção inválida!");}
                    }
                } else if (opcao == 2) {
                    System.out.println("Gostaria de ver a (1) lista completa ou o (2) estoque?");

                    if (sc.hasNextInt()) {
                        int op = sc.nextInt();
                        if (op == 1) {
                            HashSet<JogoDigital> jogosDigitaisSemDuplicata = new HashSet<> (listaJogosDigitais);
                            HashSet<JogoFisico> jogosFisicosSemDuplicata = new HashSet<> (listaJogosFisicos);
                            System.out.println("===============");
                            System.out.println("Todos os seus jogos Físicos: ");
                            System.out.println(jogosFisicosSemDuplicata);
                            System.out.println("Todos os seus jogos digitais: ");
                            System.out.println(jogosDigitaisSemDuplicata);
                            System.out.println("===============");
                        }
                    } else {
                        System.out.println("Digite uma opção valida!");
                    }
                } else if (opcao == 3) {
                    break;
                }
            } else {
                System.out.println("Você não digitou um número.");
            }
            System.out.println("===============");

        } while (opcao != 3);


    }
}

