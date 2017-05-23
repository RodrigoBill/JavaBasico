import java.util.Scanner;

public class LeituraDadoTeclado {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Primeiro nome: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome:");
		String nomePrimeiro = scan.next();
		System.out.println("Primeiro nome: " + nomePrimeiro);
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altura:");
		double altura = scan.nextDouble();
		System.out.println("Sua idade é: " + altura);
		
		System.out.println("Digite seu nome, sua idade, quantidade de filhos, altura");
		String nome2 = scan.next();
		int idade2 = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura2 = scan.nextFloat();
		System.out.println("Suas informações foram as seguintes: " + nome2 + " " + idade2 + " "
				+ qtdFilhos + " " + altura2);
		
	}

}
