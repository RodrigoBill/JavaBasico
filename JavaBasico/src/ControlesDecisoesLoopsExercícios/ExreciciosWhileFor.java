package ControlesDecisoesLoopsExerc�cios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExreciciosWhileFor {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		Scanner scan = new Scanner(System.in);

		// Exrc�cio 1 - Pedir at� que o valor num�rico seja entre 0 e 10.
		/*
		 * System.out.print("D� uma nota entre 0 e 10: "); num1 =
		 * scan.nextInt(); while (num1 < 0 || num1 > 10) { System.out.print(
		 * "D� uma nota entre 0 e 10 v�lida: "); num1 = scan.nextInt(); }
		 * 
		 * System.out.println("O n�mero " + num1 + " � v�lido");
		 */

		// Exerc�cio 2 - Ler usu�rio e senha. Senha n�o pode ser igual ao
		// usu�rio

		String usuario;
		String senha;
		boolean diferente = false;

		/*
		 * do { System.out.print("Digite seu usu�rio: "); usuario = scan.next();
		 * System.out.print("Digite a senha: "); senha = scan.next();
		 * 
		 * if (senha.equalsIgnoreCase(usuario)) { System.out.println(
		 * "Usu�rio e senha iguais, digite novamente."); }else{ diferente =
		 * true; }
		 * 
		 * } while (!diferente);
		 * 
		 * System.out.println("Usu�rio e senha v�lidos!");
		 */

		// Exerc�cio 3 - Ler e validar NOME, IDADE, SAL�RIO, SEXO e ESTADO CIV�L

		/*
		 * String nome; int idade = 0; double salario = 0; String sexo; String
		 * estadoCivil; boolean valido = false;
		 * 
		 * do{ System.out.println("Seu nome: "); nome = scan.next();
		 * if(nome.length() > 3){ valido = true; }else{ System.out.println(
		 * "Nome deve ter mais de 3 letras. Digite novamente."); }
		 * }while(!valido);
		 * 
		 * do{ System.out.print("Sua idade: "); idade = scan.nextInt(); if(idade
		 * > 0 && idade < 150){ valido = true; }else{ valido = false;
		 * System.out.print("Idade deve ter entre 0 e 150. Digite novamente ");
		 * } }while(!valido);
		 * 
		 * do{ System.out.print("Seu sal�rio: "); salario = scan.nextDouble();
		 * if(salario > 0){ valido = true; }else{ valido = false;
		 * System.out.print("Sal�rio deve ser maior que 0. Digite novamente ");
		 * } }while(!valido);
		 * 
		 * do{ System.out.print("Seu sexo (M-F): "); sexo = scan.next();
		 * if(sexo.length() == 1){ switch(sexo){ case "M": case "m": case "f":
		 * case "F": valido = true;break;
		 * 
		 * default: valido = false; System.out.print(
		 * "Sexo deve ser Feminino (F/f) ou Masculino (M/m). Digite novamente "
		 * ); }
		 * 
		 * }else{ valido = false; System.out.print(
		 * "Sexo deve ser Feminino (F/f) ou Masculino (M/m). Digite novamente "
		 * ); } }while(!valido);
		 * 
		 * do{ System.out.print("Seu estado civ�l (S-C-V-D): "); estadoCivil =
		 * scan.next(); if(estadoCivil.length() == 1){ switch(estadoCivil){ case
		 * "S": case "s": case "C": case "c": case "V": case "v": case "D": case
		 * "d": valido = true;break;
		 * 
		 * default: valido = false; System.out.print(
		 * "Seu estado civ�l deve ser S, C, V ou D. Digite novamente "); }
		 * 
		 * }else{ valido = false; System.out.print(
		 * "Seu estado civ�l deve ser S, C, V ou D. Digite novamente "); }
		 * }while(!valido);
		 * 
		 * System.out.println(nome); System.out.println(idade);
		 * System.out.println(salario); System.out.println(sexo);
		 * System.out.println(estadoCivil);
		 */
		// Exerc�cio 4 - Pa�s A 80000 habitantes crescimento 3%, B 200000
		// habitantes crescimento 1,5%
		// Quantos anos ser� necess�rio para Pa�s A igualar ou passar Pa�s B.
		/*
		 * double paisA = 80000; double paisB = 200000; double parcialA = 0;
		 * double parcialB = 0; int anos = 0;
		 * 
		 * double porcentagemA = 3; double porcentagemB = 1.5;
		 * 
		 * boolean quantidadeDeHabitantes = false;
		 * 
		 * DecimalFormat PA = new DecimalFormat("0.00"); String totalPaisA =
		 * PA.format(paisA);
		 * 
		 * DecimalFormat PB = new DecimalFormat("0.00"); String totalPaisB =
		 * PB.format(paisB); do{
		 * 
		 * totalPaisA = PA.format(paisA); totalPaisB = PB.format(paisB);
		 * 
		 * System.out.println(totalPaisA + " <=> " + totalPaisB); parcialA =
		 * (paisA/100)*porcentagemA; paisA = parcialA + paisA;
		 * 
		 * parcialB = (paisB/100)*porcentagemB; paisB = parcialB + paisB;
		 * 
		 * if(paisA < paisB){ anos ++; }else{ quantidadeDeHabitantes = true; }
		 * 
		 * }while(!quantidadeDeHabitantes);
		 * 
		 * totalPaisA = PA.format(paisA); totalPaisB = PB.format(paisB);
		 * 
		 * System.out.println(totalPaisA + " <=> " + totalPaisB);
		 * System.out.println("Em " + anos +
		 * " ano(s) a popula��o de A estar� igual ou maior ao de B.");
		 */
		// Exerc�cio 5 - Alterar o exerc�cio anterior permitindo inserir os
		// pa�ses, quantidade de habitantes e porcentagem de crescimento
/*
		String nmeA;
		String nmeB;
		double paisA = 80000;
		double paisB = 200000;
		double parcialA = 0;
		double parcialB = 0;
		int anos = 0;

		double porcentagemA = 0;
		double porcentagemB = 0;

		boolean quantidadeDeHabitantes = false;
		boolean novaConsulta = false;

		do {

			DecimalFormat PA = new DecimalFormat("0.00");
			String totalPaisA = PA.format(paisA);

			DecimalFormat PB = new DecimalFormat("0.00");
			String totalPaisB = PB.format(paisB);

			nmeA = JOptionPane.showInputDialog("Digite o primeiro pa�s: ");
			//nmeA = scan.next();
			nmeB = JOptionPane.showInputDialog("Digite o segundo pa�s: ");
			//nmeB = scan.next();

			System.out.print("Qual a popula��o de " + nmeA + ":");
			paisA = scan.nextDouble();
			System.out.print("Qual a popula��o de " + nmeB + ":");
			paisB = scan.nextDouble();
			
			System.out.print("Qual a porcentagem de crescimento ao ano do pa�s " + nmeA + ":");
			porcentagemA = scan.nextDouble();
			System.out.print("Qual a porcentagem de crescimento ao ano do pa�s " + nmeB + ":");
			porcentagemB = scan.nextDouble();
			
			if (paisA < paisB) {

				do {

					parcialA = (paisA / 100) * porcentagemA;
					paisA = parcialA + paisA;

					parcialB = (paisB / 100) * porcentagemB;
					paisB = parcialB + paisB;

					if (paisA < paisB) {
						anos++;
					} else {
						quantidadeDeHabitantes = true;
					}

				} while (!quantidadeDeHabitantes);

				totalPaisA = PA.format(paisA);
				totalPaisB = PB.format(paisB);

				System.out.println(totalPaisA + " <=> " + totalPaisB);
				System.out.println(
						"O pa�s " + nmeA + " levar� " + anos + " anos para se igualar ou passar em n�mero o pa�s " + nmeB);

			} else if (paisA > paisB) {

				do {

					parcialA = (paisA / 100) * porcentagemA;
					paisA = parcialA + paisA;

					parcialB = (paisB / 100) * porcentagemB;
					paisB = parcialB + paisB;

					if (paisA > paisB) {
						anos++;
					} else {
						quantidadeDeHabitantes = true;
					}

				} while (!quantidadeDeHabitantes);

				totalPaisA = PA.format(paisA);
				totalPaisB = PB.format(paisB);

				System.out.println(totalPaisA + " <=> " + totalPaisB);
				System.out.println(
						"O pa�s " + nmeB + " levar� " + anos + " para se igualar ou passar em n�mero o pa�s " + nmeA);
			}

			boolean deNovo = false;
			do {

				System.out.println("Deseja fazer nova consulta? S/N");
				String simNao;
				simNao = scan.next();

				if (simNao.length() == 1) {

					switch (simNao) {
					case "S":
					case "s":
						novaConsulta = true;
						deNovo = true;
						break;
					case "N":
					case "n":
						novaConsulta = false;
						deNovo = true;
						break;

					default:
					}

				}
			} while (!deNovo);

		} while (novaConsulta);
*/
		//Exerc�cio 6 - Mostra os n�mero de 1 a 20 um abaixo do outro
		//Depois mostrar um do lado do outro
/*		
		for(int i = 1; i<=20; i++){
			System.out.println(i);
		}
		for(int i = 1; i<=20; i++){
			System.out.print(i+" ");
		}

		//Exerc�cio 7 - Ler 5 n�meros e informar o maior
		num2 = Integer.MIN_VALUE;
		for(int i = 1; i<=5; i++){
			System.out.println("Digite um n�meros: ");
			num1 = scan.nextInt();
			
			if(num1>num2){
				num2 = num1;
			}
		}
		System.out.println("Maior n�mero � "+num2);
		
		//Exerc�cio 8 - Ler 5 n�meros e informar soma e m�dia
				int soma=0;
				int media=0;
				int i;
				for(i = 0; i<5; i++){
					System.out.println("Digite um n�meros: ");
					num1 = scan.nextInt();
						soma += num1;
				}
				media = soma/i;
				System.out.println("Dividir por = "+i);
				System.out.println("Soma = "+soma);
				System.out.println("M�dia = "+media);
		
				//Exrc�cio 9 - Imprimir n�meros pares de 1 a 50
				for(int i = 1; i <= 50; i++){
					if(i%2 != 0){
				     System.out.println(i);
				    }
				}

		//Exrc�cio 10 - Receber dois n�meros inteiros e imprimir os primos entre eles
		System.out.println("Digite dois n�meros em ordem crescente: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();

		if(num1>num2){
			num3=num2;
		    num2=num1;
		    num1=num3;
		}

		for(int i = num1; i<=num2; ++i){
			System.out.println(i);
		}    

		//Exrc�cio 11 - Mostrar a soma do exerc�cio anterior
		System.out.println("Digite dois n�meros em ordem crescente: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();

		if(num1>num2){
			num3=num2;
		    num2=num1;
		    num1=num3;
		}

		int soma=0;
		for(int i = num1; i<=num2; ++i){
			System.out.println(i);
		    soma = soma + i;
		}    
		System.out.println("Soma "+ soma);

		//Exerc�cio 12 - Gerador de tabuada de 1 a 10
		System.out.println("Digite um n�mero para saber a tabuada de 1 a 10: ");
		num1 = scan.nextInt();
		int soma = 0;
		for(int i = 1; i < 11; i++){
			soma = num1 * i;
		    System.out.println(num1 + " x " + i + " = " + soma);
		}

		//Exerc�cio 13 - Ler dois n�meros e eleve o primeiro n�mero pelo segundo(Base - Expoente)
		System.out.println("Digite dois n�meros: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		int total = num1;
		for(int i = 0; i < num2; i++){
			total = total * num1;
		}
		System.out.println("Total =  "+total);
		
		//Exerc�cio 14 - Pedir 10 n�meros e calcular a quantidade de pares e impares
		int pares=0;
		int impares=0;
		for(int i = 1; i < 11; i++){
			System.out.println("Digite o "+ i + "� n�meros de dez: ");
			num1 = scan.nextInt();
		if(num1%2 == 0){
			pares++;
		}else{
				impares++;
			}
		}
		System.out.println("Quantidade de n�meros pares "+ pares);
		System.out.println("Quantidade de n�meros impares "+ impares);

		//Exerc�cio 15 - Qual termo n-�simo deseja saber de fibonacci
		System.out.println("Qual termo de fibonacci deseja saber: ");
		num1 = scan.nextInt();
		int a=1;
		int b=0;
		int c=0;
		int i;
		for(i = 0; i < num1; i++ ){
			c=a+b;
			b=a;
			a=c;
		}
		System.out.println("O termo fibonacci " + num1 + " � " + c);

		//Exerc�cio 16 - Fazer a s�rie de Fibonacci at� que o valor seja maior que 500
		System.out.println("Sequ�ncia fibonacci at� maior que 500: ");
		num1 = scan.nextInt();
		int a=1;
		int b=0;
		int c=0;
		
		do{
			c=a+b;
			System.out.println(a +" + "+ b + " = " + c);
			b=a;
			a=c;
		}while(c<=500);

		//Exerc�cio 17 - Calcular Fatorial
		System.out.println("Digite um n�mero para saber o fatorial: ");
		num1 = scan.nextInt();
		int total=num1;
		System.out.print(num1 +"! = ");
		System.out.print(num1 + " x ");
		for(int i = 1; i < num1 ; i++){
			
			total = total * (num1-i);
			if (num1-i != 1) {
				System.out.print((num1-i) +" x ");
			} else {
				System.out.print((num1-i) +" = ");
			}
		}
		System.out.print(total);

		//Exerc�cio 18 - Identificar se o n�mero � primo ou n�o
		System.out.println("Digite um n�mero: ");
		num1 = scan.nextInt();
		int contador=0;
		for(int i = 1; i <= num1; i++){
			if(num1%i == 0 || num1%i == num1){
				contador++;
			}
		}

		if(contador == 2){
			System.out.println("O n�mero " + num1 + " � primo.");
		}else{
			System.out.println("O n�mero " + num1 + " n�o � primo.");
		}

		//Exerc�cio 19 - Calcular m�dia aritm�tica de N notas
		double nota = 0;
		double soma = 0;
		double media = 0;
		for(int i = 1; i < 5; i++){
			System.out.println("Digite a " + i + "� nota: ");
		nota = scan.nextInt();
		soma += nota;
		}
		media = soma/4;
		System.out.println("M�dia � " + media);

		//Exerc�cio 20 - Pedir N idades e verificar a m�dia de idade da turma,
		//0 a 25 Jovem, 26 a 60 adulta, 60 pra cima idosa
		double idade = 0;
		double soma = 0;
		double media = 0;
		int quantidade = 0;
		String tipo;
		System.out.println("Digite a quantidade de alunos: ");
		quantidade = scan.nextInt();
		for(int i = 1; i <= quantidade; i++){
			System.out.println("Digite a " + i + "� idade: ");
					idade = scan.nextInt();
					soma += idade;
		}
		media = soma/quantidade;
		if(media < 26){
			tipo = "Jovem";
		}else if(media > 25 && media < 60){
			tipo = "Adulta";
		}else{
			tipo = "Idosa";
		}
		System.out.println("M�dia � " + media + " e a turma � " + tipo);

		//Exerc�cio 21 - M�dia de alunos por turma
		int alunos = 0;
		int soma = 0;
		int media = 0;
		
		System.out.println("Quantas turmas: ");
		int turmas = scan.nextInt();
		for(int i = 0; i < turmas; i++){
			boolean turma = false;
			while(turma==false){
				System.out.println("Digite a quantidade de alunos da " + (i+1) + "� turma at� 40: ");
				alunos = scan.nextInt();
				if(alunos > 40){
					turma = false;
				}else{
					soma +=alunos;
					turma = true;
				}
			}
		}
		media = soma/turmas;
		System.out.println("M�dia por turma � " + media);

		//Exerc�cio 23 - Listar itens da loja de 1,99
		int itens = 50;
		double artigo = 1.99;
		double novoArtigo = 0; 
		
		System.out.println("Lojas Quase Dois - Tabela de Pre�os: ");
		for(int i = 0; i < itens; i++){
			novoArtigo = novoArtigo + artigo;
			DecimalFormat df = new DecimalFormat("0.00"); 
			String totalCasasDecimal = df.format(novoArtigo);
			System.out.println((i+1) + " - " + totalCasasDecimal);
		}

		//Exerc�cio 24 - Listar pre�o dos p�es informados pelo usu�rio
		int itens = 50;
		double valores=0;
		
		System.out.println("Qual o pre�o do p�o? ");
		double artigo = scan.nextDouble();
		double novoArtigo = 0; 
		
		
		System.out.println("Panificadora - Tabela de Pre�os: ");
		for(int i = 0; i < itens; i++){
			novoArtigo = novoArtigo + artigo;
			DecimalFormat df = new DecimalFormat("0.00"); 
			String totalCasasDecimal = df.format(novoArtigo);
			System.out.println((i+1) + " - " +  totalCasasDecimal);
		}

		//Exerc�cio 25 - Conveniencia com caixa registradora rudimentar
		System.out.println("Digite os valores dos produtos: ");
		double total =0;
		int produto=0;
		double valores = 0;
		
		do{
			produto ++;
		
		System.out.println("Produto "+ produto + ":");
		valores = scan.nextDouble();
		total = total + valores;

		}while(valores != 0);

		DecimalFormat df = new DecimalFormat("0.00"); 
		String totalCasasDecimal = df.format(total);
		System.out.println("Total da compra: " + totalCasasDecimal);

		System.out.println("Valor fornecido pelo cliente: ");
		double pagamento = scan.nextDouble();

		double troco = total - pagamento;
		String trocoCasasDecimal = df.format(troco);
		System.out.println("Troco: " + troco);

		//Exerc�cio 26 - Calcular um fatorial e mostrar a sequ�ncia e o total
		System.out.println("Digite o n�mero para calcular o fatorial: ");
		int fact =scan.nextInt();
		int soma = fact;
		System.out.print(fact + "!: " + fact);
		for (int i = 1 ; i < fact; i++){
			soma = soma * (fact - i);
		System.out.print(" x " + (fact - i));
		}
		System.out.print(" = " + soma);

		//Exerc�cio 27 - Ler um conjunto de temperaturas e informar a menor e maior assim como a m�dia entre as temperaturas
		boolean verdadeiro = true; 
		double temp = 0;
		double maior = 0;
		double menor = 0;
		double soma = 0;
		double media = 0;
		int contador = 0;
		int i;
		System.out.println("Digite a quantidade de temperaturas: ");
		contador = scan.nextInt();
		
		for(i = 0; i < contador; i++){
			System.out.print("Temperatura: ");
			temp = scan.nextDouble();
			soma = soma + temp;
			
			if(maior < temp){
				maior = temp;
				soma += temp;
			}else if(menor > temp){
				menor = temp;
				soma += temp;
			}
		}
		media = soma / i;
		System.out.println("Menor " + menor);
		System.out.println("Maior " + maior);
		System.out.println("M�dia " + media);

		//Exerc�cio 28 - Determinar se um n�mero � primo ou n�o
		System.out.println("Digite um n�mero: ");
		num1 = scan.nextInt();
		int contador=0;
		for(int i = 1; i <= num1; i++){
			if(num1%i == 0 || num1%i == num1){
				contador++;
			}
		}

		if(contador == 2){
			System.out.println("O n�mero " + num1 + " � primo.");
		}else{
			System.out.println("O n�mero " + num1 + " n�o � primo.");
		}
*/
		//Exerc�cio 29 - Informar os n�mero primos de 1 at� o n�mero informado pelo usu�rio.
		System.out.println("Digite um n�mero: ");
		num1 = scan.nextInt();
		int contador=0;
		
		for(int i = 1; i <= num1; i++){
			
			for(int j = 1; j <= num1; j++){
				if(i%j == 0 || i%j == i){
					contador++;
				}
				if(contador == 2){
					System.out.print("Primos = " + i);
				}
			}
		}

		
	}
}