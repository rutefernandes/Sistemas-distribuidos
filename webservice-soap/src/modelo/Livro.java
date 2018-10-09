package modelo;

import java.util.Date;

/**
 *
 * @author Rute
 */
public class Livro {
    private long id;
    private String titulo;
    private String autor;
    private String editora;
    private Date anoPublicacao;
    
    public Livro(){
        
    }
    
    public Livro(long id, String titulo, String autor, String editora, Date anoPUblicacao){
        super();
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }
    
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String Editora) {
        this.editora = Editora;
    }

    public Date getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Date anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
