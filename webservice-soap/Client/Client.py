from zeep import Client

class Livro:
    pass
        
def novoLivro():
    ret = Livro()
    ret.titulo = input('Titulo: ')
    ret.autor = input('Autor: ')
    ret.editora = input('Editora: ')
    return ret

def main():
    client = Client('http://localhost:9876/webservice-soap?wsdl')
    while True:
        print('[1] Inserir')
        print('[2] Listar')
        print('[0] Sair')
        op = input('> ')
        if op == '1':
            livro = novoLivro()
            client.service.inserirLivro(livro.titulo, livro.autor, livro.editora)
        elif op == '2':
            ls = client.service.retornaLivros()
            for livro in ls:
                print('')
                print('Id:', livro.id)
                print('Titulo:', livro.titulo)
                print('Autor:', livro.autor)
                print('Editora:', livro.editora)
        elif op == '0':
            break
        else:
            print('Inválido')

if __name__ == '__main__':
    main()