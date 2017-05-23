import java.util.Scanner;

public class ControlesDecisoesLoops {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Qual o preço? ");
		double preco = scan.nextDouble();
		if (preco <= 10){
			System.out.println("Preço bom!");
		}else if (preco > 10 && preco < 15){
			System.out.println("Mais ou menos, chore desconto!");
		}else if (preco > 15 && preco < 17){
			System.out.println("Mais ou menos, pesquise mais!");
		}else{
			System.out.println("Muito caro!");
		}
		
		System.out.println("Digite o dia da semana (1-7): ");
		int diaSemana = scan.nextInt();
		
		switch (diaSemana) {
		case 1:System.out.println("Domingo");break;
		case 2:System.out.println("Segunda");break;
		case 3:System.out.println("Terça");break;
		case 4:System.out.println("Quarta");break;
		case 5:System.out.println("Quinta");break;
		case 6:System.out.println("Sexta");break;
		case 7:System.out.println("Sábado");break;

		default: System.out.println("Não é um dia da semana válido.");
			break;
		}

	}

}
