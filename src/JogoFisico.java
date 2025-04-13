import java.util.Calendar;
public class JogoFisico extends Jogo implements Jogavel {
    //Atributos
    int numeroMidias;

    //Metodos
    public JogoFisico (String titulo, String genero, Calendar anoLancamento, int numeroMidias) {
        super(titulo, genero, anoLancamento);
        this.numeroMidias = numeroMidias;
    }
    @Override
    public void exibirInfo() {
        System.out.println(this.toString() + "\nnumeroMidias: " + numeroMidias);
    }
    @Override
    public void iniciarJogo () {
        System.out.println("Iniciando jogo Fisico: ");
    }

    public int getNumeroMidias() {
        return numeroMidias;
    }
    public void setNumeroMidias (int numeroMidias) {
        this.numeroMidias = numeroMidias;
    }
}
