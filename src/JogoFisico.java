import java.util.Calendar;
public class JogoFisico extends Jogo implements Jogavel {
    //Atributos
    private int numeroMidias;

    //Metodos
    public JogoFisico (String titulo, String genero, String anoLancamento, int numeroMidias) {
        super(titulo, genero, anoLancamento);
        this.numeroMidias = numeroMidias;
    }
    @Override
    public String toString () {
        return "\nJogo: thirulipa \nTitulo:"+getTitulo()+",\ngenero: "+getGenero()+",\nanoLancamento: "+getAnoLancamento()+"\nnumeroMidias: "+ this.numeroMidias;
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
