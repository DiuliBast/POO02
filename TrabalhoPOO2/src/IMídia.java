public interface IMídia {

    //cadastrar
    public abstract boolean addMidia(Mídia m);

    //consultar
    public abstract Mídia getMídia (String titulo);

    //editar
    public abstract boolean editarMídia (String titulo, Mídia nova);

    //excluir
    public abstract boolean removeMídia(String titulo);

    //Pesquisa música e filme por genero
    public abstract Mídia getMusicaFilme(String genero);




}
