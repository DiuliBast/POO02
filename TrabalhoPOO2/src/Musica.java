public class Musica extends AudioVisual implements IAudiovisual {
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

    @Override
    public String getDescrição() {
        return super.getDescrição();
    }

    @Override
    public boolean addMusica(Musica m) {
        return false;
    }

    @Override
    public Musica getMusica(String titulo) {
        return null;
    }

    @Override
    public boolean editarMusica(String titulo, String genero) {
        return false;
    }

    @Override
    public boolean removeMusica(String titulo) {
        return false;
    }
}
