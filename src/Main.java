import java.util.*;

//Fluxo principal do programa
public class Main {
    public void main (String [] args) {
        System.out.println("My Game Library");
        System.out.println("===============");
        List <Jogo> listaDeJogos = new ArrayList<>();

        //Variável condicional do loop
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        do {
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
            }
            else if (opcao == 1) {
                System.out.println("Digite o Titulo: ");
                String titulo = sc.nextLine();
                System.out.println("Digite o genero: ");
                String genero = sc.nextLine();
                System.out.println("Digite a data de lancamento no seguinte formato dd/mm/yyyy: ");
                String dataLancamento = sc.nextLine();
                Jogo novoJogo = new Jogo(titulo, genero, dataLancamento); //Existe um erro de dominio aqui.
                //O cliente precisa dizer se o jogo é midia fisica ou digital.
            }

            else {
                System.out.println("Você não digitou um número.");
            }


        } while (opcao != 3);


    }
}

