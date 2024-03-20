package ex2;
import java.util.ArrayList;
import java.util.List;

public class ex2 {
public static void main(String[] args) { 
		
		List<String> compras = new ArrayList<>(); 
		
		compras.add("Maçã"); 
		compras.add("Banana");
		compras.add("Mamão");
		compras.add("Melancia");
		compras.add("Pão");
		
		for (String itens : compras) { 
			System.out.println(itens);
		}
		System.out.println("\nRemovendo item: " ); //
		
		compras.remove(1); 
		
		for(String itens : compras) {
			System.out.println(itens);
		}
}
}
