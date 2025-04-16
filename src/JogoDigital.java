import java.util.Calendar;

public class JogoDigital extends Jogo implements Jogavel {
    //Atributos
    private int tamanhoGB;

    //Metodos
    public JogoDigital (String titulo, String genero, Integer anoLancamento, int tamanhoGB) {
        super(titulo, genero, anoLancamento);
        this.tamanhoGB = tamanhoGB;
    }
    @Override
    public String toString () {
        return "\nJogo: "+getTitulo()+",\ngenero: "+getGenero()+",\nanoLancamento: "+getAnoLancamento()+"\nTamanho em GB: "+ this.tamanhoGB;
    }
    @Override
    public void iniciarJogo() {
        System.out.println("Iniciando jogo digital:");
    }
    @Override
    public void exibirInfo() {
        System.out.println(this.toString() + "\nTamanho GB: "+ this.tamanhoGB);
    }
    public void setTamanhoGB (int tamanhoGB) {
        this.tamanhoGB = tamanhoGB;
    }
    public int getTamanhoGB() {
        return tamanhoGB;
    }
}