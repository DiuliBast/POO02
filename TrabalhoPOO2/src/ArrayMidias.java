import java.io.*;
import java.util.ArrayList;

public class ArrayMidias implements IMídia, Serializable {

    public static ArrayList<Mídia> listMidias = new ArrayList<>();

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
    public Mídia getMídia(String titulo) {

        Filme f = new Filme();

        for (Mídia m : listMidias) {
            if (m.getTitulo() == titulo) {

                System.out.println(m);
                return m;

            } else return null;

        } return null;
    }

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

            listMidias = (ArrayList<Mídia>) file.readObject();
            file.close();

        }

        public String exibir () {

            System.out.println(listMidias.toString());
            return null;
        }
    }

