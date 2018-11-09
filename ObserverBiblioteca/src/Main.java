
import java.util.*;
import objects.*;

public class Main {

    public static void main(String[] args) {

        int option = 0;

        //Criando a biblioteca
        Biblioteca ifb = new Biblioteca();

        //Criando os alunos
        Aluno a1 = new Aluno("Thiago Silva", 25266);
        Aluno a2 = new Aluno("Bernardo Oliveira", 76436);
        Aluno a3 = new Aluno("Mariana Carvalho", 17061);

        //Adicionando as categorias de interesse de cada aluno
        //a1
        a1.addCategoriaDeInteresse(new Categoria(3), ifb);
        a1.addCategoriaDeInteresse(new Categoria(4), ifb);
        a1.addCategoriaDeInteresse(new Categoria(5), ifb);
        
        //a2
        a2.addCategoriaDeInteresse(new Categoria(2), ifb);
        a2.addCategoriaDeInteresse(new Categoria(3), ifb);
        a2.addCategoriaDeInteresse(new Categoria(1), ifb);
        
        //a3
        a3.addCategoriaDeInteresse(new Categoria(2), ifb);
        a3.addCategoriaDeInteresse(new Categoria(6), ifb);
        a3.addCategoriaDeInteresse(new Categoria(7), ifb);

        //Increvendo os alunos nas atualizações da biblioteca
        ifb.addObserver(a1);
        ifb.addObserver(a2);
        ifb.addObserver(a3);
        

        /*
         * Criando os livros Legendas das categorias: 1 - Ação 2 - Romance 3 -
         * Tecnologia 4 - Acadêmico 5 - Ficção 6 - Terror 7 - Distração
         */
        Livro livro1 = new Livro(1, "Dominando o android", "Deitel", 2015, new Categoria(3));
        Livro livro2 = new Livro(2, "Java Como programar", "Deitel", 2013, new Categoria(3));
        Livro livro3 = new Livro(3, "A menina que roubava livros", "Autor desconhecido", 2015, new Categoria(7));
        Livro livro4 = new Livro(4, "A casa abadonada", "Autor desconhecido 2", 2017, new Categoria(6));
        Livro livro5 = new Livro(5, "Assembly - Construindo Sistemas Operacionais", "Reimundo Silva", 2015, new Categoria(3));
        Livro livro6 = new Livro(6, "Star Wars", "John", 2016, new Categoria(1));
        Livro livro7 = new Livro(7, "O mundo dos sonhos", "Ana carolina", 2018, new Categoria(7));
        Livro livro8 = new Livro(8, "Chegando atrasado no dia do ENEM", "Roberto fontes", 2016, new Categoria(1));
        Livro livro9 = new Livro(9, "Criando aplicações com mips assembly", "Tiago Trindade", 2012, new Categoria(3));
        Livro livro10 = new Livro(10, "Chuva de hamburguer", "Luiza amaral", 2014, new Categoria(7));
        Livro livro11 = new Livro(11, "Dominando o MYSQL", "Amanda Costa", 2016, new Categoria(3));
        Livro livro12 = new Livro(12, "Chegando ao centro de marte", "Diego Carvalho", 2015, new Categoria(5));
        Livro livro13 = new Livro(13, "Nunca perderei você", "Fabrícia Shecknojva", 2017, new Categoria(2));
        Livro livro14 = new Livro(14, "Invadindo um PC da Nasa com Excel e mips assembly", "Tiago Trindade", 2015, new Categoria(3));
        Livro livro15 = new Livro(15, "Pra sempre", "Jorge Amaral", 2017, new Categoria(2));
        Livro livro16 = new Livro(16, "Derrubando um satélite(Literalmente) com assembly", "Tiago Trindade", 2015, new Categoria(3));
        Livro livro17 = new Livro(17, "Como não resolver uma integral", "Dhiego Loiola", 2016, new Categoria(4));
        Livro livro18 = new Livro(18, "Onde você esteve?", "Patrícia danyelle", 2014, new Categoria(2));
        
        //Colocando os livros acima na biblioteca
        ifb.addNovoLivro(livro1);
        ifb.addNovoLivro(livro2);
        ifb.addNovoLivro(livro3);
        ifb.addNovoLivro(livro4);
        ifb.addNovoLivro(livro5);
        ifb.addNovoLivro(livro6);
        ifb.addNovoLivro(livro7);
        ifb.addNovoLivro(livro8);
        ifb.addNovoLivro(livro9);
        ifb.addNovoLivro(livro10);
        ifb.addNovoLivro(livro11);
        ifb.addNovoLivro(livro12);
        ifb.addNovoLivro(livro13);
        ifb.addNovoLivro(livro14);
        ifb.addNovoLivro(livro15);
        ifb.addNovoLivro(livro16);
        ifb.addNovoLivro(livro17);
        ifb.addNovoLivro(livro18);


        //Menu principal
        do {

            System.out.println("\n\n\n\n\n\n   ---Menu Principal---\n"
                    + "1 - Listar alunos\n"
                    + "2 - Escolher Aluno\n"
                    + "3 - Adicionar um livro novo\n"
                    + "4 - Listar Livros\n"
                    + "5 - Novo aluno\n\n");

            System.out.print("Escolha a opção: ");
            option = new Scanner(System.in).nextInt();

            switch (option) {
                case 1:
                    //Listar alunos
                    ifb.listarAlunos();
                    break;

                case 2:
                    //Escolher Aluno
                    int alunoDesejado = 0;
                    int opcaoMenuAluno = 0;

                    ifb.listarAlunos();
                    System.out.print("Digite o indice do aluno desejado: ");
                    alunoDesejado = new Scanner(System.in).nextInt();

                    //Pegando o aluno da lista que está na posição escolhida
                    Aluno aluno = (Aluno) ifb.retornarAluno(alunoDesejado);

                    //Mostra o menu de opções para o aluno escolhido
                    do {
                        //Menu
                        System.out.println("\n\n\n\n\n\n   ---Menu do Aluno---\n         " + aluno.getNome() + "\n\n"
                                + "1 - Ver Livros recomendados\n"
                                + "2 - Mostrar notificações\n"
                                + "3 - Limpar notificações lidas\n"
                                + "4 - Ler notificação\n"
                                + "5 - Ver categorias de interesse\n"
                                + "6 - Adicionar categoria de interesse\n"
                                + "7 - Remover categoria de interesse\n"
                                + "8 - Atualizar lista de recomendações\n"
                                + "0 - Voltar para o menu principal\n\n");
                        System.out.print("Escolha a opção: ");
                        opcaoMenuAluno = new Scanner(System.in).nextInt();

                        switch (opcaoMenuAluno) {
                            case 1:
                                ((Aluno) ifb.retornarAluno(alunoDesejado)).mostrarLivrosRecomendados();
                                break;

                            case 2:
                                ((Aluno) ifb.retornarAluno(alunoDesejado)).mostrarNotificacoes();
                                break;

                            case 3:
                                ((Aluno) ifb.retornarAluno(alunoDesejado)).limparNotificacoesLidas();
                                break;

                            case 4:
                                int indiceNotificacao = 0;

                                ((Aluno) ifb.retornarAluno(alunoDesejado)).mostrarNotificacoes();

                                System.out.print("Digite o índice da notificação: ");
                                indiceNotificacao = new Scanner(System.in).nextInt();

                                ((Aluno) ifb.retornarAluno(alunoDesejado)).lerNotificacao(indiceNotificacao);
                                break;

                            case 5:
                                ((Aluno) ifb.retornarAluno(alunoDesejado)).listarCategoriasDeInteresse();
                                break;

                            case 6:
                                int categoriaNovaId = 0;
                                System.out.print("Qual o id da nova categoria? ");
                                categoriaNovaId = new Scanner(System.in).nextInt();

                                //Adicionando a catagoria para o aluno referido
                                ((Aluno) ifb.retornarAluno(alunoDesejado)).addCategoriaDeInteresse(new Categoria(categoriaNovaId), ifb);
                                break;

                            case 7:
                                int idParaRemoverCategoria = 0;
                                ((Aluno) ifb.retornarAluno(alunoDesejado)).listarCategoriasDeInteresse();
                                System.out.print("Qual o id da categoria para remover? ");
                                idParaRemoverCategoria = new Scanner(System.in).nextInt();

                                ((Aluno) ifb.retornarAluno(alunoDesejado)).removerCategoriaDeInteresse(idParaRemoverCategoria, ifb);
                                break;
                                
                            case 8:
                                System.out.println("\nAtualizando recomendações...");
                                ((Aluno) ifb.retornarAluno(alunoDesejado)).update(null, ifb.retornaListadeLivros());
                                break;

                            default:
                                System.out.println("Ação não definida para esta opção");
                                break;

                        }
                    } while (opcaoMenuAluno != 0);
                    //
                    break;

                case 3:
                    //Adicionar um livro novo
                    int id,
                     ano,
                     idCategoria//,
//                     contIdIgual = 0
                            ;
                    String titulo,
                     autor;
                    
                    boolean idDiferente = false;

                    //Verifica se o id já existe na lista
                    do {
                        System.out.print("Qual o id do livro?: ");
                        id = new Scanner(System.in).nextInt();

                        for (Livro livro : ifb.retornaListadeLivros()) {
                            if (livro.getId() == id) {
                                idDiferente = false;
                                System.out.println("Um livro de id " + id + " já existe na lista. Escolha u outro id");
//                                contIdIgual++;
                            } else {
                            idDiferente = true;
                            }
                        }

                    } while (idDiferente == false);

                    System.out.print("Qual o ano do livro?: ");
                    ano = new Scanner(System.in).nextInt();

                    System.out.print("Qual o autor do livro?: ");
                    autor = new Scanner(System.in).nextLine();

                    System.out.print("Qual o titulo do livro?: ");
                    titulo = new Scanner(System.in).nextLine();

                    System.out.print("Qual a categoria do livro?: ");
                    idCategoria = new Scanner(System.in).nextInt();


                    ifb.addNovoLivro(new Livro(id, titulo, autor, ano, new Categoria(idCategoria)));

                    break;
                    
                case 4:
                    //Listar Livros da Biblioteca
                    ifb.listarLivros();
                    break;
                    
                case 5:
                    //Novo Aluno
                    System.out.print("-----Novo aluno-----\n"
                            + "--------------------\nNome do Aluno: ");
                    
                    String nome = new Scanner(System.in).nextLine();
                    
                    System.out.print("Matrícula: ");
                    int matricula = new Scanner(System.in).nextInt();
                    
                    ifb.addObserver( new Aluno(nome, matricula));
                    break;

                default:
                    System.out.println("Ação não definida para a opção " + option);
                    break;
            }

        } while (option != 0);

    }
}
