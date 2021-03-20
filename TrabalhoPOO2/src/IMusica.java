public interface IMusica {
    //cadastrar
    public abstract boolean addMusica(Musica m);

    //consultar
    public abstract Musica getMusica (String titulo);

    //editar
    public abstract boolean editarMusica (String titulo, String genero);

    //excluir
    public abstract boolean removeMusica(String titulo);
}
