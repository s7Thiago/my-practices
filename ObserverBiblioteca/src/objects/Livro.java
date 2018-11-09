package objects;                                                                                    

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int ano;
    private Categoria categoria;

    public Livro(int id, String titulo, String autor, int ano, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.categoria = categoria;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public int getAno()
    {
        return ano;
    }

    public void setCategoria(Categoria categoria)
    {
        this.categoria = categoria;
    }

    public Categoria getCategoria()
    {
        return categoria;
    }

    @Override
    public String toString() {
        return (new StringBuilder()
                .append("Id: " + getId())
                .append("\nTítulo: " + getTitulo())
                .append("\nAutor: " + getAutor())
                .append("\nAno: " + getAno())
                .append("\nCategoria: " + getCategoria().getId())).toString();
    }
}
