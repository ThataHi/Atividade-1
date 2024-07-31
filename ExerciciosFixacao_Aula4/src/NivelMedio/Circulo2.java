package NivelMedio;

public class Circulo2 implements FormaGeometrica {
    private double raio;

    public Circulo2(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
