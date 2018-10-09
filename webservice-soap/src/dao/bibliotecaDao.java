package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import modelo.Livro;

/**
 *
 * @author rute
 */
public class bibliotecaDao {
    public static Long counter;
    public static Map<Long, Livro> LIVROS = new LinkedHashMap<>();
    
    public bibliotecaDao(){
        counter = 0L;
    }
    
    public ArrayList<Livro> listarLivros() {        
       return new ArrayList<>(LIVROS.values());
    }
    
    public void inserirLivro(Long id,String titulo, String autor, String editora, Date anoPublicacao){
        counter+=1;
        LIVROS.put(counter, new Livro(counter, titulo, autor, editora, anoPublicacao));
    }
}
