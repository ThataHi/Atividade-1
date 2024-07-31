package NivelMedio;

public class Triangulo extends Poligono {
    private double base;
    private double altura;

    // Construtor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementação do método area()
    @Override
    public double area() {
        return (base * altura) / 2;
    }
}
