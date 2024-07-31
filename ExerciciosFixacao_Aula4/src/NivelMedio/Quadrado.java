package NivelMedio;

public class Quadrado implements FormaGeometrica {
    private double lado;

    // Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Implementação do método calcularArea()
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    // Implementação do método calcularPerimetro()
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
