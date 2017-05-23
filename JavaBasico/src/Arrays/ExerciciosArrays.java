package Arrays;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ExerciciosArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
/*
		//Exerc�cio 1 - Criar vetor A com 5 elementos inteiros. Criar vetor B com os mesmos elementos inteiros. 

		int[] A = new int[5];
		int[] B = new int[5];

		for(int i = 0; i < A.length; i++){
			A[i] = i + 1;
			B[i] = A[i];
			System.out.println("A - " + A[i] + " B - " + B[i]);
		}

		//Exerc�cio 2 - Criar vetor A com 8 elementos inteiros. Criar vetor B com os mesmos elementos inteiros multiplicados por 2. 

		int[] A = new int[8];
		int[] B = new int[8];

		for(int i = 0; i < A.length; i++){
			A[i] = i + 1;
			B[i] = A[i] * 2;
			System.out.println("A - " + A[i] + " B - " + B[i]);
		}

		//Exerc�cio 3 - Criar vetor A com 8 elementos inteiros. Criar vetor B com os mesmos elementos inteiros multiplicados por 2. 

		int[] A = new int[8];
		int[] B = new int[8];

		for(int i = 0; i < A.length; i++){
			A[i] = i + 1;
			B[i] = A[i] * A[i];
			System.out.println("A - " + A[i] + " B - " + B[i]);
		}

		//Exerc�cio 4 -  15 Elementos A, B vai ser a raiz quadrada de A

		int[] A = new int[15];
		double[] B = new double[A.length];

		DecimalFormat df = new DecimalFormat("###,###.##");
		
		for(int i = 0; i < A.length; i++){
			A[i] = i + 1;
			B[i] = Math.sqrt(A[i]);
			System.out.println("A - " + A[i] + " B - " + df.format(B[i]));
		}
		
		//Exerc�cio 5 - A e B com e 10 elementos sendo que B deve ser multiplicado pela posi��o

		int[] A = new int[10];
		int[] B = new int[A.length];

		for(int i = 0; i < A.length; i++){
			A[i] = i + 1;
			B[i] = A[i] * i;
			System.out.println("A - " + A[i] + " B - " + B[i]);
		}

		//Exerc�cio 6 - C vai ser a soma de A e B;

		double[] A = new double[10];
		double[] B = new double[A.length];
		double[] C = new double[A.length];

		for(int i = 0; i < A.length; i++){
			A[i] = i + 1;
			B[i] = A[i];
			C[i] = A[i] + B[i];
			System.out.println(A[i] + " + " + B[i] + " = " + C[i]);
		}

		//Exerc�cio 7 - C vai ser a subtra��o de A e B;

		double[] A = new double[10];
		double[] B = new double[A.length];
		double[] C = new double[A.length];

		for(int i = 0; i < A.length; i++){
			A[i] = i + 1;
			B[i] = A[i];
			C[i] = A[i] - B[i];
			System.out.println(A[i] + " - " + B[i] + " = " + C[i]);
		}
		
		//Exerc�cio 8 - C vai ser a multiplica��o de A e B;

		double[] A = new double[10];
		double[] B = new double[A.length];
		double[] C = new double[A.length];

		for(int i = 0; i < A.length; i++){
			A[i] = i + 1;
			B[i] = A[i];
			C[i] = A[i] * B[i];
			System.out.println(A[i] + " x " + B[i] + " = " + C[i]);
		}
		
		//Exerc�cio 9 - C vai ser a dividido de A e B;

		double[] A = new double[10];
		double[] B = new double[A.length];
		double[] C = new double[A.length];

		for(int i = 0; i < A.length; i++){
			A[i] = i + 1;
			B[i] = A[i];
			C[i] = A[i] / B[i];
			System.out.println(A[i] + " / " + B[i] + " = " + C[i]);
		}
		
		//Exerc�cio 10 - B � o resto de A;

		double[] A = new double[10];
		double[] B = new double[A.length];


		for(int i = 0; i < A.length; i++){
			A[i] = i + 1;
			B[i] = A[i]%2;
			System.out.println("Resto " + B[i]);
		}
		
		//Exerc�cio 11 - Ler 10 elementos e imprimir a quantidade de pares;

		double[] A = new double[10];
		double[] B = new double[A.length];

		int j = 0;

		for(int i = 0; i < A.length; i++){
			A[i] = i + 1;
			if(A[i]%2 == 0){
				B[j] = A[i];
				j++;
			}
		}
		System.out.println("Quantidade de pares � " + j);
		
		//Exerc�cio 12 - soma dos 10 elementos do vetor;

		double[] A = new double[10];
		double soma = 0;


		for(int i = 0; i < A.length; i++){
			A[i] = i + 1;
			soma += A[i];
		}
		System.out.println("A soma � " + soma);
		
		//Exerc�cio 13 - soma dos 10 elementos do vetor que s�o m�ltiplos de 5;

		double[] A = new double[10];
		double soma = 0;


		for(int i = 0; i < A.length; i++){
			A[i] = i + 1;
		if(A[i]%5 == 0){
				soma += A[i];
		}
		}
		System.out.println("A soma dos multiplos de 5 � " + soma);
		
		//Exerc�cio 14 - M�dia dos 10 elementos do vetor que s�o �mpares;

		int[] A = new int[10];
		int soma = 0;
		int j = 0;

		for(int i = 0; i < A.length; i++){
			A[i] = i + 1;
		if(A[i]%2 != 0){
				soma += A[i];
		j++;
		}
		}
		System.out.println("Soma " + soma);
		System.out.println("Dividir por " + j);
		int media = soma/j;
		System.out.println("A m�dia � " + media);
		
		//Exerc�cio 15 - Percentual de pares e �mpares do vetor;

		int[] A = new int[10];
		int par = 0;
		int impar = 0;
		int porcentagemPar = 0;
		int porcentagemImpar = 0;
		int i = 0;

		for(i = 0; i < A.length; i++){
			A[i] = i + 1;
			
			if(A[i]%2 == 0){
				par++;
			}else{
				impar++;
			}
		}
		
		porcentagemPar = (100/(i))*par;
		porcentagemImpar = (100/(i))*impar;
		System.out.println("Quantidade par � " + par + ". � " + porcentagemPar + "% de " + i);
		System.out.println("Quantidade impar � " + par + ". � " + porcentagemImpar + "% de " + i);
		
		//Exerc�cio 16 - A) Somar e escrever vetores menores que 15;
		//B) Imprimir a quantidade de elementos iguais a 15
		//C) M�dia dos elementos superiores a 15

		int[] A = new int[20];
		int somaMenor = 0;
		int somaMaior = 0;
		int mediaMaior = 0;
		int j = 0;
		int n = 0;
		int i ;

		for(i = 0; i < A.length; i++){
			A[i] = i + 1;
			if(A[i] < 15){
				somaMenor += A[i];
				System.out.println("Menor que 15 => " + A[i]);
			}else if(A[i] > 15){
				somaMaior += A[i];
				j++;
			}else{
				n++;
			}
		}
		mediaMaior = somaMaior/j;
		System.out.println("Soma menor que 15 = " + somaMenor);
		System.out.println("Quantos iguais a 15 = " + n);
		System.out.println("M�dia maior que 15 = " + mediaMaior);
		
		//Exerc�cio 17 - Ler 10 elementos de IDADE e escrever quantos acima de 35;
		int j = 0;
		int[] idade = new int[10];

		for(int i = 0;i < 10; i++){
			System.out.println("Digite a " + (i+1) + "� idade: ");
			idade[i] = scan.nextInt();
			
		if(idade[i] > 35){
			j++;
		}	
		}

		System.out.println("Existe " + j + " pessoas acima de 35 anos.");
		
		//Exerc�cio 18 - Ler 10 elementos de IDADE, escrever a maior e a menor assim como suas respectivas posi��es;
		int j = 0;
		int[] idade = new int[10];
		int[] maior = new int[idade.length];
		int[] menor = new int[idade.length];
		int maiorPosicao = 0;
		int menorPosicao = 0;
		

		for(int i = 0;i < idade.length; i++){
			System.out.println("Digite a " + (i+1) + "� idade: ");
			idade[i] = scan.nextInt();
			
			if(i == 0){
					maior[i] = idade[i];
					menor[i] = idade[i];
					maiorPosicao = i;
					menorPosicao = i;
			}else{
				if(idade[i] > idade[i-1]){
					maior[i] = idade[i];
					maiorPosicao = i;
				}else if(idade[i] < idade[i-1]){
					menor[i] = idade[i];
					menorPosicao = i;
				}
			}
		}

		System.out.println("Maior idade � " + maior[maiorPosicao] + " na posi��o " + maiorPosicao);
		System.out.println("Menor idade � " + menor[menorPosicao] + " na posi��o " + menorPosicao);
		
		//Exerc�cio 19 - Ler 2 notas bimestrais para um conjunto de 10 alunos.
		//Mostrar as notas e m�dias referentes a cada aluno e se maior que 7 est� aprovado.
		String[] nome = new String[2];
		double[] nota = new double[nome.length*2];
		double[] media = new double[nome.length];
		double soma = 0;
		int k = 0;

		for(int i = 0;i < nome.length; i++){
			System.out.println("Digite o nome do " + (i+1) + "� aluno: ");
			nome[i] = scan.next();
			
			for(int j = 0;j < 2; j++){
				System.out.println("Digite a " + (j+1) + "� nota do aluno: ");
				nota[k] = scan.nextDouble();
				k++;
			}
		}

		k=0;
		for(int i = 0;i < nome.length; i++){
			System.out.print(nome[i]);

			for(int j = 0;j < 2; j++){
				System.out.print(" | " + nota[k]);
				soma += nota[k];
				k++;
			}

			media[i] = soma/2;
			System.out.print(" | " + media[i]);
			
			if(media[i] >= 7 ){
				System.out.print(" | " + "Aprovado!");
			}else{
				System.out.print(" | " + "Reprovado!");
			}
			
			soma = 0;
		}
		

		//Exerc�cio 20 - Cota��o do d�lar em rela��o ao real, vetor com 20 elementos.

		double cotacao;
		double[] vetorA = new double[10];

		System.out.println("Qual a cota��o do d�lar? ");
		cotacao = scan.nextDouble();

		DecimalFormat df = new DecimalFormat("###,###.##");
		
		for(int i = 0; i < vetorA.length; i++){
			vetorA[i] = cotacao * (i+1);
			System.out.println(df.format(vetorA[i]));
		}
*/		
		//Exerc�cio 21 - n�o existe

		//Exerc�cio 22 - Gerar aleat�riamente um vetor com 10 elementos inteiros
		//Iguais a 0 e 1 e informar o percentual da quantidade de cada n�mero

		int[] vetorA = new int[10];
		int countA0 = 0;
		int countA1 = 0;
		int i;
		
		Random ran = new Random(); 


		for(i = 0;i < vetorA.length; i++){
			vetorA[i] = ran.nextInt(i) * 100;
			System.out.println(vetorA[i]);
		}
		for(i = 0;i < vetorA.length; i++){
			if(vetorA[i] == 0){
				countA0++;
			}else{
				countA1++;
			}
		}

		System.out.println("Percentual de 1 - " + ((i/100)*countA1) + "%.");
		System.out.println("Percentual de 0 - " + ((i/100)*countA0) + "%.");
		/*		
		//Exerc�cio 23 - Vetor 10 Elementos. Verificar se s�o pares.
		//Se um elemento n�o for par o programa para. Utilizar vari�vel do tipo FLAG

		int[] vetorA = new int[10];

		for(int i = 0;i < vetorA.length; i++){
			
			System.out.println("Digite um n�mero: ");
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] % 2 != 0){
				break;
		}
		}

		//Exerc�cio 24 - Verificar em um vetor de 10 elementos se s�o Pal�ndromos 

		int[] vetorA = new int[10];
		System.out.println("Digite 10 n�meros: ");

		for(int i = 0 ;i < vetorA.length; i++){
			vetorA[i] = scan.nextInt();
		}

		int j = 0;
		for(int i =  vetorA.length;i > vetorA[j]; i--){
			if(vetorA[j] != (vetorA.length - j)){
				System.out.println("N�o � um pal�ndromo.");
				break;
		}
		}

		//Exerc�cio 25 - Vetores A e B, B recebe 1 quando A for par e 0 quando impar

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];

		System.out.println("Digite 10 n�meros: ");
		for(int i = 0 ;i < vetorA.length; i++){
			vetorA[i] = scan.nextInt();

		if(vetorA[i] % 2 == 0){
				vetorB[i] = 1;
			}else{
			vetorB[i] = 0;
		}
			System.out.println("A["+i+"]"+" - B["+i+"]");
		}


		//Exerc�cio 26 - Vetores A, B e c, C=1 quando A>B
		//C=0 quando A=B
		//C=-1 quando A<B.

		double[] vetorA = new double[10];
		double[] vetorB = new double[10];
		double[] vetorC = new double[10];

		System.out.println("Digite 10 n�meros de A: ");
		for(int i = 0 ;i < vetorA.length; i++){
			vetorA[i] = scan.nextInt();
		}

		System.out.println("Digite 10 n�meros de B: ");
		for(int i = 0 ;i < vetorB.length; i++){
			vetorB[i] = scan.nextInt();
		}

		for(int i = 0 ;i < vetorC.length; i++){

		if(vetorA[i] > vetorB[i]){
				vetorC[i] = 1;
			}else if(vetorA[i] == vetorB[i]){
			vetorC[i] = 0;
		}else{
				vetorC[i] = -1;
			}
			System.out.println(vetorA[i] + " - " + vetorB[i] + " = " vetorC[i]);
		}

		//27 - vetor A e B, B = A quando A < 7. 

		double[] vetorA = new double[10];
		char[] vetorB = new char[10];

		for(int i = 0; i < 10; i++){
			System.out.println("Digite o "+ (i+1) +"� de 10 n�meros.");
		vetorA = scan.next

		if(vetorA[i] < 7){
				vetorB[i] = "a";
			}else if(vetorA[i] == 7){
				vetorB[i] = "b";
			}else if(vetorA[i] > 7 && vetorA[i] < 10){
				vetorB[i] = "c";
			}else if(vetorA[i] == 10){
				vetorB[i] = "d";
			}else if(A[i] > 10){
				B[i] = "e";
		}
			System.out.println("A = "+vetorA[i]+" e B = "+vetorB[i]);
		}

		//28 - Vetor A e B de 10 posi��es sendo o primeiro de A o �ltimo de B e assim por diante.

		double[] vetorA = new double[10];
		double[] vetorB = new double[10];

		for(int i = 0; i < 10; i++){
			System.out.println("Digite o "+ (i+1) +"� de 10 n�meros.");
			vetorA[i] = scan.next;
			int c = vetorA.length();
			vetorB[c-i] = vetorA[i];
		}
		for(int i = 0; i < 10; i++){
				System.out.println("A na posi��o "+ i + " = " + vetorA[i] + "e vetorB na posi��o " + i + " = " + vetorB[i]);
		}

		//29 - Vetor A e B 10 elementos cada. Vetor C dever� ter 20 elementos, os 10 primeiros de A e os 10 �ltimos de B.

		double[] vetorA = new double[10];
		double[] vetorB = new double[10];
		double[] vetorC = new double[20];

		for(int i = 0; i < 10; i++){
			System.out.println("Digite o "+ (i+1) +"� de 10 n�meros de A.");
			vetorA[i] = scan.next;
			System.out.println("Digite o "+ (i+1) +"� de 10 n�meros de B.");
			vetorB[i] = scan.next;
		}
		int j = 0; 
		for(int i = 0; i < 20; i++){
			if(i < 10){
				vetorC[i] = vetorA[i];
				System.out.println("A = " + vetorA[i] + " - " + "C = " + vetorC[i]);
		}else{
				vetorC[i] = vetorB[j];
				System.out.println("B = " + vetorB[i] + " - " + "C = " + vetorC[i]);
				j++;
			}
		}

		//30 - Vetor A com 20 elementos. B com os pares e C com impares de A. 

		double[] vetorA = new double[20];
		double[] vetorB = new double[10];
		double[] vetorC = new double[10];

		int j = 0;
		int n = 0;

		for(int i = 0; i < 20; i++){
			System.out.println("Digite o "+ (i+1) +"� de 20 n�meros de A.");
			vetorA[i] = scan.next;

			if(vetorA[i] % 2 == 0){
				vetorB[j] = vetorA[i];
				j++;
			}else{
				vetorC[n] = vetorA[i];
		n++;
		}
		}
		for(int i = 0; i < 10; i++){
			System.out.println("B = " + vetorB[i] + " e vetorC = "+ C[i]);
		}


		//31 - Vetor A com 20 elementos. Os primeiros de B com os pares e os �ltimos com impares de A. 
		double[] vetorA = new double[20];
		double[] vetorB = new double[20];
		int n = vetorA.length();


		for(int i = 0; i < 20; i++){
			System.out.println("Digite o "+ (i+1) +"� de 20 n�meros de A.");
			vetorA[i] = scan.next;

			if(vetorA[i] % 2 == 0){
				vetorB[i] = vetorA[i];
			}else{
				vetorB[i - n] = vetorA[i];
			}
		}
		for(int i = 0; i < 20; i++){
			System.out.println("A = " + vetorA[i] + " e B = "+ vetorB[i]);
		}

		//32 - Vetor A com 5. Mostrar tabuada de cada n�mero. 
		int[] vetorA = new int[5];

		for(int i = 0; i < 5; i++){
		System.out.println("Digite o "+ (i+1) +"� de 5 n�meros de A.");
			vetorA[i] = scan.next;
			
			for(int j = 0; j <= 10 ; j++){
				int total;
			total = vetorA[i] * i;
			System.out.println(i + " x " + vetorA[i] + " = " + total);
		}	
		}

		//33 - Imprimir 10 elemento de um vetor A e dizer se � primo ou n�o. 
		int[] vetorA = new int[10];


		for(int i = 0; i < 10 ; i++){
			vetorA[i] = i;	
		}

		for(int i = 0; i < 10 ; i++){
			vetorA[i] = i;	
		}

*/
	}

}
