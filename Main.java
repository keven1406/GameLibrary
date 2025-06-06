import java.util.*;

//Fluxo principal do programa
public class Main {

    public static void main (String [] args) {
        System.out.println("My Game Library");
        System.out.println("===============");

        //Lista com jogos fisicos e digitais.
        List<JogoFisico> listaJogosFisicos = new ArrayList<>();
        List<JogoDigital> listaJogosDigitais = new ArrayList<>();

        //Variável condicional do loop
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        do {
            //MENU
            System.out.println("O que gostaria de fazer primeiro? " +
                    "\n1 - Adicionar um jogo" +
                    "\n2 - Ver biblioteca" +
                    "\n3 - Iniciar Jogo" +
                    "\n4 - Verificar Existencia" +
                    "\n5 - sair");

            //verifica se o numero realmente é um inteiro, se sim, atribui nextInt() a opcao.
            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
                if (opcao == 0 || opcao > 5) {
                    System.out.println("Você digitou uma opção inválida. Digite o número de uma opção descrita.");
                }
                //ADICIONAR JOGO FISICO OU DIGITAL
                else if (opcao == 1) {
                    System.out.println("Você deseja adicionar um jogo de mídia (1) física ou, (2) digital?");
                    if (sc.hasNextInt()) {
                        int fisicoOuDigital = sc.nextInt();
                        if (fisicoOuDigital == 1) {
                            sc.nextLine();
                            System.out.println("Digite o Titulo: ");
                            String titulo = sc.nextLine();
                            System.out.println("Digite o genero: ");
                            String genero = sc.nextLine();
                            System.out.println("Digite o ano de lançamento: ");
                            Integer dataLancamento = sc.nextInt();
                            System.out.println("Quantas mídias ele possui?");
                            int numeroMidias = sc.nextInt();
                            JogoFisico jogo = new JogoFisico(titulo, genero, dataLancamento, numeroMidias);
                            listaJogosFisicos.add(jogo);
                            System.out.println("Jogo adicionado com sucesso!");
                        } else if (fisicoOuDigital == 2) {
                            sc.nextLine();
                            System.out.println("Digite o Titulo: ");
                            String titulo = sc.nextLine();
                            System.out.println("Digite o genero: ");
                            String genero = sc.nextLine();
                            System.out.println("Digite o ano de lançamento:");
                            Integer dataLancamento = sc.nextInt();
                            System.out.println("Insira o tamanho em GB:");
                            int tamanhoGB = sc.nextInt();
                            JogoDigital jogo = new JogoDigital(titulo, genero, dataLancamento, tamanhoGB);
                            listaJogosDigitais.add(jogo);
                            System.out.println("Jogo adicionado com sucesso!");
                        } else {
                            System.out.println("Você solicitou uma opção inválida!");
                        }
                    }
                } else if (opcao == 2) {
                    System.out.println("Gostaria de ver a (1) lista completa ou o (2) estoque?");

                    if (sc.hasNextInt()) {
                        int op = sc.nextInt();
                        if (op == 1) {
                            HashSet<JogoDigital> jogosDigitaisSemDuplicata = new HashSet<>(listaJogosDigitais);
                            HashSet<JogoFisico> jogosFisicosSemDuplicata = new HashSet<>(listaJogosFisicos);
                            System.out.println("===============");
                            System.out.println("Todos os seus jogos Físicos: ");
                            System.out.println(jogosFisicosSemDuplicata);
                            System.out.println("Todos os seus jogos digitais: ");
                            System.out.println(jogosDigitaisSemDuplicata);
                            System.out.println("===============");
                        } else if (op == 2) {
                            System.out.println("================");
                            //Criando o estoque
                            HashMap<String, Integer> estoque = new HashMap<>();

                            //para cada jogo em listaJogosFisicos
                            for (JogoFisico jogo : listaJogosFisicos) {
                                String genero = jogo.getGenero();
                                estoque.put(genero, estoque.getOrDefault(genero, 0) + 1);
                            }
                            //para cada jogo em listaJogosDigitais
                            for (JogoDigital jogo : listaJogosDigitais) {
                                String genero = jogo.getGenero();
                                estoque.put(genero, estoque.getOrDefault(genero, 0) + 1);
                            }
                            //Exibindo o estoque
                            System.out.println("Estoque:");
                            for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
                                System.out.println(entry.getKey() + ": " + entry.getValue());
                            }
                        }
                    } else {
                        System.out.println("Digite uma opção valida!");
                    }
                }//INICIAR JOGO
                else if (opcao == 3) {
                    System.out.println("Deseja iniciar um jogo fisico ou digital? ");
                    sc.nextLine();
                    String escolha = sc.nextLine().toLowerCase();
                    if (escolha.equals("fisico")) {
                        System.out.println("Digite o nome do jogo:");
                        String nomeJogo = sc.nextLine().toLowerCase();
                        for (JogoFisico jogo : listaJogosFisicos) {
                            if (jogo.getTitulo().equalsIgnoreCase(nomeJogo)) {
                                jogo.iniciarJogo();
                            } else { System.out.println("Jogo não encontrado");}
                        }
                    } else if (escolha.equals("digital"))  {
                        System.out.println("Digite o nome do jogo:");
                        String nomeJogo = sc.nextLine().toLowerCase();
                        for (JogoDigital jogo : listaJogosDigitais) {
                            if (jogo.getTitulo().equalsIgnoreCase(nomeJogo)) {
                                jogo.iniciarJogo();
                            } else { System.out.println("Jogo não encontrado"); }
                        }
                    } else {
                        System.out.println("Você não digitou corretamente, tente novamente.");
                    }
                } else if(opcao == 4) {
                    System.out.println("Digite o nome do jogo que quer buscar: ");
                    sc.nextLine();
                    String nomeJogo = sc.nextLine().toLowerCase();

                    boolean existeJogo = false;

                    for (JogoDigital jogo : listaJogosDigitais) {
                        if (jogo.getTitulo().equalsIgnoreCase(nomeJogo)) {
                            System.out.println("O jogo '" + jogo.getTitulo() + "' Já existe;");
                            existeJogo = true;
                        }
                    }
                    if (existeJogo == false) {
                        for (JogoFisico jogo : listaJogosFisicos) {
                            if (jogo.getTitulo().equalsIgnoreCase(nomeJogo)) {
                                System.out.println("O jogo '" + jogo.getTitulo() + "' ("+jogo.getAnoLancamento()+") Já existe;");
                            }
                        }
                    }
                } else if (opcao == 5) {
                    break;
                }
            } else {
                System.out.println("Você não digitou um número.");
            }
            System.out.println("===============");

        } while (opcao != 5);
    }

}