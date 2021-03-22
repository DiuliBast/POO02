public interface IFoto {
    //cadastrar
    public abstract boolean addFoto(Foto foto);

    //consultar
    public abstract Foto getFoto (String titulo);

    //editar
    public abstract boolean editarFoto (String titulo, String data);

    //excluir
    public abstract boolean removeFoto(String titulo);
}
