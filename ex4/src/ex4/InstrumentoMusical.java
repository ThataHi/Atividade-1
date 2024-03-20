package ex4;

public abstract class InstrumentoMusical {
public abstract void Tocar();
	
	public abstract void Afinar();
	
	public static void main(String[] args) {

        Violao violao = new Violao();
        violao.Afinar();
        violao.Tocar();
       
        Piano piano = new Piano();
        piano.Afinar();
        piano.Tocar();
       
    }
}
