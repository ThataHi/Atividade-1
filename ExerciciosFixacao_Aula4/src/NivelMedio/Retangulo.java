package NivelMedio;

public class Retangulo extends Poligono {
    private double largura;
    private double altura;

    // Construtor
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Implementação do método area()
    @Override
    public double area() {
        return largura * altura;
    }
}
