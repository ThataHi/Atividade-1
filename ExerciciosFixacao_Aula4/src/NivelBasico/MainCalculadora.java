package NivelBasico;

public class MainCalculadora {
	public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();

        double num1 = 10;
        double num2 = 0;

        System.out.println("Soma: " + calc.somar(num1, num2));         // Output: Soma: 15.0
        System.out.println("Subtração: " + calc.subtrair(num1, num2));   // Output: Subtração: 5.0
        System.out.println("Multiplicação: " + calc.multiplicar(num1, num2)); // Output: Multiplicação: 50.0
        System.out.println("Divisão: " + calc.dividir(num1, num2));       // Output: Divisão: 2.0

    }

}
