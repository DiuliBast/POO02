import java.util.ArrayList;

public class ArrayFotos implements IFoto{

    public static ArrayList<ArrayFotos> listFotos = new ArrayList<>();

    @Override
    public boolean addFoto(Foto foto) {
        return false;
    }

    @Override
    public Foto getFoto(String titulo) {
        return null;
    }

    @Override
    public boolean editarFoto(String titulo, String data) {
        return false;
    }

    @Override
    public boolean removeFoto(String data) {
        return false;
    }
}
