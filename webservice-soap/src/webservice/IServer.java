package webservice;

import java.util.Date;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import modelo.Livro;

/**
 *
 * @author rute
 */
@WebService
public interface IServer {
    // Metodos do webservice
    @WebMethod
    public List<Livro> retornaLivros();
    
    @WebMethod
    public void inserirLivro(String titulo, String autor, String editora);
}
