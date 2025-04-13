import java.util.Calendar;

public abstract class Jogo {
    //Atributo
    private String titulo;
    private String genero;
    private Calendar anoLancamento;

    //Metodos
    public Jogo (String titulo, String genero, Calendar anoLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public abstract void exibirInfo();

    @Override
    public String toString () {
        return "Jogo: \nTitulo:"+titulo+",\ngenero: "+genero+",\n anoLancamento: "+anoLancamento+"\n";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Calendar getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(Calendar anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

}

