import java.util.Scanner;

public class BancodeMidias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Filme f;
        Musica m;
        Foto foto;
        int op;


        System.out.println("-----------------");
        System.out.println("| Seja bem-vindo |");
        System.out.println("-----------------");
        System.out.println(" ");


        do {
            System.out.println("1. Adicionar um Filme");
            System.out.println("2. Exibir um Filme");
            System.out.println("0. sair ");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    f = new Filme();
                    System.out.println("Adicione o produto");
                    System.out.println("Escreva o título do filme: ");
                    f.setTitulo(entrada.next());
                    System.out.println("Escreva a descricao: ");
                    f.setDescricao(entrada.next());
                    System.out.println("Escreva o genero: ");
                    f.setGenero(entrada.nextLine());
                    System.out.println("Escreva o idioma: ");
                    f.setIdioma(entrada.nextLine());
                    System.out.println("Escreva o nome do diretor: ");
                    f.setDiretor(entrada.nextLine());
                    System.out.println("Escreva o Autor: ");
                    f.setAtoresPrincipais(entrada.nextLine());
                    System.out.println("Digite a duração do filme: ");
                    f.setDuracao(entrada.nextDouble());
                    System.out.println("Digite o ano: ");
                    f.setAno(entrada.nextInt());
                    f.criaArquivo(f);

                    break;

                case 2:
                    System.out.println("Exibir Filmes");
                    System.out.println(Filme.tudoString());
                    break;

                case 0:
                    System.out.println("Você escolheu sair");
                    break;
            }


        } while (op != 0);
    }
}
