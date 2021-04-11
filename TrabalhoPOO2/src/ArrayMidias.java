import java.io.*;
import java.util.ArrayList;

public class ArrayMidias implements IMídia, Serializable {

    private static ArrayList<ArrayMidias> listMidias = new ArrayList<>();
    private Mídia m;

    @Override
    public boolean addMidia(Mídia m) {

        if (m == null) {
            return false;
        }
        if (listMidias.add(m))
            return true;
        else
            return false;
    }

    @Override
    public boolean getMídia(String titulo) {

        Mídia m = new Mídia();

        for (ArrayMidias mi : listMidias) {
            if (m.getTitulo == titulo) {
                System.out.println(m.toString());
                return true;

            } else

        }
        return false;
    }



/*
        Mídia

        for (ArrayMidias m : listMidias) {

            return (Mídia) m;

        }
        return null;
    }
*/
        @Override
        public boolean editarMídia (String titulo){

            return false;
        }

        @Override
        public boolean removeMídia (String titulo){

            if (listMidias.remove(getMídia(titulo)))

                return true;

            else

                return false;
        }

        @Override
        public Mídia getMusicaFilme (String genero){

            return null;
        }

        public String toString () {
            String novo = "";
            for (ArrayMidias m : listMidias) {
                novo = novo + m.toString() + "\n";

            }
            return novo;
        }

        public void grava () throws Exception {

            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("midias.bin"));
            file.writeObject(listMidias);
            file.close();

        }

        public void ler () throws Exception {

            ObjectInputStream file = new ObjectInputStream(new FileInputStream("midias.bin"));

            listMidias = (ArrayList<ArrayMidias>) file.readObject();
            file.close();

        }

        public String exibir () {

            System.out.println(listMidias.toString());
            return null;
        }
    }

