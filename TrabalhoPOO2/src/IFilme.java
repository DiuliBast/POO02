public interface IFilme {
    //cadastrar
    public abstract boolean addFilme(Filme f);

    //consultar
    public abstract Filme getFilme (String titulo);

    //editar
    public abstract boolean editarFilme (String titulo, String genero);

    //excluir
    public abstract boolean removeFime(String titulo);
}
