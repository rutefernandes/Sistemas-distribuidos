package webservice;

import dao.bibliotecaDao;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import modelo.Livro;

@WebService(endpointInterface = "IServer") 
public class Server implements IServer{
    private bibliotecaDao bibliotecaDao = new bibliotecaDao();
            
    @Override
    public List<Livro> retornaLivros() {
        return bibliotecaDao.listarLivros();
    }

    @Override
    public void inserirLivro(long id, String titulo, String autor, String editora, Date anoPublicacao) {
        bibliotecaDao.inserirLivro(id, titulo, autor, editora, anoPublicacao);
    }
    
}
