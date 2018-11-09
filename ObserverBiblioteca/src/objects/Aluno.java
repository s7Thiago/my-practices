package objects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import observer.InnerObserver;

public class Aluno implements InnerObserver {

    private String nome;
    private int matricula;
    private List<Notificacao> notificacoes;
    private List<Categoria> categoriasInteresse;
    private List<Livro> livrosRecomendados;

    public Aluno(String nome, int matricula) {
        setNome(nome);
        setMatricula(matricula);

        notificacoes = new ArrayList<>();
        categoriasInteresse = new ArrayList<>();
        livrosRecomendados = new ArrayList<>();
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public final void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void addNotificacao(Notificacao notificacao) {
        notificacoes.add(notificacao);
    }

    public void limparNotificacoesLidas() {
        for (Notificacao n : notificacoes) {

            if (n.foiLida()) {
                notificacoes.remove(n);
            }

        }
    }

    public void mostrarNotificacoes() {
        int cont = 0;

//        Se a lista de notificacoes estiver vazia
        if (!notificacoes.isEmpty()) {
            System.out.println("-------- Notificações de " + this.getNome() + "---------");

            for (Notificacao n : notificacoes) {
                System.out.println(cont + ": " + n.getTitulo());
                cont++;
            }
            System.out.println("----------------------------");
//    Se a lista de notificacoes nao estiver vazia
        } else {
            System.out.println("-------- Notificações de " + this.getNome() + "---------");
            System.out.println("\nLista vazia\n-----------------");
        }
    }

    public void lerNotificacao(int posicao) {

        if (!notificacoes.isEmpty()) {
            System.out.println("-----" + "Conteudo de " + notificacoes.get(posicao).getTitulo() + "-----");
            System.out.println("\n"+ notificacoes.get(posicao).getDescricao() + "-----");
            limparNotificacoesLidas();
        } else {
            
        }
    }

    public void listarCategoriasDeInteresse() {
        int cont = 0;

//        Se a lista de categorias de interesse nao estiver vazia
        if (!categoriasInteresse.isEmpty()) {
            System.out.println("\n-------Interesses de" + this.getNome() + "----------");
            for (Categoria c : categoriasInteresse) {
                System.out.println(cont + "°: " + c.getId());
                cont++;
            }
            System.out.println("\n-----------------");
//        se a lista de categorias de interesse estiver vazia
        } else {
            System.out.println("\n-------Interesses de" + this.getNome() + "----------");
            System.out.println("\nLista vazia-----------------\n");
        }
    }

    public void addCategoriaDeInteresse(Categoria categoria, Biblioteca baseDeAtualizacao) {
        int contadorDeCategoriasIguaisANova = 0;

//        Se a lista de categorias de interesse nao estiver vazia
        if (!categoriasInteresse.isEmpty()) {
//        Verifica se há alguma categoria já adicionada igual a nova
            for (Categoria c : categoriasInteresse) {
                if (c.getId() == categoria.getId()) {
                    contadorDeCategoriasIguaisANova++;
                }
            }

//        Se não for uma categoria duplicada, adiciona a lista e atualiza a 
//        lista de interesses com base na lista de livros recebida da biblioteca
            if (contadorDeCategoriasIguaisANova == 0) {
                categoriasInteresse.add(categoria);
                update(null, baseDeAtualizacao.retornaListadeLivros());

//            Se 'contadorDeCategoriasIguaisANova' for maior do que zero, eh
//            porque a categoria ja existe
            } else {
                System.out.println("Esta categoria já existe");
            }
//        Se a lista de categorias de interesse estiver vazia
        } else {
            categoriasInteresse.add(categoria);
            update(null, baseDeAtualizacao.retornaListadeLivros());
        }
    }

    private void removerRecomendaçoes() {
//        for (Livro livro : livrosRecomendados) {
//            livrosRecomendados.remove(livro);
//
//        }
        for (Iterator<Livro> i = livrosRecomendados.iterator(); i.hasNext();) {
            Livro l = i.next();
            i.remove();
        }
    }

    public void removerCategoriaDeInteresse(int posicao, Biblioteca baseDeAtualizacao) {
        listarCategoriasDeInteresse();
        System.out.print("Posicao da categoria: ");
        posicao = new Scanner(System.in).nextInt();

        //Remove a categoria de interesse
        categoriasInteresse.remove(categoriasInteresse.get(posicao));

        //Atualiza a lista de recomendações
        removerRecomendaçoes();
        update(null, baseDeAtualizacao.livros);

    }

    public void mostrarLivrosRecomendados() {

        if (livrosRecomendados.size() != 0) {
            System.out.println("\n-----Recomendações de " + this.getNome() + "-----");
            int cont = 0;
            for (Livro l : livrosRecomendados) {
                System.out.println(cont + "- " + l.getTitulo());
                cont++;
            }
//            Se o aluno ainda nao tiver recomendacoes
        } else {
            System.out.println("------------------\nSem recomendacoes\n------------------");
        }
    }

//    Atualiza a lista de interesses de cada aluno, caso haja um novo interesse
//    mainfestado, ou caso seja adicionado um novo livro a biblioteca
//    @Override
//    public void update(List<Livro> livros) {
//        System.out.println(" *" + this.getNome() + " foi avisado");
//        // 1 para cada livro recebido da biblioteca
//        for (Livro livro : livros) {
//            // 2 Percorre a lista de recomendações
//            for (Livro l : livrosRecomendados) {
//                // 3 Verifica se o numero de recomendacoes eh maior do que zero e se o livro já existe nas recomendaços para nao repetir
//                System.out.println(livro.getId() == l.getId() ? livro.getTitulo() + "nao eh recomendacao" : livro.getTitulo() + "eh recomendacao");
//                if (livro.getTitulo().toLowerCase().equals(l.getTitulo().toLowerCase())) {
//                    // 4 Se nao existir, ve se ele eh compativel com as categorias de interesse do aluno
//                    for (Categoria c : categoriasInteresse) {
//                        // 5 Se for, adiciona a lista de recomendacoes particular de cada usuario
//                        if (livro.getCategoria().getId() == c.getId()) {
//                            livrosRecomendados.add(livro);
//                            notificacoes.add(new Notificacao("Repositório de livros atualizado", livro.getTitulo() + "Foi adicionado, ou removido da prateleira"));
//                        }
//
//                    }
//                } //else () {
//
//                //}
//            }
//        }
//    }
    @Override
    public void update(Livro novoLivro, List<Livro> novaListaLivros) {
//        remove todas as recomendações para reconstruir a lista
        removerRecomendaçoes();

//        Se houver um livro novo na lista
        if (novoLivro != null) {
//            Para cada livro da nova lista
            for (Livro livro : novaListaLivros) {
//        Verifique se corresponde a algum dos interesses deste aluno
                for (Categoria categoria : categoriasInteresse) {
                    if (categoria.getId() == livro.getCategoria().getId()) {
//                    Se for compativel com algum interesse, adicione a lista de
//                    Recomendacoes
                        livrosRecomendados.add(livro);

//                    Adiciona uma notificacao para avisar sobre o novo livro
                        notificacoes.add(new Notificacao("Novo livro registrado",
                                "O livro " + novoLivro.getTitulo() + "esta disponivel"));
                    }
                }
            }
//            Se o livro do parametro for nulo, significa que na ha um livro novo
        } else {
            notificacoes.add(new Notificacao("Mudança ocorrida", "\nNenhum livro"
                    + " foi adicionado a biblioteca, mas achamos que voce pode"
                    + "ter atualizado a sua lista de interesses.\n\n"));
        }
    }
}
