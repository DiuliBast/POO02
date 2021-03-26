public class Musica extends AudioVisual  {
String autores;
String interpretes;

public Musica (String titulo, String descricao, String caminho, String genero, String idioma, String duração, int ano,String autores, String interpretes){
    super(titulo, descricao, caminho, genero, idioma, duração,ano);
    this.autores=autores;
    this.interpretes= interpretes;
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


}
