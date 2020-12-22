package observer;
import java.util.*;
import objects.*;                                                    

public interface InnerSubject {
    
    public void addObserver(InnerObserver observer);
    
    public void removeObserver(InnerObserver observer);
    
    public void notifyAllObservers(Livro novoLivro, List<Livro> livros);
}
