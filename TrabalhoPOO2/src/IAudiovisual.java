public interface IAudiovisual {
    //cadastrar
    public abstract boolean addFilme(Filme f);

    //consultar
    public abstract Filme getFilme (String titulo);

    //editar
    public abstract boolean editarFilme (String titulo, String genero);

    //excluir
    public abstract boolean removeFime(String titulo);

    //cadastrar
    public abstract boolean addMusica(Musica m);

    //consultar
    public abstract Musica getMusica (String titulo);

    //editar
    public abstract boolean editarMusica (String titulo, String genero);

    //excluir
    public abstract boolean removeMusica(String titulo);
}
