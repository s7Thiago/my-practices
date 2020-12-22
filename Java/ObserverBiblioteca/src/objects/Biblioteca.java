package objects;

import observer.*;
import java.util.*;

public class Biblioteca implements InnerSubject {

    List<InnerObserver> observers = new ArrayList<>();
    List<Livro> livros = new ArrayList<>();

    public void addNovoLivro(Livro livro) {
        livros.add(livro);
        notifyAllObservers(livro, livros);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
        notifyAllObservers(null, livros);
    }

    public void listarAlunos() {
        int cont = 0;
        for (InnerObserver observer : observers) {
            if (observer instanceof Aluno) {
                System.out.println(cont + ": " + ((Aluno) observer).getNome());
                cont++;
            }
        }
        System.out.println("\n\n");
    }

    public void listarLivros() {
        int contador = 0;
        for (Livro l : livros) {
            System.out.println("-------Livro" + contador + "-------");
            System.out.print(l.toString());
            System.out.println("\n-------------");
            contador++;
        }
    }

    public InnerObserver retornarAluno(int posicao) {
        return observers.get(posicao);
    }

    public List<Livro> retornaListadeLivros() {
        return this.livros;
    }

    @Override
    public void addObserver(InnerObserver observer) {
        // TODO: Implement this method
        observers.add(observer);
    }

    @Override
    public void removeObserver(InnerObserver observer) {
        // TODO: Implement this method
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(Livro novoLivro, List<Livro> livros) {
        // TODO: Implement this method
        System.out.println("Notificando alunos sobre a chegada de "
                + novoLivro.getTitulo() + "...");
        for (InnerObserver observer : observers) {
            
            if(observer instanceof Aluno) {
                //((Aluno) observer).removerRecomendaçoes();
                observer.update(novoLivro, livros);
            }
        }
    }
}
