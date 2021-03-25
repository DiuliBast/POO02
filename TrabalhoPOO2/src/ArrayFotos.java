import java.util.ArrayList;

public class ArrayFotos implements IFoto{

    public static ArrayList<Foto> listFotos = new ArrayList<>();

    @Override
    public boolean addFoto(Foto foto) {

        if(foto == null){
            return false;
        }
        if (listFotos.add(foto))

            return true;

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
