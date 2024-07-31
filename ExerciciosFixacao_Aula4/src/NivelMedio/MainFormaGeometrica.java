package NivelMedio;

public class MainFormaGeometrica {
	public static void main(String[] args) {
        FormaGeometrica quadrado = new Quadrado(4);
        FormaGeometrica circulo = new Circulo2(5);
        FormaGeometrica retangulo = new Retangulo2(4, 6);

        System.out.println("Quadrado:");
        System.out.println("Área: " + quadrado.calcularArea());
        System.out.println("Perímetro: " + quadrado.calcularPerimetro());

        System.out.println("\nCírculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        System.out.println("\nRetângulo:");
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}
