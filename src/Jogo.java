public abstract class Jogo {
    //Atributo
    private String titulo;
    private String genero;
    private String anoLancamento;

    //Metodos
    public Jogo (String titulo, String genero, String anoLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public abstract void exibirInfo();

    @Override
    public String toString () {
        return "\nJogo: \nTitulo:"+titulo+",\ngenero: "+genero+",\n anoLancamento: "+anoLancamento+"\n";
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

    public String getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

}

