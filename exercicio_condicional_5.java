package exercicios_condicional;

import java.util.Scanner;

public class exercicio_condicional_5 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	
	float nota1, nota2, nota3, nota4, media;
	int matricula;
	
	System.out.print("Digite a sua matrícula: ");
	matricula = leitor.nextInt();
	System.out.print("Digite sua nota 1 em Física: ");
	nota1 = leitor.nextFloat();
	System.out.print("Digite sua nota 2 em Física: ");
	nota2 = leitor.nextFloat();
	System.out.print("Digite sua nota 3 em Física: ");
	nota3 = leitor.nextFloat();
	System.out.print("Digite sua nota 4 em Física: ");
	nota4 = leitor.nextFloat();
	
	media = (nota1+nota2+nota3+nota4)/4;
	
	if( media >= 7) {
		System.out.print("Você foi aprovado!");
	}
	else if( media >= 3.5 && media <7 )	{
		System.out.print("Você está de recuperação!");
	}
	
	else
		System.out.print("Você está reprovado!");
	
	}
	
	
	
	}


