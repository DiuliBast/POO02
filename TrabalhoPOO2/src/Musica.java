public class Musica extends AudioVisual  {
String autores;
String interpretes;

public Musica (String autores, String interpretes){
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
