import java.io.Serializable;

public class Musica extends AudioVisual implements Serializable {
String autores;
String interpretes;

public Musica (String titulo, String descricao, String caminho, String genero, String idioma, String duração, String ano, String autores, String interpretes){
    super(titulo, descricao, caminho, genero, idioma, duração,ano);
    this.autores=autores;
    this.interpretes= interpretes;

}
public Musica (){

}
public String getAutores(){
    return autores;
}
public void setAutores(String autores){
    this.autores=autores;
}
public String getInterpretes(){
    return interpretes;
}
public void setInterpretes(String interpretes){
    this.interpretes=interpretes;
}

    public String toString() {
        return  " " + "\n" +
                " ------------- (MÚSICA) ----------- " + "\n" +
                "Título = " + getTitulo() + "\n" +
                "Descrição = " + getDescricao() + "\n" +
                "Caminho = " + getCaminho() + "\n" +
                "Gênero = " + getGenero() + "\n" +
                "Idioma = " + getIdioma() + "\n" +
                "Duração = " + getDuração() + "\n" +
                "Ano = " + getAno() + "\n" +
                "Autores = " + autores + "\n" +
                "Interpretes = " + interpretes + "\n" +
                " " + "\n" +
                "----------------------------------- " + "\n" +
                " ";

    }
}
