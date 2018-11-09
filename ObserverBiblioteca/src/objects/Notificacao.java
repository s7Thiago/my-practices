package objects;                                                                                                        

public class Notificacao {
    private String titulo;
    private String descricao;
    private boolean lida;

    public Notificacao(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        setLida(false);
    }

    public final void setLida(boolean lida)
    {
        this.lida = lida;
    }

    public boolean foiLida()
    {
        return lida;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao()
    {
        return descricao;
    }

    @Override
    public String toString()
    {
        // TODO: Implement this method
        return "     ------" + getTitulo() + "------" + "\n" + getDescricao() + "\n----------------";
    }
    
    
    
    }
