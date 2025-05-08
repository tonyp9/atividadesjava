import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product maca = new Product();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String nome = scanner.next();
		Product produto = new Product();
		produto.setName(nome);
		System.out.println("Price: ");
		double preco = scanner.nextDouble();
		produto.setPrice(preco);
		System.out.println("Quantity in stock: ");
		int quantidade = scanner.nextInt();
		produto.setQuantity(quantidade);
		produto.info();

	}

}
