package observer;
import objects.Livro;
import java.util.*;                                                                                            

public interface InnerObserver {
    
//    public void update(List<Livro> novaListaLivros);
    public void update(Livro novoLivro, List<Livro> novaListaLivros);
}
