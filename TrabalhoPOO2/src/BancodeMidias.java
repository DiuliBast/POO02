import java.util.Scanner;

public class BancodeMidias {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //ArrayAudiovisual f;
        //ArrayAudiovisual m;
        AudioVisual b;
        Filme f;
        ExemploArquivo a;
        Foto foto;
        int op;
        System.out.println(" Seja bem-vindo ");
        System.out.println(" 1. Gera arquivo ");
        System.out.println(" 2. Adicionar Filme: ");

        do {
            op = entrada.nextInt();
            switch (op) {

                case 1:
                    a = new ExemploArquivo();
                    System.out.println("Gera Arquivo");
                    a.GeraArquivo();
                    break;

                case 2:
                    f = new Filme();
                    System.out.println("Adicionar filme");
                    System.out.println("Insira o título do filme");
                    f.setTitulo(entrada.next());
                    System.out.println("Insira a descrição do filme");
                    f.setDescricao(entrada.next());
                    f.addFilme(f);

                    break;

                case 3:
                    foto = new Foto();
                    System.out.println("Adicionar Foto");
                    System.out.println("Insira o título da foto");
                    foto.setTitulo(entrada.next());
                    foto.addFoto(foto);

                    break;

                case 0:

                    System.out.println("Você escolheu sair:");
                    break;
            }


        }while (op != 0);
    }
}
