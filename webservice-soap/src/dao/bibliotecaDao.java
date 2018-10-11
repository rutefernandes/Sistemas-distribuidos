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
    private static Long counter;
    private static Map<Long, Livro> LIVROS = new LinkedHashMap<>();
    
    public bibliotecaDao(){
        counter = 0L;
    }
    
    public ArrayList<Livro> listarLivros() {        
       return new ArrayList<>(LIVROS.values());
    }
    
    public void inserirLivro(String titulo, String autor, String editora){
        counter+=1L;
        LIVROS.put(counter, new Livro(counter, titulo, autor, editora));
    }
}
