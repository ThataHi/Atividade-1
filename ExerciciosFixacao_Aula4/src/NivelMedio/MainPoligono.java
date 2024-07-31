package NivelMedio;

public class MainPoligono {
    public static void main(String[] args) {
       
        Poligono retangulo = new Retangulo(5, 10);
        Poligono circulo = new Circulo(7);
        Poligono triangulo = new Triangulo(6, 8);

        System.out.println("Área do Retângulo: " + retangulo.area());
        System.out.println("Área do Círculo: " + circulo.area());
        System.out.println("Área do Triângulo: " + triangulo.area());
    }
}
