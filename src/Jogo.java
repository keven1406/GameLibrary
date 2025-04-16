import java.util.Objects;

public abstract class Jogo {
    //Atributo
    private String titulo;
    private String genero;
    private Integer anoLancamento;

    //Metodos
    public Jogo (String titulo, String genero, Integer anoLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public abstract void exibirInfo();

    @Override
    public String toString () {
        return "\nJogo:"+getTitulo()+" ("+getAnoLancamento()+") - "+getGenero();
    }
    @Override
    public boolean equals(Object obj) {
        //Teste se a referencia do objeto é a mesma que a deste objeto
        if (this == obj) return true;
        //Verifica se a referencia é nula ou se o tipo é o mesmo da classe.
        if (obj == null || getClass() != obj.getClass()) return false;

        Jogo outroJogo = (Jogo) obj;
        //Comparando se o titulo e o ano de lançamento é igual ao da outra instancia. Se sim retorna true;
        return this.titulo.equals(outroJogo.titulo) && this.anoLancamento.equals(outroJogo.anoLancamento);
    }
    @Override
    public int hashCode () {
        //Um inteiro será retornado baseado nos valores de titulo e anoLancamento;
        return Objects.hash(titulo, anoLancamento);
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

    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

}

