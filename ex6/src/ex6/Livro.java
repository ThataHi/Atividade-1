package ex6;

public class Livro {
	private int totalPaginas;

    public Livro(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public void lerPagina(int pagina) throws PaginaInvalidaException {
        if (pagina < 1 || pagina > totalPaginas) {
            throw new PaginaInvalidaException("Página inválida!");
        } else {
            System.out.println("Lendo página " + pagina);
        }
    }

    public static void main(String[] args) {
        Livro livro = new Livro(100);

        try {
            livro.lerPagina(50); 
            livro.lerPagina(-5); 
        } catch (PaginaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}

class PaginaInvalidaException extends Exception {
    public PaginaInvalidaException(String message) {
        super(message);
    }
}