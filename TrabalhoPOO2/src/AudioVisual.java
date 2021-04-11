public abstract class AudioVisual extends Mídia {

    private String genero;
    private String idioma;
    private String duração;
    private String ano;

    public AudioVisual(String titulo, String descricao, String caminho, String genero, String idioma, String duração, String ano ) {
    super(titulo, descricao, caminho);
        this.genero = genero;
        this.idioma = idioma;
        this.duração = duração;
        this.ano = ano;

    }

    public AudioVisual(){

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDuração() {
        return duração;
    }

    public void setDuração(String duração) {
        this.duração = duração;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

}


