import java.util.ArrayList;

public class ArrayAudiovisual implements IAudiovisual {

    public static ArrayList<ArrayAudiovisual> listAudiovisual = new ArrayList<>();

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

    @Override
    public boolean addFilme(Filme f) {
        return false;
    }

    @Override
    public Filme getFilme(String titulo) {
        return null;
    }

    @Override
    public boolean editarFilme(String titulo, String genero) {
        return false;
    }

    @Override
    public boolean removeFime(String titulo) {
        return false;
    }
}
