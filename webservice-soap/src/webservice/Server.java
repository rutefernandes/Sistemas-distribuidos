package webservice;

import dao.bibliotecaDao;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import modelo.Livro;
import publisher.Publisher;

@WebService(endpointInterface = "webservice.IServer") 
public class Server implements IServer{
    private bibliotecaDao bibliotecaDao = new bibliotecaDao();
            
    @Override
    public List<Livro> retornaLivros() {
        return bibliotecaDao.listarLivros();
    }

    @Override
    public void inserirLivro(String titulo, String autor, String editora) {
        bibliotecaDao.inserirLivro(titulo, autor, editora);
    }
    
}
